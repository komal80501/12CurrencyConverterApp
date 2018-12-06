package com.example.hp.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button euro,pound,dollar,bitcoin, ruble,ausdollar,candollar,yen,dinar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        dollar=findViewById(R.id.dollar);
        bitcoin=findViewById(R.id.bitcoin);
        ruble =findViewById(R.id.ruble);
        ausdollar=findViewById(R.id.ausdollar);
        candollar=findViewById(R.id.candollar);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n * 0.012;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n /90.02;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.000");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n /70.67;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n / 263021.74;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n / 1.06;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n / 51.28;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n /52.84 ;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n / 0.624;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z=editText.getText().toString();
                if (TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);
                    textView.setText(null);
//                    Formatter formatter= new Formatter();
                    k = n / 0.0593242;
                    //display two places after decimal
                    DecimalFormat decimalFormat= new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(k));
                }
            }
        });
    }
}
