#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_mycandcpp_mycandcpp_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Thank you so much :)";
    return env->NewStringUTF(hello.c_str());
}
