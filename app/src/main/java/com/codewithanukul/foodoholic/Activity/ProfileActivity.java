package com.codewithanukul.foodoholic.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codewithanukul.foodoholic.R;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {
    TextView textView;
    TextView textTxt8;
    TextView textTxt2;
    TextView textTxt9;
    TextView textTxt7;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView = findViewById(R.id.textView10);
        textView = findViewById(R.id.textTxt1);
        textView = findViewById(R.id.textTxt2);
        textView = findViewById(R.id.textTxt3);
        textView = findViewById(R.id.textTxt4);
        textView = findViewById(R.id.textTxt5);
        textView = findViewById(R.id.textTxt6);
        textView = findViewById(R.id.textTxt7);
        textView = findViewById(R.id.textTxt8);
        textView = findViewById(R.id.textTxt9);
        textView = findViewById(R.id.textTxt10);

        imageView = findViewById(R.id.imageView);
        textTxt8=findViewById(R.id.textTxt8);
        textTxt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,IntroActivity.class));
            }
        });
        textTxt2=findViewById(R.id.textTxt2);
        textTxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,OrderHistoryActivity.class));
            }
        });
        textTxt7=findViewById(R.id.textTxt7);
        textTxt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,PaymentsActivity.class));
            }
        });
        textTxt9=findViewById(R.id.textTxt9);
        textTxt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,PhotoActivity.class));
            }
        });

    }
}
