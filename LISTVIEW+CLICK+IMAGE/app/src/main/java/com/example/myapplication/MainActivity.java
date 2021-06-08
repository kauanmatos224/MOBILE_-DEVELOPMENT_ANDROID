package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView listay;
    public ArrayList comidax;
    public adapter adapter;
    // CRIAÇÃO DOS OBJETOS

    public static String nomex;
    public static int img;
    // CRAIÇAÕ DE VARIAVEIS STATICAS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("LOJA DE OBJETOS COMPRAVEIS");
        // MUDA O TITULO

        comidax = new ArrayList<>();
                // INSTANCIAMENTO DO ARRAY LIST


        listay = (ListView) findViewById( R.id.lista);
            //INSTANCIAMENTO DO LIST VIEW

        comidax.add(new modelo("Carnes",R.drawable.carnes, "19,99"));
        comidax.add(new modelo("Foto comendo salada",R.drawable.salada, "449,99"));
        comidax.add(new modelo("Frango",R.drawable.frango, "29,99"));
        comidax.add(new modelo("Peixe",R.drawable.peixe, "39,99"));
        comidax.add(new modelo("Salada",R.drawable.salada, "49,99"));
        comidax.add(new modelo("Peixe feito com iguarias",R.drawable.peixe, "339,99"));
        comidax.add(new modelo("Carnes importadas do sul da malasia",R.drawable.carnes, "1119,99"));



        //PREENCHIMENTO DO ARRAY LIST COM ESTRUTURA DO MODELO


        adapter = new adapter(getBaseContext(), R.layout.linha,comidax);
        listay.setAdapter(adapter);
        // LIGAÇÃO ENTRE O MODELO E PREENCHIMENTO DE LINHA COM OS VALORES DE COMIDAX


        //CONFIGURA O CLICK DOS ELEMENTOS DO LISTVIEW
        listay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                modelo item = adapter.getItem(i);
                // PEGA O VALOR DO ENDEREÇO DO ITEM CLICADO.


                //CONFIGURA A TRANSIÇÃO DE ACTIVITY
                Intent trocar = new Intent(MainActivity.this,MainActivity2.class);
                MainActivity.this.startActivity(trocar);
                //CONFIGURA A TRANSIÇÃO DE ACTIVITY


            }
        });
        //CONFIGURA O CLICK DOS ELEMENTOS DO LISTVIEW
    }
}