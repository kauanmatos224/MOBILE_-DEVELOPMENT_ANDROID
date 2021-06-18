package com.example.popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btfunc;
    public static String[] cod = new String[100];
    public static String[] nome = new String[100];
    public int i = 0;
    public int j = 0;
    public int achou = 0;
    public EditText txtcod;
    public EditText txtnome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        txtcod = (EditText) findViewById ( R.id.txtcod );
        txtnome = (EditText) findViewById ( R.id.txtnome );

        btfunc = (Button) findViewById ( R.id.button );
        findViewById ( R.id.button ).setOnClickListener ( new View.OnClickListener () {
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu ( MainActivity.this, btfunc );
                popup.getMenuInflater ().inflate ( R.menu.menu, popup.getMenu () );
                popup.setOnMenuItemClickListener ( new PopupMenu.OnMenuItemClickListener () {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        if (menuItem.getTitle ().equals ( "Cadastro funcionario" )) {

                            cadastrar ();
                        }
                        else
                        if (menuItem.getTitle ().equals ( "Pesquisar funcionario" )) {
                            pesquisar ();
                        }
                        return true;
                    }
                } );
                popup.show ();


            }
        } );
    }

    public void cadastrar() {
        i++;
        cod[i] = txtcod.getText ().toString ();
        nome[i] = txtnome.getText ().toString ();
        Toast.makeText ( getApplicationContext (), "cadastrado com sucesso"+cod[i], Toast.LENGTH_LONG ).show ();
        txtnome.setText ( "" );
        txtcod.setText ( "" );


    }

    public void pesquisar()
    {

        achou = 0;
        for (j = 1; j <= i; j++)
        {
            if(cod[j].equals ( txtcod.getText ().toString () ))
            {
                achou=1;

                Toast.makeText ( getApplicationContext (), "ENCONTRADO", Toast.LENGTH_LONG ).show ();

                txtnome.setText ( nome[j] );
            }
        }

        if(achou==0)
        {
            Toast.makeText ( getApplicationContext (), "funcionario não encontrado", Toast.LENGTH_LONG ).show ();


        }

    }
}
