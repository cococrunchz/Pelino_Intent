package com.example.pelino_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
             //class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.btn_next);

        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        TextView displa = findViewById(R.id.display);
        EditText input = findViewById(R.id.txtMonthValue);

        Intent i = new Intent(MainActivity.this,activity2.class);

        int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

        switch (v.getId()) {
            case R.id.btn_next:

                i.putExtra("INTMONTHS", numberMonths);

                startActivity(i);
                break;



        }


    }
}