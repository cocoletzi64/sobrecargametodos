package org.erick.poo.sobrecarga;
import static org.erick.poo.sobrecarga.calculadora.*;

public class calculadora {
    //constructores

    private calculadora() {
    }

    //metodos
    public static int sumar(int a,int b){
        return a+b;
    }
    public static float sumar(float x, float y){
        return x+y;
    }
    public static float sumar(int i, float j){
        return i+j;
    }
    public static float sumar(float i, int j){
        return i+j;
    }
    public static double sumar(double a, double b) {
        return a+b;
    }
    public static int sumar (String a, String b){
        int resultado;
        try {
            resultado=Integer.parseInt(a)+Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado =0;
        }
        return resultado;
    }
    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
    public static int sumar(int... argumentos){
        int total =0;
        for(int i=0; i<argumentos.length; i++){
            total+=argumentos[i];
        }
        return total;
    }
    public static double sumar(double... varargs){
        double total =0.0;
        for(int i=0; i<varargs.length; i++){
            total+=varargs[i];
        }
        return total;
    }
    public static float sumar(float a,int ... argumentos){
        float total = a;
        for(int i=0; i<argumentos.length; i++){
            total+=argumentos[i];
        }
        return total;
    }
}
