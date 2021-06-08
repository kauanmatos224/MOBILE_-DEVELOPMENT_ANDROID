package com.example.myapplication;

public class modelo {

    // CONFIGURA AS VARIAVEIS PARA INTACIAR OS VALORES DO ARRAY DE LISTA.
    private String nome;

    private int resIdImagem;

    private String preco;
    // CONFIGURA AS VARIAVEIS PARA INTACIAR OS VALORES DO ARRAY DE LISTA.


    // METODO CONSTRUTOR
    public modelo(String nome, int resIdImagem, String preco){
        this.nome = nome;

        this.resIdImagem = resIdImagem;

        this.preco = preco;
    }
    // METODO CONSTRUTOR


    // CONFIGURA O RETORNO DOS DADOS DO ARRAY DE LISTA APÓS SEREM TRATADOS PELA CLASSE
    public int getIdImagem(){ return this.resIdImagem; }

    public String getNome(){ return this.nome; }

    public String getPreco(){ return this.preco; }
    // CONFIGURA O RETORNO DOS DADOS DO ARRAY DE LISTA APÓS SEREM TRATADOS PELA CLASSE
}
