package com.training.ontrack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminPassengerDetails extends AppCompatActivity {


    TextView Passenger1,Passenger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_passenger_details);


        Passenger1 = findViewById(R.id.AdminTXTPassenger1);
        Passenger2 = findViewById(R.id.AdminTXTPassenger2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        Passenger1.setOnClickListener(v -> {
            startActivity(new Intent(AdminPassengerDetails.this, AdminPassengerInside1.class));
        });

    }
}