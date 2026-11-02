/*
 * TP0 - Exo1
 * Mahmoud ABOUKAMAR 
 * Programme qui dit bonjour et demande le prenom
 * 02/11/2026
 */

import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        System.out.println("Bonjour");

        String prenom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();

        // message perso
        System.out.println("Salut " + prenom + " !");

        System.out.println("Au revoir");
    }
}
