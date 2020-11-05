package com.company;

import java.util.Scanner;

public class Main {

    static boolean repetir = true;

    public static void main(String[] args) {
        // write your code here
        int eleccion;
        Scanner r = new Scanner(System.in);

        while (repetir == true) {
            System.out.println("Porfavor elija el tipo de operacion que desea: ");
            System.out.println("1. Masa");
            System.out.println("2. Velocidad");
            eleccion = r.nextInt();
            tipo(eleccion);


        }
    }
    public static void tipo(int eleccion){
        Scanner r = new Scanner(System.in);
        int eleccion2;
        double conversion, masa, velocidad;
        if (eleccion == 1) {
            Mass();
        } else if (eleccion == 2) {
            Velocity();
        }
    }
    public static void Mass(){
        Scanner r = new Scanner(System.in);
        int eleccion;
        Double masa,conversion;
        System.out.println("Porfavor ingrese el valor de la masa: ");
        masa = getDouble(r);
        System.out.println("Porfavor elija el tipo de masa: ");
        System.out.println("1. kg");
        System.out.println("2. lb");
        eleccion = r.nextInt();

        if (eleccion == 1) {
            conversion = kg(masa);
            System.out.println("El valor de: " + masa + " kg a libras es de: " + Math.round(conversion));
            System.out.println("Desea realizar otra operacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            eleccion = r.nextInt();
            if(eleccion == 1){
                repetir = true;
            }else if(eleccion == 2){
                repetir = false;
            }
        } else if (eleccion == 2) {
            conversion = lb(masa);
            System.out.println("El valor de: " + masa + " lb a kilogramos es de: " + Math.round(conversion));
            System.out.println("Desea realizar otra operacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            eleccion = r.nextInt();
            if(eleccion == 1){
                repetir = true;
            }else if(eleccion == 2){
                repetir = false;
            }
        }
    }
    public static void Velocity(){
        Scanner r = new Scanner(System.in);
        double velocidad,conversion;
        int eleccion;
        System.out.println("Porfavor ingrese la velocidad: ");
        velocidad = getDouble(r);
        System.out.println("Porfavor elija el tipo de velocidad que desea: ");
        System.out.println("1. km");
        System.out.println("2. mi");
        eleccion = r.nextInt();

        if (eleccion == 1) {
            conversion = km(velocidad);
            System.out.println("La velocidad de: " + velocidad + " km equivale a: " + Math.round(conversion) + " mi.");
            System.out.println("Desea realizar otra operacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            eleccion = r.nextInt();
            if(eleccion == 1){
                repetir = true;
            }else if(eleccion == 2){
                repetir = false;
            }
        } else if (eleccion == 2) {
            conversion = mi(velocidad);
            System.out.println("La velocidad de: " + velocidad + " mi equivale a: " + Math.round(conversion) + " km.");
            System.out.println("Desea realizar otra operacion ?");
            System.out.println("1. Si");
            System.out.println("2. No");
            eleccion = r.nextInt();
            if(eleccion == 1){
                repetir = true;
            }else if(eleccion == 2){
                repetir = false;
            }
        }
    }
    public static double kg(double valor){
        double calculo;
        calculo = valor * 2.2;
        return calculo;
    }
    public static double lb(double valor){
        double calculo;
        calculo = valor / 2.2;
        return calculo;
    }
    public static double km(double valor){
        double calculo;
        calculo = valor / 1.6;
        return calculo;
    }
    public static double mi(double valor){
        double calculo;
        calculo = valor * 1.6;
        return calculo;
    }
    public static double getDouble(Scanner r){
        double numero;
        numero = r.nextDouble();
        return numero;
    }
}
