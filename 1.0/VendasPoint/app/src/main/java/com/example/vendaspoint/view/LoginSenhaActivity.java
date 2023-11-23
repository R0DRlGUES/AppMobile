package com.example.vendaspoint.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vendaspoint.R;
import com.example.vendaspoint.controller.LoginSenhaController;

public class LoginSenhaActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText editTextSenha;
    private EditText editTextLogin;
    private EditText editVendasPoint;
    private LoginSenhaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btnLogin = findViewById(R.id.btnLogin);

        // Defina o ouvinte de clique para chamar a função de login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RealizarLogin();
            }
        });

    }

    public void onClick(DialogInterface dialogInterface, int i) {

    }
    private void RealizarLogin() {
        editTextSenha = findViewById(R.id.editTextSenha);
        editTextLogin = findViewById(R.id.editTextLogin);
        btnLogin = findViewById(R.id.btnLogin);

        validaLogin(editTextSenha, editTextLogin);
    }

    private void validaLogin(EditText editTextSenha, EditText editTextLogin) {
        String login = "Admin";
        String senha = "0000";

        if (login == String.valueOf(editTextLogin)) {

            if (senha == String.valueOf(editTextSenha)) {

            } else {
                Toast.makeText(this, "Senha Incorreta", Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(this, "Login Incorreto", Toast.LENGTH_LONG).show();

        }
    }


}