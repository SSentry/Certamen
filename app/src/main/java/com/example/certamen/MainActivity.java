package com.example.certamen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.math.MathUtils;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

// variables 
    Button generar;
    Button sumar;
    Button resta;
    Button borrar;
    Button multiplicar;
    Button dividir;

    TextView numero1;
    TextView numero2;
    TextView signo;

    TextView es_parrr;

    TextView resultado_final_final;


    Button resultado_par;

    Button resultado_primo;
    int num1 , num2;


    String resultado;
    int resultado_suma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generar =(Button)findViewById(R.id.generar_numeros);


        sumar = (Button)findViewById(R.id.operacion_sumar);
        resta = (Button)findViewById(R.id.boton_resta);
        borrar = (Button)findViewById(R.id.boton_borrar);
        multiplicar = (Button)findViewById(R.id.boton_multiplicar);
        dividir = (Button)findViewById(R.id.boton_dividir);






        numero1 = (TextView) findViewById(R.id.numero1);
        signo = (TextView) findViewById(R.id.signo);
        numero2 = (TextView) findViewById(R.id.numero2);

        resultado_par = (Button)findViewById(R.id.resultado_par);

        resultado_primo = (Button)findViewById(R.id.resultado_impar);

        resultado_final_final = (TextView)findViewById(R.id.RESULTADO_FINAL);

        es_parrr = (TextView)findViewById(R.id.ES_PARR);

        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random r = new Random();
                num1= r.nextInt(9);
                num2= r.nextInt(9);

                Log.i("infoo","numero random = "+num1);
                String numm = Integer.toString(num1);
                String numm2 = Integer.toString(num2);
                numero1.setText(numm);
                numero2.setText(numm2);
            }
        });


        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado_suma = num1+num2;
                Log.i("infoo","resultado suma = "+resultado_suma);
                signo.setText("+");

            }
        });


        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado_suma = num1-num2;
                Log.i("infoo","resultado suma = "+resultado_suma);
                signo.setText("-");

            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado_suma = num1*num2;
                Log.i("infoo","resultado suma = "+resultado_suma);
                signo.setText("*");

            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado_suma = num1/num2;
                Log.i("infoo","resultado suma = "+resultado_suma);
                signo.setText("/");

            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado_suma = num1/num2;
                Log.i("infoo","resultado suma = "+resultado_suma);
                numero1.setText("0");
                signo.setText("?");
                numero2.setText("0");

            }
        });





        resultado_par.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cantiad_numero1;
                String cantidad_numero2;


              int numero_parr = resultado_suma%2;
               int prueba = resultado_suma/2;

                Log.i("infoo"," resultado final "+resultado_suma);

                Log.i("infoo"," con mod"+numero_parr);

                Log.i("infoo","con div"+prueba);


                if (numero_parr==0)
                {
                    String resultadito = Integer.toString(resultado_suma);
                    resultado_final_final.setText(resultadito);
                    es_parrr.setText("ES PAR");
                    numero1.setText("0");
                    signo.setText("?");
                    numero2.setText("0");

                }
                else
                {
                    String resultadito = Integer.toString(resultado_suma);
                    resultado_final_final.setText(resultadito);
                    es_parrr.setText("NO ES PAR");
                    numero1.setText("0");
                    signo.setText("?");
                    numero2.setText("0");


                }
            }
        });

        resultado_primo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (resultado_suma==1 || resultado_suma==2)
                {
                    String resultadito=Integer.toString(resultado_suma);
                    resultado_final_final.setText(resultadito);

                    es_parrr.setText("NO ES PRIMO");
                    numero1.setText("0");
                    signo.setText("?");
                    numero2.setText("0");

                }
                else
                {
                    int contador=0;
                    for (int i=1 ; i<=resultado_suma ; i++)
                    {
                        if (resultado_suma%i==0)
                        {
                            contador++;

                        }
                    }

                        if (contador==2)
                        {
                            String resultadito=Integer.toString(resultado_suma);
                            resultado_final_final.setText(resultadito);
                            es_parrr.setText(" ES PRIMO");
                            numero1.setText("0");
                            signo.setText("?");
                            numero2.setText("0");

                        }
                        else
                        {
                            String resultadito=Integer.toString(resultado_suma);
                            resultado_final_final.setText(resultadito);
                            es_parrr.setText(" NO ES PRIMO");

                            numero1.setText("0");
                            signo.setText("?");
                            numero2.setText("0");
                        }
                    Log.i("infoo"," numero primo"+contador);

                }

            }
        });


    }


}
