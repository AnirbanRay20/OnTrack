package com.training.ontrack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminDetails extends AppCompatActivity {

    Button PassengerDertilsButton, DriverDetailsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_details);

        PassengerDertilsButton=findViewById(R.id.btnAdminPassengers);
        DriverDetailsButton=findViewById(R.id.btnAdminDrivers);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PassengerDertilsButton.setOnClickListener(v -> {
            startActivity(new Intent(AdminDetails.this, AdminPassengerDetails.class));
        });

        DriverDetailsButton.setOnClickListener(v -> {
            startActivity(new Intent(AdminDetails.this, AdminDriverDetails.class));
        });

    }
}