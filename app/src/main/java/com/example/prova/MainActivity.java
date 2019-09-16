package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView pippo;
    private Button ignazio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pippo=findViewById(R.id.message);
        Visualizza();
        Button ignazio=findViewById(R.id.button);
        ignazio.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Visualizza2();
                    }
                }
        );
    }
    public void Visualizza(){
        Toast.makeText(this, "ciao", Toast.LENGTH_SHORT).show();
        Visualizza2();
    }
    public void Visualizza2(){
        Intent i = new Intent(this, Altra.class);
        startActivity(i);
    }
}
