package com.example.vipin_calculaotor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editFirstvalue,editSecondvalue;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView txtans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstvalue = (EditText) findViewById(R.id.edit1);
        editSecondvalue =(EditText) findViewById(R.id.edit2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtans = findViewById(R.id.txtAns);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Firstvalue,Secondvalue,ans;
                Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());

                ans = Firstvalue + Secondvalue;
                txtans.setText("Ans is = "+ans);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Firstvalue,Secondvalue,ans;
                Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());

                ans = Firstvalue - Secondvalue;
                txtans.setText("Ans is = "+ans);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,ans;
                first = Integer.parseInt(editFirstvalue.getText().toString());
                second = Integer.parseInt(editSecondvalue.getText().toString());

                ans = first * second;
                txtans.setText("Ans is = "+ans);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Firstvalue,Secondvalue,ans;
                Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());

                ans = Firstvalue / Secondvalue;
                txtans.setText("Ans is = "+ans);
            }
        });


    }
}