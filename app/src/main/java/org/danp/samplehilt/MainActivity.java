package org.danp.samplehilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    MathOperation mathOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMultip = findViewById(R.id.btnMultip);
        Button btnSum = findViewById(R.id.btnSum);
        TextView txtResult = findViewById(R.id.txtResult);

        EditText edtNumberA = findViewById(R.id.edtNumberA);
        EditText edtNumberB = findViewById(R.id.edtNumberB);

        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edtNumberA.getText().toString());
                double b = Double.parseDouble(edtNumberB.getText().toString());

                double c = mathOperation.Multiplication(a, b);
                txtResult.setText("Result: " + c);

            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edtNumberA.getText().toString());
                double b = Double.parseDouble(edtNumberB.getText().toString());

                double c = mathOperation.Sum(a, b);
                txtResult.setText("Result: " + c);

            }
        });

    }
}