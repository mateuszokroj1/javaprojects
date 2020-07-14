package com.github.mateuszokroj1.javaprojects.zadanie3;
class Uczen
{
    public String Imie;
    public String Nazwisko;
    public String Pesel; 
    public void Ustaw_Imie(String imie)
    {
        Imie=imie;
    }
    public void Ustaw_Nazwisko(String nazwisko)
    {
        Nazwisko=nazwisko;
    }
    public void Ustaw_Pesel(String pesel)
    {
        Pesel=pesel;
    }
}
class UczenSzkoly extends Uczen
{
    public String Nazwa_Szkoly;
    public void Ustaw_Szkole(String nazwa)
    {
        Nazwa_Szkoly=nazwa;
    }
}
class UczenKlasy extends UczenSzkoly
{
    public int Klasa;
    public void Ustaw_Klase(int klasa)
    {
        Klasa=klasa;
    }
}