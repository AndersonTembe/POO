package Aula01;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km,miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a distancia: ");
        km = sc.nextDouble();
        miles = km/1.609;
        System.out.println("A distancia em miles e: " + miles);
        sc.close();
    }
    
}
