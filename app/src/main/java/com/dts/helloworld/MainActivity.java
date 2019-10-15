package com.dts.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int skorA = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lain);
    }

    public void tambah3PoinA(View view) {
        skorA += 3;
        TextView textViewA = findViewById(R.id.skorA);
        textViewA.setText(String.valueOf(skorA));
    }

    public void tambah2PoinA(View view) {
    }

    public void tambah1PoinA(View view) {

    }
}
