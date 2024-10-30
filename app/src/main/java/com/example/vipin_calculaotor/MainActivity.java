package com.example.vipin_calculaotor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                try {
                    int Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                    int Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());
                    int ans = Firstvalue + Secondvalue;
                    txtans.setText("Ans is = " + ans);
                } catch (NumberFormatException e) {
                    showToast("Invalid input. Please enter numbers only.");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                    int Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());
                    int ans = Firstvalue - Secondvalue;
                    txtans.setText("Ans is = " + ans);
                } catch (NumberFormatException e) {
                    showToast("Invalid input. Please enter numbers only.");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                    int Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());
                    int ans = Firstvalue * Secondvalue;
                    txtans.setText("Ans is = " + ans);
                } catch (NumberFormatException e) {
                    showToast("Invalid input. Please enter numbers only.");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int Firstvalue = Integer.parseInt(editFirstvalue.getText().toString());
                    int Secondvalue = Integer.parseInt(editSecondvalue.getText().toString());
                    if (Secondvalue == 0) {
                        showToast("Cannot divide by zero.");
                    } else {
                        int ans = Firstvalue / Secondvalue;
                        txtans.setText("Ans is = " + ans);
                    }
                } catch (NumberFormatException e) {
                    showToast("Invalid input. Please enter numbers only.");
                } catch (ArithmeticException e) {
                    showToast("Arithmetic error occurred.");
                }
            }
        });


    }
    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}