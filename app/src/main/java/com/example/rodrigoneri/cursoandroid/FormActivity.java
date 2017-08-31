package com.example.rodrigoneri.cursoandroid;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_form);
  }

  // Responsavel por criar o menu a partir de um xml
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflate = getMenuInflater();
    inflate.inflate(R.menu.menu_formulario, menu);
    return super.onCreateOptionsMenu(menu);
  }


  // Responsavel pelos eventos do Itens do menu
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // responsavel por definir o item do menu a ser executado de acordo com o Id
    switch (item.getItemId()) {
      case R.id.menu_formulario_ok:
        // Imprimindo mensagem com Toast

        EditText CampoNome = (EditText) findViewById(R.id.formulario_nome);
        EditText CampoEndereco = (EditText) findViewById(R.id.formulario_endereco);
        EditText CampoTelefone = (EditText) findViewById(R.id.formulario_telefone);
        EditText CampoSite = (EditText) findViewById(R.id.formulario_site);


        String nome = CampoNome.getText().toString();
        String endereco = CampoEndereco.getText().toString();
        String telefone = CampoTelefone.getText().toString();
        String site = CampoSite.getText().toString();



        Toast.makeText(getBaseContext(), nome, Toast.LENGTH_SHORT).show();
        finish();
        break;
    }
    return super.onOptionsItemSelected(item);
  }
}


/*FINALIZANDO O  CAPITULO 3 */
