package com.training.ontrack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminLoginPage extends AppCompatActivity {

    Button Login, Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_login_page);
        Login=findViewById(R.id.btnLoginAdmin);
        Register=findViewById(R.id.btnRegisterAdmin);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Login.setOnClickListener(v -> {
            startActivity(new Intent(AdminLoginPage.this, AdminDetails.class));
        });
        Register.setOnClickListener(v -> {
            startActivity(new Intent(AdminLoginPage.this, AdminRegister.class));
        });

    }
}