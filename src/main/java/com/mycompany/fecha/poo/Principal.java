package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia = lector.nextInt();
        int mes = lector.nextInt();
        int ano = lector.nextInt();
            
        Fecha fecha = new Fecha(dia, mes, ano);

        System.out.println(fecha.fechaCorta());
        
        if(fecha.validaFecha() == true){
            System.out.println(fecha.fechaLarga());
        }
    }
}