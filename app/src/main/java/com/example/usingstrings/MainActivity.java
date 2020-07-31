package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtvMsg2 = findViewById(R.id.TvMsg2);
        txtvMsg2.setText(R.string.Msg2);
        Log.i(TAG, "onCreate: ");


    }
    public void onStart() {

        super.onStart();
        Log.i(TAG, "onStart: ");
    }
    public void onRestart() {

        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
    public void onResume() {

        super.onResume();
        Log.i(TAG, "onResume: ");
    }

}