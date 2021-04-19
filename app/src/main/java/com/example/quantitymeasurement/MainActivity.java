package com.example.quantitymeasurement;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Spinner Spinner, fromUnitSpinner, toUnitSpinner;
    String selectedType, fromUnit, toUnit;
    private EditText input;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner = findViewById(R.id.Spinner);
        input = findViewById(R.id.editInputValue);
        fromUnitSpinner = findViewById(R.id.fromUnitSpinner);
        toUnitSpinner = findViewById(R.id.toUnitSpinner);
        result = findViewById(R.id.outputValue);
        button = findViewById(R.id.button);

        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedType = parent.getItemAtPosition(position).toString();
                switch (selectedType) {
                    case "Length":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.LengthUnits)));

                        toUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.LengthUnits)));
                        break;

                    case "Weight":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.WeightUnits)));
                        toUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.WeightUnits)));

                        break;

                    case "Volume":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.VolumeUnits)));

                        toUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.VolumeUnits)));
                        break;

                    case "Temperature":
                        fromUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.TemperatureUnits)));
                        toUnitSpinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.TemperatureUnits)));
                        break;
                }
                Spinner.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        fromUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fromUnit = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        toUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                toUnit = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        button.setOnClickListener(v -> {

            if(input.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this,"Please Enter a Value", Toast.LENGTH_SHORT).show();
                return;
            }
            int inputValue = Integer.parseInt(input.getText().toString());
            Converter converter = new Converter();
            String resultMessage = converter.calculateOutput(inputValue, selectedType, fromUnit, toUnit);
            Log.e("Spinner", "onCreate: resultMessage" + resultMessage);
            result.setText(resultMessage);
        });
    }
}