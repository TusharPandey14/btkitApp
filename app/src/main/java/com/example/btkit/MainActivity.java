package com.example.btkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSignIn;
    Button btnStaff, btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSignIn = findViewById(R.id.tvSignIn);
        btnStaff = findViewById(R.id.btnStaff);
        btnStudent = findViewById(R.id.btnStudent);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,activity_login_student.class);
                startActivity(intent);


            }

        });
        btnStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this,login_staff.class);
            }
        });
    }


}





