package org.erick.poo.sobrecarga;
import static org.erick.poo.sobrecarga.calculadora.*;

public class Ejemplosobrecarga {
    public static void main(String[] args) {


        System.out.println("sumar int : " + sumar(10,5));
        System.out.println("sumar float: "+sumar(10F,5f));
        System.out.println("sumar float, int : "+sumar(10.0f,5.0));
        System.out.println("sumar int, float: "+sumar(10,5.0f));
        System.out.println("sumar double : "+sumar(10.0,5.0));
        System.out.println("sumar String  : "+sumar("10","5"));
        System.out.println("sumar 3 int : "+sumar(10,5,3));
        System.out.println("sumar 5 int : "+sumar(10,5,3,4,6));
        System.out.println("sumar float + n int :" +sumar(10.5f,5,9,15));
        System.out.println("sumar 3 double: " +sumar(10.0,5.0,3,5,4,5));

        System.out.println("\n");


        System.out.println("sumar long : "+sumar(10l,5l));
        System.out.println("sumar int : "+sumar(10,'@'));
        System.out.println("sumar float, int: "+sumar(10F,'@'));

    }
}
