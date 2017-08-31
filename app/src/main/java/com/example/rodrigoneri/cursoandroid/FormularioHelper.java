package com.example.rodrigoneri.cursoandroid;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.rodrigoneri.cursoandroid.modelo.Aluno;

/**
 * Created by rodrigo.neri on 31/08/2017.
 */
public class FormularioHelper {
  EditText CampoNome, CampoEndereco, CampoTelefone,CampoSite;
  RatingBar CampoNota;
  public FormularioHelper(FormActivity activity){
     CampoNome = (EditText) activity.findViewById(R.id.formulario_nome);
     CampoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
     CampoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
     CampoSite = (EditText) activity.findViewById(R.id.formulario_site);
     CampoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
  }

  public Aluno pegaAluno(){
    Aluno aluno = new Aluno();

    aluno.setNome(CampoNome.getText().toString());
    aluno.setEndereco(CampoEndereco.getText().toString());
    aluno.setTelefone(CampoTelefone.getText().toString());
    aluno.setSite(CampoSite.getText().toString());
    aluno.setNota(Double.valueOf(CampoNota.getProgress()));

    return aluno;
  }

}
