package com.example.drivetomsu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText startPoint = findViewById(R.id.startpoint);
        Button navigate = findViewById(R.id.Direction);


       //create button activity
        navigate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //get start points
                String starting = startPoint.getText().toString();
                //replace uri with startPoint and montclair state university
                Uri uri = Uri.parse("https://www.google.com/maps/dir/"+ starting +"/"+"montclair state university");
                //intent to the google map page
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }
}