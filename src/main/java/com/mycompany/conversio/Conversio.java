/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en euros");
        int valor_euro = sc.nextInt();
                
        double tipus_de_canvi = 0.87;
        System.out.println("  Actua lmentt equ ivalen a " + (valor_euro * tipus_de_canvi) + " lliures");
    }
}
