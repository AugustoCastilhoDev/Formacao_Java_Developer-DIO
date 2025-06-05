package edu.augusto.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFInal = 7;
        if (mediaFInal < 6)
            System.out.println("Reprovado");
        else if (mediaFInal == 6)    
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");    
    }
}
