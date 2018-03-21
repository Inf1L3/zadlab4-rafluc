/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {

    public String imie;
    public String nazwisko;
    public String Indeks;
    public String specjalność;
    public String rok;
    
    
       public Student(String imie, String nazwisko, String Indeks, String specjalność, String rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.Indeks = Indeks;
        this.specjalność = specjalność;
        this.rok = rok;
    }

    public Student(String imie, String nazwisko, String Indeks, String specjalność) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.Indeks = Indeks;
        this.specjalność = specjalność;
    }

    public Student(String imie, String nazwisko, String Indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.Indeks = Indeks;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void pokazStudent(){
            System.out.println("imie: "+this.imie);
            System.out.println("nazwisko: "+this.nazwisko);
            System.out.println("Indeks: "+this.Indeks);
            System.out.println("specjalność: "+this.specjalność);
            System.out.println("rok: "+this.rok);
        
    }
    
    
    
   /*
    public String imie;      //
    public String nazwisko;  // Pola klasy osoba
    public int wiek;         //
    public int nrindeksu;
    public String miasto;
    public String nazwaspecjalnosci;
    public String rokstudiow;

    
    // Konstruktor pierwszy
    public Student(String imie, String nazwisko, int wiek, int nrindeksu, String miasto, String nazwaspecjalnosci,String rokstudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.nrindeksu = nrindeksu;
        this.miasto = miasto;
        this.nazwaspecjalnosci = nazwaspecjalnosci;
        this.rokstudiow = rokstudiow;
    } 

    // Konstruktor drugi
    public Student(String imie, String nazwisko, String nazwaspecjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaspecjalnosci = nazwaspecjalnosci;
    }
    public Student(String imie, String nazwisko, int nrindeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrindeksu = nrindeksu;
    }
    
    public Student(String imie, String nazwisko, String rokstudiow, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokstudiow = rokstudiow;
        this.wiek = wiek;
        
    }

    
    //Metoda pokazująca dane osoby
    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("nr indeksu: " + this.nrindeksu);
        System.out.println("miasto: " + this.miasto);
    }*/
} //end class