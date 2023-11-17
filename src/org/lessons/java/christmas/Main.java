package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listaRegali = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        
        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci un regalo (oppure 'stop' per fermarti): ");
            String regalo = in.nextLine();

            if (regalo.equalsIgnoreCase("stop")) {
                continua = false;
            } else {
                listaRegali.add(regalo);
                System.out.println("Lunghezza della lista: " + listaRegali.size());

                
                System.out.print("Vuoi inserire un altro regalo? (si/no): ");
                String risposta = in.nextLine();

                continua = risposta.equalsIgnoreCase("si");
            }
        }

        in.close();

       

        System.out.println("\nLista dei regali ordinata:");
        for (String regalo : listaRegali) {
            System.out.println(regalo);
        }
    }
}



