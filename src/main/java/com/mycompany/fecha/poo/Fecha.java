package com.mycompany.fecha.poo;
import java.util.HashMap;
public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    /**
     * Contructor de la clase
     * @param dia dia de la fecha
     * @param mes mes de la fecha
     * @param ano año de la fecha
     * 
     * complejidad temporal: 0(1) complejidad constante
     */
    public Fecha(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    /**
     * metodo que muestra la fecha corta
     * 
     * complejidad temporal: 0(1) complejidad constante
     *@return 
     */
    public String fechaCorta(){
        return dia+"/"+mes+"/"+ano;
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

            else if (dia>=1 && dia<=30) {
                return true;
            }
        }
        return false;
    } 
    /**
     * 
     * complejidad temporal: 0(1) complejidad constante
     * @return
     */
    public String mesLetra() {
            HashMap<Integer, String> letraMes = new HashMap<>();
            letraMes.put(1, "enero");
            letraMes.put(2, "febrero");
            letraMes.put(3, "marzo");
            letraMes.put(4, "abril");
            letraMes.put(5, "mayo");
            letraMes.put(6, "junio");
            letraMes.put(7, "julio");
            letraMes.put(8, "agosto");
            letraMes.put(9, "septiembre");
            letraMes.put(10, "octubre");
            letraMes.put(11, "noviembre");
            letraMes.put(12, "diciembre");
            return letraMes.get(mes);
    }
    /**
     * complejidad temporal: 0(1) complejidad constante
     * 
     * metodo que muestra la fecha con el mes en letra, es decir: 1 de enero de 2024
     * @return 
     */
    public String fechaLarga(){
        return dia + " de " + this.mesLetra() + " de " + ano;
    }
}