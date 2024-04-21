package com.mycompany.fecha.poo;
import java.util.Scanner;
import java.util.HashMap;
public class Fecha {
    int dia = 0;
    int mes = 0;
    int ano = 0;
/**
 * Constructor de la clase
 * @param dia dia de la fecha
 * @param mes mes de la fecha
 * @param ano año de la fecha
 * 
 * complejidad temporal: 0(1) complejidad constante
 */
public Fecha(int dia, int mes, int ano){
    Scanner lector = new Scanner(System.in);
        this.dia = lector.nextInt();
        this.mes = lector.nextInt();
        this.ano = lector.nextInt();
}
/**
 * metodo que muestra la fecha corta
 * 
 * complejidad temporal: 0(1) complejidad constante
 */
public String fechaCorta(){
        return dia + "/" + mes + "/" + ano;

    }
/**
 * metodo que valida la fecha
 * 
 * complejidad temporal: 0(1) complejidad constante
 * @return 
 */
 public boolean validaFecha () {

        if (mes>12 || mes<1) {
            return false;

        } 
        else if (mes==2)
        {
            if (ano%4==0 && dia>=1 && dia<=29) {
                return true;
            } 
        }
        else{

            if ((mes==1 || mes==3 || mes==5 || mes==7 || mes ==8 || mes ==10 || mes==12) && dia>=1 && dia<=31) {
                    return true;
                
                    
        }
 }return false;
 }
/**
 * metodo que muestra la fecha con el mes en letra, es decir: 1 de enero de 2024
 * 
 * complejidad temporal: 0(1) complejidad constante
 * @param mes 
 */
public void mesLetra(String[] mes) {
        HashMap<String, String> letraMes = new HashMap<>();
        letraMes.put("1", "enero");
        letraMes.put("2", "febrero");
        letraMes.put("3", "marzo");
        letraMes.put("4", "abril");
        letraMes.put("5", "mayo");
        letraMes.put("6", "junio");
        letraMes.put("7", "julio");
        letraMes.put("8", "agosto");
        letraMes.put("9", "septiembre");
        letraMes.put("10", "octubre");
        letraMes.put("11", "noviembre");
        letraMes.put("12", "diciembre");
        String string = "";
        String mesEnLetra = letraMes.get(string+mes);
        System.out.println(dia+" de "+mesEnLetra+" de "+ ano);
}
}