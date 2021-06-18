package com.example.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Toast;

//IMPORTED CLASSES
import android.app.ProgressDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity
{

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate ( savedInstanceState );
            setContentView ( R.layout.activity_main );
            findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
            {

                public void onClick(View v)
                {
                    final ProgressDialog progressodialogo= new ProgressDialog (MainActivity.this ) ;
                    progressodialogo.setMessage ( " Por favor, aguarde o processo a ser concluido" );
                    progressodialogo.setProgressStyle ( ProgressDialog.STYLE_SPINNER );
                    progressodialogo.show ();
                    progressodialogo.setCancelable ( false );
                    new Thread ( new Runnable ()
                    {

                        @Override
                        public void run()
                        {
                            try
                            {

                                Thread.sleep ( 5000 ); // delay

                                Intent trocar=new Intent(MainActivity.this,MainActivity2.class);
                                MainActivity.this.startActivity(trocar);

                            }
                            catch(Exception e)
                            {
                                e.printStackTrace ();



                            }
                            progressodialogo.dismiss ();
                        }
                    } ).start ();


                }
            });


        }
    }





