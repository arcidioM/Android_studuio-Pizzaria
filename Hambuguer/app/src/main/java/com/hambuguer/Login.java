package com.hambuguer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private TextView text_tela_cadastro;
    private Button btEntrar;
    private EditText edit_senha;
    private EditText edit_usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        iniciarComponentes();
        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edit_usuario.getText().toString();
                String senha = edit_senha.getText().toString();

                if(nome.equals("Arcidio")&&(senha.equals("1234"))){
                    Toast.makeText(Login.this, "Valido", Toast.LENGTH_SHORT).show();
                    Intent intentEntrar = new Intent(Login.this,Menu.class);
                    startActivity(intentEntrar);
                }else{
                    Toast.makeText(Login.this, "Invalido", Toast.LENGTH_SHORT).show();
                }
                edit_usuario.setText("");
                edit_senha.setText("");

            }
        });

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Cadastro.class);
                startActivity(intent);
            }
        });
    }
    private void iniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
        btEntrar = (Button)findViewById(R.id.bt_entrar);
        edit_usuario = (EditText)findViewById(R.id.edit_usuario);
        edit_senha = (EditText)findViewById(R.id.edit_senha);

    }
}