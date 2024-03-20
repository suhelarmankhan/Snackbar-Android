package com.tecoditlimited.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowSnackbar = findViewById(R.id.btnShowSnackbar);
        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show a Snackbar
             Snackbar snackbar =   Snackbar.make(view, "This is a Snackbar", Snackbar.LENGTH_LONG);
             snackbar.setAction("Open", new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
// Action to perform when the action button on the Snackbar is clicked
                     // For example, you can open another activity or perform some other action
                     // Here, we'll just display a toast message
                     Toast.makeText(MainActivity.this, "Open button clicked", Toast.LENGTH_SHORT).show();

                 }
             });
             snackbar.show();



            }
        });

    }
}