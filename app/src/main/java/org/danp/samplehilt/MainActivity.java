package org.danp.samplehilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

    @Inject
    Vehicle vehicle;

    @Inject
    Escuela escuela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int speed = vehicle.getSpeed();
        Log.d("MainActivity", speed + "km/h");

//Escuela escuela=new Escuela(new Director());
        escuela.setDirectorName("Frank");

        String name = escuela.getDirectorName();

        Log.d("MainActivity: ", name);


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

                double c = 23;//mathOperation.Multiplication(a, b);
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