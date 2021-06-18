package com.example.dialogo_alertdialog;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );




        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


                AlertDialog.Builder alertdialogo=new AlertDialog.Builder(MainActivity.this);
                alertdialogo.setTitle ( " Continuação do Teste!!!" ); // titulo // title
                alertdialogo.setIcon ( R.drawable.ic_drive_eta_black_24dp ); // icone // icon
                alertdialogo.setMessage ( " Tem certeza que deseja continuar" ); // mensagem // message
                alertdialogo.setCancelable ( false );

                // definição da ação dos botões
                // definition of button action

                alertdialogo.setPositiveButton ( "SIM", new DialogInterface.OnClickListener ()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                        Intent trocar=new Intent(MainActivity.this,MainActivity2.class);
                        MainActivity.this.startActivity(trocar);


                    }
                } );



                alertdialogo.setNegativeButton ( "NÃO", new DialogInterface.OnClickListener ()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        Toast.makeText(getBaseContext(), "Você não deseja continuar",
                                Toast.LENGTH_LONG).show();


                    }
                } );



                alertdialogo.setNeutralButton ( "Cancelar", new DialogInterface.OnClickListener ()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                        Toast.makeText(getBaseContext(), "Você escolheu cancelar",
                                Toast.LENGTH_LONG).show();

                    }

                } );




                AlertDialog alertDialogx=alertdialogo.create ();
                alertDialogx.show ();


            }
        });
    }
}
