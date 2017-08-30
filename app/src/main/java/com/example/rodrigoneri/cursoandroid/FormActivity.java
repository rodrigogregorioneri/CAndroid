package com.example.rodrigoneri.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_form);

    //Instanciando o elemnto Button do Layout XMl e guardando na variavel botao_salvar do tipo Button
    Button botao_salvar = (Button) findViewById(R.id.formulario_salvar);

    // Criando função de callback para executar o evento OnClick
    botao_salvar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Imprimindo mensagem com Toast
        Toast.makeText(getBaseContext(), "teste", Toast.LENGTH_SHORT).show();
        finish();

      }
    });

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
   MenuInflater inflate = getMenuInflater();
    inflate.inflate(R.menu.menu_formulario, menu);
    return super.onCreateOptionsMenu(menu);
  }


  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    
    return super.onOptionsItemSelected(item);
  }
}


/*FINALIZANDO O  CAPITULO 2 */
