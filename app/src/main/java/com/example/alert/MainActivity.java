package com.example.alert;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder anAlert = new AlertDialog.Builder(MainActivity.this);
                anAlert.setIcon(R.drawable.ic_launcher_background);
                anAlert.setTitle("This is an alert demo");
                anAlert.setMessage("An alert statement Yes or NO");
                anAlert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You pressed YES", Toast.LENGTH_LONG).show();
                    }
                });
                anAlert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You pressed NO", Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog = anAlert.create();
                alertDialog.show();
            }
        });
    }
}