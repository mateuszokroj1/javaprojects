package com.github.mateuszokroj1.javaprojects.zadanie1;

public class Prostokat {
    public Punkt punkt;
    public int szerokosc;
    public int wysokosc;

    public Prostokat(Punkt punkt, int szerokosc, int wysokosc){
        this.punkt = punkt;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public Prostokat(){
        this.punkt = new Punkt();
        this.szerokosc = 0;
        this.wysokosc = 0;
    }

    public Punkt pobierzPunktKoncowy(){
        return new Punkt(this.punkt.x + this.szerokosc, this.punkt.y + this.wysokosc);
    }

    public void obrocO90Stopni(){
        int temp = this.szerokosc;
        this.szerokosc = this.wysokosc;
        this.wysokosc = temp;
    }
}
