package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textviewResult, textViewTitle;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewResult = findViewById(R.id.result);
        textViewTitle = findViewById(R.id.textviewTitle);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double kilos_entered = Double.parseDouble(editText.getText().toString());
                textviewResult.setText(Double.toString(convertToPound(kilos_entered)) + "Libras");

            }
        });


    }

    public double convertToPound(double dato){

        return dato * 2.20462 ;
    }
}