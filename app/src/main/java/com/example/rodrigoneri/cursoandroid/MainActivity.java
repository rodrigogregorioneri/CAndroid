package com.example.rodrigoneri.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Cria e popula Array de alunos "String"
    String [] alunos = {"Rodrigo", "Priscila","Ivone","Carlos", "Priscila","Ivone","Carlos", "Priscila","Ivone","Carlos", "Priscila","Ivone","Carlos"};

    //Cria obtém a ListView e faz uma Casting(Conversão) para ListView pois ela é um xml
    ListView lista_alunos = (ListView) findViewById(R.id.lista);

    // Cria um Array Adapter e guarda na variavel adapter é necessario para converter um ARRAY em ListView
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);

    // Associa a lista ao array adapter apartir disso já deve apresentar a lista na tela
    lista_alunos.setAdapter(adapter);

    // Instanciando o botão Aluno (Floating Button) feito nos commits anteriores
    Button aluno = (Button) findViewById(R.id.novo_aluno);

    // Criando o evento de clique com o callback
    aluno.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(MainActivity.this, FormActivity.class);
          startActivity(intent);
      }
    });


  }
}



