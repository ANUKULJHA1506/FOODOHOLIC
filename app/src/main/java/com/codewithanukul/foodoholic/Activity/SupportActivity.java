package com.codewithanukul.foodoholic.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.codewithanukul.foodoholic.R;

public class SupportActivity extends AppCompatActivity {
    TextView textView;
    TextView textTxt11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        textView = findViewById(R.id.textTxt11);
        textView = findViewById(R.id.textTxt12);
        textView = findViewById(R.id.textTxt13);

        textTxt11=(findViewById(R.id.textTxt11));
        textTxt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SupportActivity.this,HelpActivity.class));
            }
        });
    }
}
