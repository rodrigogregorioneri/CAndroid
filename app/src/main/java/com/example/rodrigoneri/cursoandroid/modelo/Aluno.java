package com.example.rodrigoneri.cursoandroid.modelo;

/**
 * Created by rodrigo.neri on 31/08/2017.
 */
public class Aluno {
  private String nome;
  private String endereco;
  private String telefone;
  private String site;
  private Double nota;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Double getNota() {
    return nota;
  }

  public void setNota(Double nota) {
    this.nota = nota;
  }

  public String getSite() {

    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public String getTelefone() {

    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}
