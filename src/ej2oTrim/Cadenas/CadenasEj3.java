package ej2oTrim.Cadenas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CadenasEj3 {
    //programa que pida dos cadenas de texto y luego las muestre en orden alfabético.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String r;
        String r2;
        System.out.println("Introducir dos cadenas de texto: ");
        String cadena1 = in.nextLine();
        String cadena2 = in.nextLine();

        for (int i = 0; i < cadena1.length();i++) {
            for (int j = 0; j < cadena1.length();j++) {
                r = cadena1.substring(i,j);
                lista.add(r);
            }
        }

        for (int i = 0; i < cadena2.length();i++) {
            for (int j = 0; j < cadena2.length();j++) {
                r2 = cadena2.substring(i,j);
                lista.add(r2);
            }
        }

        Collections.sort(lista);

        for(int i = 0; i < lista.size();i++) {
            System.out.println(lista.get((i)));
        }
    }
}
