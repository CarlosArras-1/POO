import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int horas= 24 * 365;
        System.out.println("¿Cual es tu edad?");
        int edad= scanner.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }else if(edad>10){
            System.out.println("Eres menor de edad, aún eres un jovenzuelo");
        }else{
            System.out.println("Eres un niño");
        }
        System.out.println("Tu edad es "+ edad + " y has vivido un total de "+ (edad*horas)+" horas en total");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Dame un numero por favor ");

        int num= scanner.nextInt();
        for ( int x=0;x<11;x++){
            if (num>10){
                System.out.println("porfavor, Coloca un numero menor que 10");
                JOptionPane.showConfirmDialog(null,"porfavor, intriduce un numero Mayor que 0");
            }else if (num<0){
                System.out.println("porfavor, Coloca un numero Mayor que 0");
                JOptionPane.showConfirmDialog(null,"porfavor, intriduce un numero Mayor que 0");
            }
        System.out.println(num +"X"+ x+ "=" + (num*x));


        }

    }
    }

