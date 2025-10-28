package com.jasinski;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Linię wyżej znajduje się komentarz dodany przez IDE IntelliJ.

// To jest komentarz - tutaj mogę wszystko pisać
// To jest klasa Main
public class Main {
    // to jest funkcja main - drzwi wejściowe do programu.
    // Podczas uruchamiania tej aplikacji, Java szuka sobie takiej metody, która
    // ma nazwę main i ją wykonuje.
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // w skrócie, żeby napisać poniższą linię można użyć "sout" i kliknąć "Tab" lub "Enter".
        System.out.println("Hello and welcome!");

        // Wypisuję swoje imię
        System.out.println("Szymon");

        // Zmienne
        // specjalna zmienna string - ciąg znaków
        String lastname = "Jasiński"; // cudzysłów służy do użycia Stringa
        // podstawowe zmienne prymitywne
        // różnią się od Stringa tym, że piszemy je z małej litery
        // (na razie tylko tyle potrzebujemy wiedzieć)
        char favoriteLetter = 'A'; // apostrof służy do użycia character
        int age = 30;
        double weight = 72.5;
        boolean hasWhiteHair = false;

        // arrays, czyli po polsku "tablice" - o tym jeszcze później. Można pominąć.
        int[] numbers = new int[1000];
        char[] letter = new char[8];

        // Wypisujemy wartość ze zmiennej nazwanej "lastname".
        System.out.println(lastname);

        // Stwórz kilka zmiennych, mogą być podobne do powyższych przykładów.
        // Wypisz je do konsoli.

        // rozwiązanie wypisywania (tworzenie jest wyżej):
        System.out.println(favoriteLetter);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(hasWhiteHair);

        // Obliczenia
        // operatory arytmetyczne
        // + - dodawanie
        // - - odejmowanie
        // / - dzielenie
        // * - mnożenie
        // % - modulo (czyli reszta z dzielenia) - o tym jeszcze później

        // Tworzę tutaj dwie przykładowe zmienne - a oraz b
        double a = 3;
        double b = 2;

        // Wykonuję różne operacje na zmiennych a oraz b i przypisuję je do nowych zmiennych
        double suma = a + b;
        double roznica = a - b;
        double wynikDzielenia = a / b;
        double wynikMnozenia = a * b;

        // Wypisuję nowo stworzone, powyższe zmienne do konsoli przeglądarki korzystając z sout.
        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(wynikDzielenia);
        System.out.println(wynikMnozenia);

        // w tym miejscu program dochodzi do końca kodu - kończy zatem swoje działanie.
    }
}