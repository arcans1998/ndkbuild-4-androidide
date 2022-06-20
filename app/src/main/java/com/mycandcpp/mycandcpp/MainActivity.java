package com.mycandcpp.mycandcpp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import com.mycandcpp.mycandcpp.databinding.ActivityMainBinding;
import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding binding;
    
	static {
        System.loadLibrary("hello");
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		// Remove this line if you don't want AndroidIDE to show this app's logs
		LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        // Inflate and get instance of binding
		binding = ActivityMainBinding.inflate(getLayoutInflater());
        // set content view to binding's root
        setContentView(binding.getRoot());
        Toast.makeText(getApplicationContext(),stringFromJNI(),Toast.LENGTH_LONG).show();
    }
    
   public native String stringFromJNI();
}
