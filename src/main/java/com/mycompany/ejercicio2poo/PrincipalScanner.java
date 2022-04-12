/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2poo;

import java.util.Scanner;

/**
 *
 * @author juansinmiedo
 */
public class PrincipalScanner {
    public static void main(String [] args){
        /*var numero = 0;
        while(numero<10){
            System.out.println("Ingrese un numero");
            numero=(new Scanner(System.in)).nextInt();
        }
        System.out.println(numero);
    
        */
        var numeroList=new int[7];
        var i=0;
        /*
        numeroList[i]=(new Scanner(System.in)).nextInt();
        numeroList[i+1]=(new Scanner(System.in)).nextInt();
        numeroList[i+2]=(new Scanner(System.in)).nextInt();
        numeroList[i+3]=(new Scanner(System.in)).nextInt();
        numeroList[i+4]=(new Scanner(System.in)).nextInt();
        numeroList[i+5]=(new Scanner(System.in)).nextInt();
        numeroList[i+6]=(new Scanner(System.in)).nextInt();
        
        System.out.println(numeroList[i]);
        System.out.println(numeroList[i+1]);
        System.out.println(numeroList[i+2]);
        System.out.println(numeroList[i+3]);
        System.out.println(numeroList[i+4]);
        System.out.println(numeroList[i+5]);
        System.out.println(numeroList[i+6]);
        */
        while(i<7){
            numeroList[i]=(new Scanner(System.in)).nextInt();
            System.out.println(numeroList[i]);
            i=i+1;
        }
        
        var textoList = new String[5];
        i=0;
        do{
             textoList[i]=(new Scanner(System.in)).next();
             System.out.println(textoList[i]);
            i=i+1;
        }while(i<5);
    
}
}
