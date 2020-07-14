package com.github.mateuszokroj1.javaprojects.zadanie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static int[] liczZnakiSlowa(String nazwaPlikuTekstowego) {
        int liczbaZnakow = 0;
        int liczbaBialychZnakow = 0;
        int liczbaSlow = 0;

        try {

            File file = new File(nazwaPlikuTekstowego);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (char c: line.toCharArray()) {
                    liczbaZnakow++;
                    if(Character.isWhitespace(c))
                        liczbaBialychZnakow++;
                }
                liczbaSlow += line.split("\\w").length;
            }
        }
        catch (FileNotFoundException exc){
            System.out.println("Nie znaleziono pliku.");
        }
        finally {
            return new int[]{ liczbaZnakow, liczbaBialychZnakow, liczbaSlow };
        }
    }

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo){
        try{
            File plikWe = new File(nazwaPlikWe);
            File plikWy = new File(nazwaPlikWy);
            if(!plikWy.exists())
                plikWy.createNewFile();

            Scanner scanner = new Scanner(plikWe);
            ArrayList<String> lines = new ArrayList<String>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.indexOf(slowo) > -1)
                    lines.add(line);
            }

            for (String line: lines) {
                FileWriter writer = new FileWriter(plikWy);
                writer.write(line);
                writer.append('\n');
            }
        }
        catch (FileNotFoundException exc){
            System.out.println("Nie znaleziono pliku wejscia.");
        }
        catch (IOException exc){
            System.out.println("Blad przy zapisie do pliku.");
        }
    }
}
