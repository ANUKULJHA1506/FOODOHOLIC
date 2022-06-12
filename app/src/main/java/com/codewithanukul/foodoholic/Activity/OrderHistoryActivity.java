package com.codewithanukul.foodoholic.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.codewithanukul.foodoholic.R;

public class OrderHistoryActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        imageView = (ImageView) (findViewById(R.id.imageView9));
        textView = (TextView) (findViewById(R.id.textView));
    }
}
