package com.negociosrdom.fiberoptic.fiberoptic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Vector;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Main extends AppCompatActivity {

    private MColor objColor;
    private MLimite objLimite;
    private Vector<MColor> listColores;
    private Vector<MLimite> listLimites;
    private int i;
    private int posicionEncoontrada;
    private int numeroTerminal;
    private int resultado;
    private int stringSize;
    private boolean encontrado;
    private String colorFijo;
    private String colorFijo2;
    private String strTxtTerminal;
    private String mensaje;
    private String categoria;
    private String strPosicion;
    private String strPosicion2;
    private String strColor;
    private String strColor2;
    private String strBuffer1;
    private String strBuffer2;
    private String primerCarcater;
    private EditText txtTerminal;
    private TextView lblBuffer1;
    private TextView lblBuffer2;
    private TextView lblPosicion;
    private TextView lblPosicion2;
    private TextView lblColor;
    private TextView lblColor2;
    private Spinner spAlimentador;
    private static final String TAG = "MainActivity";
    private AdView mAdView;
    private AdRequest adRequest;

    public Main(){
        i = 0;
        numeroTerminal = 0;
        posicionEncoontrada = 0;
        resultado = 0;
        stringSize = 0;
        encontrado = false;
        colorFijo = "empty";
        colorFijo2 = "empty";
        strTxtTerminal = "empty";
        mensaje = "";
        categoria = "";
        strPosicion = "";
        strPosicion2 = "";
        strColor = "";
        strColor2 = "";
        primerCarcater = "";
        strBuffer1 = "BUFFER";
        strBuffer2 = "BUFFER";

        objColor = new MColor();
        objLimite = new MLimite();

        listColores = new Vector<MColor>();
        listLimites = new Vector<MLimite>();

        objLimite.setNombre("a");
        objLimite.setLimite(12);
        objLimite.setNoBuffer(1);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("f");
        objLimite.setLimite(24);
        objLimite.setNoBuffer(2);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("k");
        objLimite.setLimite(36);
        objLimite.setNoBuffer(3);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("m");
        objLimite.setLimite(48);
        objLimite.setNoBuffer(4);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("n");
        objLimite.setLimite(60);
        objLimite.setNoBuffer(5);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("r");
        objLimite.setLimite(72);
        objLimite.setNoBuffer(6);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("t");
        objLimite.setLimite(84);
        objLimite.setNoBuffer(7);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("v");
        objLimite.setLimite(96);
        objLimite.setNoBuffer(8);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("w");
        objLimite.setLimite(108);
        objLimite.setNoBuffer(9);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("x");
        objLimite.setLimite(120);
        objLimite.setNoBuffer(10);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("y");
        objLimite.setLimite(132);
        objLimite.setNoBuffer(11);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objLimite = new MLimite();
        objLimite.setNombre("z");
        objLimite.setLimite(144);
        objLimite.setNoBuffer(12);
        objLimite.setNoBuffer2(2);
        listLimites.add(objLimite);

        objColor.setNombre("azul");
        objColor.setNumero(1);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("naranja");
        objColor.setNumero(2);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("verde");
        objColor.setNumero(3);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("marron");
        objColor.setNumero(4);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("gris");
        objColor.setNumero(5);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("blanco");
        objColor.setNumero(6);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("rojo");
        objColor.setNumero(7);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("negro");
        objColor.setNumero(8);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("amarillo");
        objColor.setNumero(9);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("morado");
        objColor.setNumero(10);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("rosado");
        objColor.setNumero(11);
        listColores.add(objColor);

        objColor = new MColor();
        objColor.setNombre("celeste");
        objColor.setNumero(12);
        listColores.add(objColor);

    }

    public void clean(){
        lblBuffer1.setText("BUFFER");
        lblBuffer2.setText("BUFFER");
        lblPosicion.setText("Posicion");
        lblColor.setText("Color");
        lblPosicion2.setText("Posicion");
        lblColor2.setText("Color");
    }

    private void busquedaConNumeros(){
        numeroTerminal = 0;

        try{
            numeroTerminal = Integer.parseInt(strTxtTerminal.substring(0,stringSize));
            i = 0;
            while (i < listLimites.size()){
                if(numeroTerminal <= listLimites.get(i).getLimite()){
                    mensaje = "Categoria: "+listLimites.get(i).getNombre();
                    Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
                    i = 20;
                }
                /*if(categoria.equals(listLimites.get(i).getNombre())){
                    if (categoria.equals(listLimites.get(0).getNombre())){
                        resultado = numeroTerminal;
                        posicionEncoontrada = 0;
                    }else{
                        resultado =  numeroTerminal - listLimites.get(i-1).getLimite();
                        posicionEncoontrada = listLimites.get(i-1).getNoBuffer();
                    }
                    i = 20;
                }*/
                i++;
            }

        }catch (Exception e){

        }
    }

    private void busquedaConLetras(){
        categoria = strTxtTerminal.substring(0,1);
        numeroTerminal = 0;

        try{
            numeroTerminal = Integer.parseInt(strTxtTerminal.substring(1,stringSize));
            i = 0;
            while (i < listLimites.size()){
                if(categoria.equals(listLimites.get(i).getNombre())){
                    if (categoria.equals(listLimites.get(0).getNombre())){
                        resultado = numeroTerminal;
                        posicionEncoontrada = 0;
                    }else{
                        resultado =  numeroTerminal - listLimites.get(i-1).getLimite();
                        posicionEncoontrada = listLimites.get(i-1).getNoBuffer();
                    }
                    i = 20;
                }
                i++;
            }

            if(resultado > 0){
                i = 0;
                while (i < listColores.size()){
                    if (resultado == listColores.get(i).getNumero()){
                        colorFijo = listColores.get(i).getNombre().toUpperCase();
                        encontrado = true;
                        i = 20;
                    }
                    i++;
                }

                if (encontrado == true){
                    strPosicion = "POSICION: "+resultado;
                    strColor = "COLOR: "+colorFijo;
                    strBuffer1 = "12 H BUFFER "+listLimites.get(posicionEncoontrada).getNoBuffer()+":";
                    // Log.i("INFO","");


                    strPosicion2 = "POSICION:";
                    strColor2 = "COLOR:";

                    if (resultado > 6){
                        resultado = resultado - 6;
                        i = 0;
                        while (i < listColores.size()){
                            if (resultado == listColores.get(i).getNumero()){
                                colorFijo2 = listColores.get(i).getNombre().toUpperCase();
                                i = 20;
                            }
                            i++;
                        }

                        if(posicionEncoontrada == 11){
                            strBuffer2 = "BUFFER";
                            strPosicion2 = "POSICION";
                            strColor2 = "COLOR";
                        }else{
                            //strBuffer2 = "6 H BUFFER "+listLimites.get(posicionEncoontrada+1).getNoBuffer2()+":";
                            int prueba = 0;
                            prueba = listLimites.get(posicionEncoontrada).getNoBuffer2();
                            strBuffer2 = "6 H BUFFER "+prueba+":";
                            strPosicion2 = "POSICION: "+resultado;
                            strColor2 = "COLOR: "+colorFijo2;
                        }

                    }
                    lblBuffer1.setText(strBuffer1);
                    lblBuffer2.setText(strBuffer2);
                    lblPosicion.setText(strPosicion);
                    lblPosicion2.setText(strPosicion2);
                    lblColor.setText(strColor);
                    lblColor2.setText(strColor2);
                }else{
                    mensaje = "Este Terminal es incorrecto.";
                    Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
                    clean();
                }
            }
        }catch (Exception e){
            String mensaje = "Despues de la categoria, debes escribir un numero.";
            Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-5698651679738601~1845643330");

        mAdView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        lblBuffer1 = (TextView) findViewById(R.id.lblBuffer1);
        lblBuffer2 = (TextView) findViewById(R.id.lblBuffer2);
        lblPosicion = (TextView) findViewById(R.id.lblPosicion);
        lblPosicion2 = (TextView) findViewById(R.id.lblPosicion2);
        lblColor = (TextView) findViewById(R.id.lblColor);
        lblColor2 = (TextView) findViewById(R.id.lblColor2);
        txtTerminal = (EditText) findViewById(R.id.txtTerminal);
        spAlimentador = (Spinner) findViewById(R.id.spAlimentador);
        String[] strOpciones = {"144","48"};

        spAlimentador.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strOpciones));

        txtTerminal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                encontrado = false;
                stringSize = 0;
                strTxtTerminal = txtTerminal.getText().toString().toLowerCase().trim();

                try {
                    stringSize = strTxtTerminal.length();
                }catch (Exception e){
                    Log.i("IMPORTANTE","No se pudo capturar el size");
                }

                if(stringSize > 1){
                    primerCarcater = strTxtTerminal.substring(0,1);
                    try {
                        int numero = 0;
                        numero = Integer.parseInt(primerCarcater);
                        //mensaje = "ESTO ES UN NUEMERO: "+numero;
                        //Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
                        busquedaConNumeros();
                    }catch (Exception e){
                        //Log.i("IMPORTANTE","No se puede convertir en numero");
                        //mensaje = "ESTE ES UNA LETRA: "+primerCarcater;
                        //Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
                        busquedaConLetras();
                    }

                }
            }
        });
    }
}
