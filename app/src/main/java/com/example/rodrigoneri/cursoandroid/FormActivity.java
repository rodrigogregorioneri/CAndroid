package com.example.rodrigoneri.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_form);

    Button botao_salvar = (Button) findViewById(R.id.formulario_salvar);

    botao_salvar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(getBaseContext(), "teste",Toast.LENGTH_SHORT).show();

      }
    });

  }
}
