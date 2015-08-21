package com.example.joshuaoconnor.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.joshuaoconnor.calculator.R;

public class MyCalculator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calculator);

        // Defining onclick listener for finding the result
        OnClickListener listener = new OnClickListener() {

            @Override
            public void onClick(View v) {
                Spinner spr = (Spinner) findViewById(R.id.sprOperator);
                EditText edtNumber1 = ( EditText) findViewById(R.id.edtNumber1);
                EditText edtNumber2 = ( EditText) findViewById(R.id.edtNumber2);
                EditText edtResult = ( EditText) findViewById(R.id.edtResult);

                String selectedItem = (String) spr.getSelectedItem();


                if(selectedItem.trim().equals("+")){
                    float result = Float.parseFloat(edtNumber1.getText().toString())  + Float.parseFloat(edtNumber2.getText().toString());
                    edtResult.setText(Float.toString(result));
                }else if(selectedItem.trim().equals("-")){
                    float result = Float.parseFloat(edtNumber1.getText().toString())  - Float.parseFloat(edtNumber2.getText().toString());
                    edtResult.setText(Float.toString(result));
                }else if(selectedItem.trim().equals("x")){
                    float result = Float.parseFloat(edtNumber1.getText().toString())  * Float.parseFloat(edtNumber2.getText().toString());
                    edtResult.setText(Float.toString(result));
                }else if(selectedItem.trim().equals("/")){
                    float result = Float.parseFloat(edtNumber1.getText().toString())  / Float.parseFloat(edtNumber2.getText().toString());
                    edtResult.setText(Float.toString(result));
                }


            }
        };


        // Getting reference of the button btnResult 
        Button btn = (Button) findViewById(R.id.btnResult);

        // Setting onclick listener 
        btn.setOnClickListener(listener);


    }
}