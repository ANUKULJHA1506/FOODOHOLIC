package com.codewithanukul.foodoholic.Activity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.codewithanukul.foodoholic.R;

public class PaymentsActivity extends AppCompatActivity {
    EditText editText,editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
    }
}
