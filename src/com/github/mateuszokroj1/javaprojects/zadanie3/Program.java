package com.github.mateuszokroj1.javaprojects.zadanie3;

import java.util.Scanner;

public class Program{
     public static void main(String []args){
        UczenKlasy uczen=new UczenKlasy();
        Scanner scanner=new Scanner(System.in);
        uczen.Ustaw_Imie(scanner.nextLine());
        uczen.Ustaw_Nazwisko(scanner.nextLine());
        uczen.Ustaw_Pesel(scanner.nextLine());
        uczen.Ustaw_Szkole(scanner.nextLine());
        uczen.Ustaw_Klase(scanner.nextInt());
     }
}
