package com.android.jnidemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.jnidemo.JNITest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_content).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JNITest tmp = new JNITest();
                String str = tmp.getStr();
                Log.e("test", "qwerty " + str + tmp.getMax(12, 21));
            }
        });
    }
}