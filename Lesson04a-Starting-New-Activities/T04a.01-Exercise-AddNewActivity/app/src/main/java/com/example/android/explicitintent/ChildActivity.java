package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    // Do steps 6 & 7 in ChildActivity.java
    // COMPLETE (6) Create a TextView field to display your message

    // Points to the "tv_display" TextView in in the activity_child layout
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        // COMPLETE (7) Get a reference to your TextView in Java
        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}
