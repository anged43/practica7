package com.example.angel.practica7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buelta = (Button)findViewById(R.id.bu);
        buelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vi = new Intent(MainActivity.this, vibrar.class);
                startActivity(vi);
            }
        });
    }
}
