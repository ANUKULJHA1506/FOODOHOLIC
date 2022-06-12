package com.codewithanukul.foodoholic.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.codewithanukul.foodoholic.R;

public class SettingsActivity extends AppCompatActivity {
    TextView textView;
    TextView textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        textView = findViewById(R.id.textView10);
        textView = findViewById(R.id.textView11);
        textView = findViewById(R.id.textView12);

        textView11= findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this,PolicyActivity.class));
            }
        });
    }
}
