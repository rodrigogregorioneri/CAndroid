package com.example.rodrigoneri.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String [] alunos = {"Rodrigo", "Priscila","Ivone"};
    ListView lista_alunos = (ListView) findViewById(R.id.lista);
    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);

  }
}
