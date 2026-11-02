/*
 * TP0 - Exo2
 * Mahmoud ABOUKAMAR - 
 * Addition des nb premiers entiers
 * 02/11/2026
 */

import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; // indice

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb = sc.nextInt(); // on demande a sc de donner le prochain entier

        result = 0;

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind = ind + 1;
        }

        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est: " + result);
    }
}
