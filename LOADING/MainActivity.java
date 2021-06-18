package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Toast;

//CLASSES IMPORTADAS
import android.app.ProgressDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        public void OnClick(View V)
        {
            progressDialog progressodialogo = new ProgressDialog () MainActivity.this);
            progressodialogo.setMessage ("Por favor  aguarde o processo ser concluido");
            progressodialogo.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressodialogo.show();
            progressodialogo.setCancelable(false);
            new Thread (new Rnnable () 
            {

                @Override
                public void run() 
                {
                    
                    try
                    {

                        Thread.sleep (10000);
                        //DEFINE O TEMPO DE EXECUÇÃO DA BOLHINHA DE ROTAÇÃO DE ESPERA

                        Intent trocar=new Intent(MainActivity.this,MainActivity2.class);
                        MainActivity.this.startActivity(trocar);

                    }

                    catch(Exception e)
                    {

                        e.printStackTrace();

                    }
                    progressodialogo.dismiss();

                }
            }).start();
        }
    }
}
