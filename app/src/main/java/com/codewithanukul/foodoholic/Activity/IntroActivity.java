package com.codewithanukul.foodoholic.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

import com.codewithanukul.foodoholic.R;

public class IntroActivity extends AppCompatActivity {
    ConstraintLayout startBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        startBtn = findViewById(R.id.startBtn);

        startBtn.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));
    }
}