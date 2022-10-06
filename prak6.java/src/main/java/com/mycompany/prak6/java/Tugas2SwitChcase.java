/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak6.java;
import java.util.Scanner;
/**
 *
 * @author Musfara
 */
public class Tugas2SwitChcase {
    public static void main(String[] args) {
    Scanner go = new Scanner (System.in);

    int inputan;

    System.out.print("Masukan Angka : ");
    inputan = go.nextInt();

    switch(inputan){
        case 1:
            System.out.println("Satu !");
            break;
        case 2:
            System.out.println("Dua !");
            break;
        case 3:

            System.out.println("Tiga!");
            break;
        case 4:
            System.out.println("Empat !");
            break;
        case 5:
            System.out.println("Lima !");
            break;
        case 6:
            System.out.println("Enam !");
            break;
        case 7:
            System.out.println("Tujuh !");
            break;
        case 8:
            System.out.println("Delapan !");
            break;
        case 9:
            System.out.println("Sembilan !");
            break;
        case 10:
            System.out.println("Sepuluh !");
            break;
        default:
            System.out.println("Invalid Number !");
        }
    }
}
