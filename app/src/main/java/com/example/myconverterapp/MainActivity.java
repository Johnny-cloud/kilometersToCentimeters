package com.example.myconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertKilometersToCentimeters(View view) {
        EditText editText = (EditText) findViewById(R.id.edtText);

        int kilometers = Integer.parseInt(editText.getText().toString());
        int centimeters = 100000;

        double result = kilometers * centimeters ;

        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }
}
