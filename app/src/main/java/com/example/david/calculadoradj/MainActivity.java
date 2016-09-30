package com.example.david.calculadoradj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Double numero1=null, numero2=null, memoria=null;
    private String numero, operador;
    private Boolean coma = false;
    private Boolean maximo = false;
    private Boolean resultado = false;
    private Boolean operacion = false;

    public void obtenerBoton (View view){
        TextView pantalla = (TextView)findViewById(R.id.texto);
        String numero = pantalla.getText().toString();
        int seleccionado=view.getId();

        try{
            switch (seleccionado) {
                case R.id.bt1:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("1");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "1");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt2:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("2");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "2");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt3:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("3");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "3");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt4:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("4");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "4");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt5:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("5");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "5");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt6:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("6");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "6");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt7:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("7");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "7");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt8:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("8");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "8");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt9:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("9");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "9");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.bt0:
                    if (!comprobarTamaño() || resultado == true) {
                        if (resultado == true) {
                            pantalla.setText("0");
                            resultado = false;
                        } else {
                            pantalla.setText(numero + "0");
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.btcoma:
                    if (!comprobarTamaño() || resultado == true) {
                        if (coma == false) {
                            pantalla.setText(numero + ".");
                            if (numero.length() == 0 || resultado == true) {
                                pantalla.setText("0.");
                            }
                            coma = true;
                            break;
                        } else {
                            break;
                        }
                    }else{
                        notificacion();
                    }
                    break;
                case R.id.btdividir:
                    try{
                        numero1 = Double.parseDouble(pantalla.getText().toString());
                    }catch (Exception e){}
                    pantalla.setText("");
                    operador="/";
                    operacion = true;
                    coma = false;
                    maximo=false;
                    break;
                case R.id.btmultiplicar:
                    try{
                        numero1 = Double.parseDouble(pantalla.getText().toString());
                    }catch (Exception e){}
                    pantalla.setText("");
                    operador="*";
                    operacion = true;
                    coma = false;
                    maximo=false;
                    break;
                case R.id.btsumar:
                    try{
                        numero1 = Double.parseDouble(pantalla.getText().toString());
                    }catch (Exception e){}
                    pantalla.setText("");
                    operador="+";
                    operacion = true;
                    coma = false;
                    maximo=false;
                    break;
                case R.id.btrestar:
                    try{
                        numero1 = Double.parseDouble(pantalla.getText().toString());
                    }catch (Exception e){}
                    pantalla.setText("");
                    operador="-";
                    operacion = true;
                    coma = false;
                    maximo=false;
                    break;
                case R.id.btM:
                    memoria = Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("0");
                    resultado=true;
                    break;
                case R.id.btmemoria:
                    if (memoria != null) {
                        pantalla.setText("" + memoria);
                    }
                    break;
                case R.id.btborrar:
                    try {
                        numero = pantalla.getText().toString();
                        if (numero.length()>=1)
                        {
                            numero = numero.substring(0, numero.length() - 1) + "";
                            pantalla.setText(numero);
                        }
                    }catch (Exception e){
                        pantalla.setText("");
                    }
                    break;
            }

        }catch (Exception e){
            pantalla.setText("");
            resultado=true;
        }
    }

    public void limpiar (View view) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        pantalla.setText("");
        numero1=null;
        numero2=null;
        coma=false;
        resultado=false;
        operacion=false;
        operador=null;
        maximo=false;
    }

    public void resultado (View view) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        try {
            numero2 = Double.parseDouble(pantalla.getText().toString());

            if (operador == "/") {
                if (numero2!=0){
                    pantalla.setText("" + (numero1 / numero2));
                }else{
                    pantalla.setText("Operación no valida");
                }
            }
            if (operador == "*") {
                pantalla.setText("" + (numero1 * numero2));
            }
            if (operador == "+") {
                pantalla.setText("" + (numero1 + numero2));
            }
            if (operador == "-") {
                pantalla.setText("" + (numero1 - numero2));
            }

            operador = null;
            resultado = true;
            operacion = false;
            numero1 = null;
            numero2 = null;
            coma = false;

        }catch (Exception e){
            pantalla.setText("Operación no válida");
            resultado = true;
            operacion = false;
            coma = false;
        }
    }

    public boolean comprobarTamaño() {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        String digitos = pantalla.getText().toString();
        maximo=false;
        if (digitos.length()>=10){
            maximo=true;
        }
        return maximo;
    }

    public void notificacion(){
        Toast notificacion = Toast.makeText(getApplicationContext(), "Número máximo de dígitos (10) superado", Toast.LENGTH_SHORT);
        notificacion.show();
    }
}
