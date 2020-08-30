package com.android.jnidemo;

public class JNITest {

    static {
        System.loadLibrary("native-lib");
    }

    public native String getStr();

    public native int getMax(int a, int b);

}
