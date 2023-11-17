package org.lessons.java.christmas;


import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Regalo> listaRegali = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        
        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci un regalo (oppure 'stop' per fermarti): ");
            String nomeRegalo = in.nextLine();

            if (nomeRegalo.equalsIgnoreCase("stop")) {
                continua = false;
            } else {
            	System.out.println("Inserisci nome del destinatario:");
            	String destinatario = in.nextLine();
            	
            	Regalo regalo =new Regalo(nomeRegalo, destinatario);
            	
                listaRegali.add(regalo);
                System.out.println("Lunghezza della lista: " + listaRegali.size());

                
                System.out.print("Vuoi inserire un altro regalo? (si/no): ");
                String risposta = in.nextLine();

                continua = risposta.equalsIgnoreCase("si");
            }
        }
        
        System.out.print("Come vuoi ordinare la lista? (nome/destinatario): ");
        String Ordine = in.nextLine();
        
        if (Ordine.equalsIgnoreCase("nome")) {
            Collections.sort(listaRegali, Comparator.comparing(Regalo::getNome));
        } else if (Ordine.equalsIgnoreCase("destinatario")) {
            Collections.sort(listaRegali, Comparator.comparing(Regalo::getDestinatario));
        } else {
            System.out.println("Modalità di ordinamento non valida. La lista verrà mostrata senza ordinamento.");
        }

        in.close();

       

        System.out.println("\nLista dei regali ordinata:");
        for (Regalo regalo : listaRegali) {
            System.out.println(regalo);
        }
    }
}



