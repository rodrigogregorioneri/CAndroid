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
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflate = getMenuInflater();
    inflate.inflate(R.menu.menu_formulario, menu);
    return super.onCreateOptionsMenu(menu);
  }


  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    switch (item.getItemId()) {
      case R.id.menu_formulario_ok:
        // Imprimindo mensagem com Toast
        Toast.makeText(getBaseContext(), "teste", Toast.LENGTH_SHORT).show();
        finish();
        break;
    }


    return super.onOptionsItemSelected(item);
  }
}


/*FINALIZANDO O  CAPITULO 2 */
