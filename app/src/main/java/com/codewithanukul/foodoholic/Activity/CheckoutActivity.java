package com.codewithanukul.foodoholic.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codewithanukul.foodoholic.R;

public class CheckoutActivity extends AppCompatActivity {
TextView textView14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        textView14 = findViewById(R.id.textView14);
    }
}