package com.example.btkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_staff extends AppCompatActivity {
    EditText etStaff_Id, etStaff_Pass;
    Button btnSi1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_staff);
        etStaff_Id = findViewById(R.id.etStudent_Id);
        etStaff_Pass = findViewById(R.id.etStudent_Pass);
        btnSi1 = findViewById(R.id.btnSi2);

        btnSi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etStaff_Id.getText().toString().equals("abc1232btkit.ac.in") && etStaff_Pass.getText().toString().equals("12345")) {
                    Toast.makeText(login_staff.this, "LOGIN SUCCESSFUL !!! ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(login_staff.this, "LOGIN FAILED !!! ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}








