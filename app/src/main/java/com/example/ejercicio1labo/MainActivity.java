package com.example.ejercicio1labo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    Button btn;
    EditText user;
    EditText pass;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = findViewById(R.id.boton);
         user = findViewById(R.id.username);
         pass = findViewById(R.id.password);
         texto = findViewById(R.id.texto);

        btn.setOnClickListener(this);
        btn.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View v) {

        texto.setText(user.getText());

    }

    @Override
    public boolean onLongClick(View v) {

        texto.setText(pass.getText());

        return false;
    }
}
