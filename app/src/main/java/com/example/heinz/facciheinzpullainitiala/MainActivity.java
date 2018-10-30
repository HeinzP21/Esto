package com.example.heinz.facciheinzpullainitiala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText temperatura;
    Button  conversion;
    RadioButton celciAfare, fareAcelci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        temperatura = (EditText)findViewById(R.id.valor);
        conversion = (Button)findViewById(R.id.convertir);
        celciAfare = (RadioButton)findViewById(R.id.celciAfare);
        fareAcelci = (RadioButton)findViewById(R.id.fareAcelci);

        conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = new Double(temperatura.getText().toString());
                if (fareAcelci.isChecked())
                    temp = Transformar.CelsiusAFare(temp);
                else temp = Transformar.FareACelsius(temp);
                temperatura.setText(new Double(temp).toString());
            }
        });
    }
}
