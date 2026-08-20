
package com.jeevanrakshak.mockpilot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAlert = findViewById(R.id.btnAlert);
        Button btnMap = findViewById(R.id.btnMap);
        Button btnHelp = findViewById(R.id.btnHelp);

        btnAlert.setOnClickListener(v -> {
            Toast.makeText(this, "TEST: 10000 logo ko Alert gaya - City A", Toast.LENGTH_LONG).show();
        });

        btnMap.setOnClickListener(v -> {
            Toast.makeText(this, "TEST MAP: Hara=Safe, Lal=Danger", Toast.LENGTH_LONG).show();
        });

        btnHelp.setOnClickListener(v -> {
            Toast.makeText(this, "TEST: Ambulance ko call lag rahi hai", Toast.LENGTH_LONG).show();
        });
    }
}
