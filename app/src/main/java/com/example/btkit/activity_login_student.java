package com.example.btkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class login_Student extends AppCompatActivity {
    EditText etStudent_id,etStudent_Pass;
    Button btnSi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);
        etStudent_id=findViewById(R.id.etStudent_Id);
        etStudent_Pass=findViewById(R.id.etStudent_Pass);
        btnSi2=findViewById(R.id.btnSi2);

        btnSi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etStudent_id.getText().toString().equals("2020ECE33@btkit.ac.in") && etStudent_Pass.getText().toString().equals("54321")) {
                    Toast.makeText(login_Student.this, "LOGIN SUCESSFUL", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(login_Student.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });



}

}