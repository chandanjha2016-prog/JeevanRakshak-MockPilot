
package com.chandan.jeevanrakshak;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alertBtn = findViewById(R.id.btn_alert);
        Button mapBtn = findViewById(R.id.btn_map);
        Button helpBtn = findViewById(R.id.btn_help);

        alertBtn.setOnClickListener(v -> 
            Toast.makeText(this, "TEST ALERT: This is Mock Pilot - No real data", Toast.LENGTH_LONG).show());
        mapBtn.setOnClickListener(v -> 
            Toast.makeText(this, "Test Safe Route Map - Mock Demo", Toast.LENGTH_SHORT).show());
        helpBtn.setOnClickListener(v -> 
            Toast.makeText(this, "Test Help Button Pressed - 7739285002", Toast.LENGTH_SHORT).show());
    }
}
