package com.github.mateuszokroj1.javaprojects.zadanie1;

import java.io.Console;

public class Program {
    public static void main(){
        Prostokat kamera = new Prostokat(new Punkt(0,0), 40,40);
        int iloscZdjec = 0;
        System.out.println("Start");
        while(kamera.pobierzPunktKoncowy().y <= 500)
        {
            if(kamera.punkt.x == 0)
            {
                while(kamera.pobierzPunktKoncowy().x <= 600)
                {
                    iloscZdjec++;
                    kamera.punkt.x += 40;
                }
            }
            else {
                while(kamera.punkt.x > 0)
                {
                    iloscZdjec++;
                    kamera.punkt.x -= 40;
                }
            }
            kamera.punkt.y += 40;
        }
        System.out.print("Ilosc zdjec: ");
        System.out.println(iloscZdjec);
    }
}
