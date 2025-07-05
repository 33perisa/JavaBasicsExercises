package org.example;
import java.util.*;

public class TestResenja {
    public static int brojSamoglasnikaPreBroja(String tekst) {
        String samoglasnici = "aeiouAEIOU";
        int broj = 0;
        for (int i = 0; i < tekst.length() - 1; i++) {
            if (samoglasnici.contains(String.valueOf(tekst.charAt(i))) && Character.isDigit(tekst.charAt(i + 1))) {
                broj++;
            }
        }
        return broj;
    }

    public static List<Integer> sortirajPoPoslednjojCifri(List<Integer> brojevi) {
        brojevi.sort(Comparator.comparingInt(b -> b % 10));
        return brojevi;
    }

    public static void crtajOblik(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print("+");
            System.out.println();
        }
        for (int i = 0; i < n; i++) System.out.print("+");
        System.out.println();
    }

    public static void main(String[] args) {
        String tekst = "Danas1je2lep333dan44i555sunčano66je11";
        List<Integer> brojevi = Arrays.asList(12, 555, 437, 23, 87, 690, 222);
        int n = 5;

        System.out.println("Rezultat 1: " + brojSamoglasnikaPreBroja(tekst));
        System.out.println("Rezultat 2: " + sortirajPoPoslednjojCifri(new ArrayList<>(brojevi)));
        System.out.println("Rezultat 3:");
        crtajOblik(n);
    }
}
