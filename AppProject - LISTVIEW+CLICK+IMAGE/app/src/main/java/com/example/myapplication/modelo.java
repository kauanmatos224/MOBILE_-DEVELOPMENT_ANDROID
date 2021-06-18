package com.example.myapplication;

public class modelo {

    // CONFIGURE THE VARIABLES TO INTACIATE LIST ARRAY VALUES.
	// CONFIGURA AS VARIAVEIS PARA INTACIAR OS VALORES DO ARRAY DE LISTA.
    private String nome;

    private int resIdImagem;

    private String preco;
    // CONFIGURA AS VARIAVEIS PARA INTACIAR OS VALORES DO ARRAY DE LISTA.
	// CONFIGURE THE VARIABLES TO INTACIATE LIST ARRAY VALUES.


    // METODO CONSTRUTOR
	// BUILDER METHOD
    public modelo(String nome, int resIdImagem, String preco){
        this.nome = nome;

        this.resIdImagem = resIdImagem;

        this.preco = preco;
    }
	// BUILDER METHOD
    // METODO CONSTRUTOR


    // CONFIGURA O RETORNO DOS DADOS DO ARRAY DE LISTA APÓS SEREM TRATADOS PELA CLASSE
	// CONFIGURE THE RETURN OF LIST ARRAY DATA AFTER BEING HANDLED BY CLASS
    public int getIdImagem(){ return this.resIdImagem; }

    public String getNome(){ return this.nome; }

    public String getPreco(){ return this.preco; }
    // CONFIGURA O RETORNO DOS DADOS DO ARRAY DE LISTA APÓS SEREM TRATADOS PELA CLASSE
	// CONFIGURE THE RETURN OF LIST ARRAY DATA AFTER BEING HANDLED BY CLASS
}
