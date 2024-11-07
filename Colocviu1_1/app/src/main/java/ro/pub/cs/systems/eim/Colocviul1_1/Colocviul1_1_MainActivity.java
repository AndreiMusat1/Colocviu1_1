package ro.pub.cs.systems.eim.Colocviu1_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ro.pub.cs.systems.eim.Colocviul1_1.R;

public class Colocviul1_1_MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private StringBuilder resultBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviu1_1_main);

        textViewResult = findViewById(R.id.textViewResult);
        resultBuilder = new StringBuilder();

        // Setează acțiunile pentru fiecare buton
        Button buttonNorth = findViewById(R.id.buttonNorth);
        Button buttonSouth = findViewById(R.id.buttonSouth);
        Button buttonEast = findViewById(R.id.buttonEast);
        Button buttonWest = findViewById(R.id.buttonWest);

        buttonNorth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResult("NORTH");
            }
        });

        buttonSouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResult("SOUTH");
            }
        });

        buttonEast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResult("EAST");
            }
        });

        buttonWest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateResult("WEST");
            }
        });

        // Buton pentru navigare la activitatea secundară
        Button buttonNavigate = findViewById(R.id.buttonNavigate);
        buttonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ro.pub.cs.systems.eim.Colocviu1_1.Colocviul1_1_MainActivity.this, ro.pub.cs.systems.eim.Colocviu1_1.SecondaryActivity.class);
                startActivity(intent);
            }
        });
    }

    // Funcție pentru a actualiza caseta de text cu direcția apăsată
    private void updateResult(String direction) {
        if (resultBuilder.length() > 0) {
            resultBuilder.append(", ");
        }
        resultBuilder.append(direction);
        textViewResult.setText(resultBuilder.toString());
    }
}
