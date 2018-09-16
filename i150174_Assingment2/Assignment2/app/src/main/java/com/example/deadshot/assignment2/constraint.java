package com.example.deadshot.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class constraint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_constraint);

        Button but = (Button) findViewById(R.id.signin);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox check = (CheckBox) findViewById(R.id.check);
                EditText email = (EditText) findViewById(R.id.Email);
                EditText pass = (EditText) findViewById(R.id.Password);
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioSex);

                int selectedId = radioGroup.getCheckedRadioButtonId();

                RadioButton radBut = (RadioButton)findViewById(selectedId);

                if(check.isChecked()){
                    Toast.makeText(getApplicationContext(), "Email = " + email.getText().toString() + "\nPassword = " + pass.getText().toString() + "\nGender = " + radBut.getText().toString() + "\nTerms and Conditions Checked",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "You should accept the Terms and Conditions to Continue.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
