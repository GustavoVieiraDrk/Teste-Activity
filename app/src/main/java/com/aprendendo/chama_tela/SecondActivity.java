package com.aprendendo.chama_tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView nome, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        User user = getIntent().getParcelableExtra("user");

        nome = findViewById(R.id.edtNome);
        email = findViewById(R.id.edtEmail);

        nome.setText(user.getName());
        email.setText(user.getEmail());


    }

    public void FinalizaApp(View view) {
        finish();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void btnSingUpAction(View view) {
    }

    public void btnLoginAction(View view) {
    }
}