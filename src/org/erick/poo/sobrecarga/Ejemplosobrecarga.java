package org.erick.poo.sobrecarga;

public class Ejemplosobrecarga {
    public static void main(String[] args) {

        calculadora cal=new calculadora();

        System.out.println("sumar int : " + cal.sumar(10,5));
        System.out.println("sumar float: "+cal.sumar(10F,5f));
        System.out.println("sumar float, int : "+cal.sumar(10.0f,5.0));
        System.out.println("sumar int, float: "+cal.sumar(10,5.0f));
        System.out.println("sumar double : "+cal.sumar(10.0,5.0));
        System.out.println("sumar String  : "+cal.sumar("10","5"));
        System.out.println("sumar 3 int : "+cal.sumar(10,5,3));
        System.out.println("sumar 5 int : "+cal.sumar(10,5,3,4,6));
        System.out.println("sumar float + n int :" +cal.sumar(10.5f,5,9,15));
        System.out.println("sumar 3 double: " +cal.sumar(10.0,5.0,3,5,4,5));

        System.out.println("\n");


        System.out.println("sumar long : "+cal.sumar(10l,5l));
        System.out.println("sumar int : "+cal.sumar(10,'@'));
        System.out.println("sumar float, int: "+cal.sumar(10F,'@'));

    }
}
