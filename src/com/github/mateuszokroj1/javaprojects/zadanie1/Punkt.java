package com.github.mateuszokroj1.javaprojects.zadanie1;

public class Punkt {
    public int x;
    public int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt(){
        this.x = 0;
        this.y = 0;
    }

    public void przesun(int x, int y){
        this.x += x;
        this.y += y;
    }
}
