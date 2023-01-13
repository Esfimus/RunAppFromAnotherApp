package com.example.runappfromanotherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runCalculator();
    }

    private void runCalculator() {
        findViewById(R.id.run_calculator).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("calculator://launch"));
            try {
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this, "App is not found!", Toast.LENGTH_LONG).show();
            }
        });
    }
}