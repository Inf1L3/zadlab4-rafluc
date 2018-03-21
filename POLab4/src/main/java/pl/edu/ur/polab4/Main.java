/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.*;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        //ctrlspcxd
        
        Student jan = new Student("jan", "kowalski", "2345bg", "fizyka", "2");
        Student Zbigniew = new Student("Zbigniew", "Baran", "23452bg", "mechatronika", "2");
        Student Adam = new Student("Adam", "Adamiakowy", "2323bg", "Informatyka", "1");
        Student Ozjasz = new Student("Ozjasz", "Goldberg", "2215bg", "Prawo", "2");
        Zbigniew.pokazStudent();
        jan.pokazStudent();
        Adam.pokazStudent();
        Ozjasz.pokazStudent();

        Scanner odczyt = new Scanner(System.in);
        String imie;
        String nazwisko;
        String Indeks;
        String specjalność;
        String rok;
        System.out.println("podaj imie studenta");
        imie = odczyt.nextLine();
        System.out.println("podaj nazwisko studenta");
        nazwisko = odczyt.nextLine();
        System.out.println("podaj indeks studenta");
        Indeks = odczyt.nextLine();
        System.out.println("podaj specjalność studenta");
        specjalność = odczyt.nextLine();
        System.out.println("podaj rok studenta");
        rok = odczyt.nextLine();
        Student nowy = new Student(imie, nazwisko, Indeks, specjalność, rok);
        nowy.pokazStudent();
        
 
 

    }
    
}
