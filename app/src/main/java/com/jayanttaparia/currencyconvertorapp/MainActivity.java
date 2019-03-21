package com.jayanttaparia.currencyconvertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollarAmountEditText = (EditText)findViewById(R.id.dollarAmountEditText);

        Double dollarAmount = Double.parseDouble(dollarAmountEditText.getText().toString());

        Double INR = dollarAmount * 70.45;

        Toast.makeText(MainActivity.this,"Rs." +  String.format("%.2f", INR), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
