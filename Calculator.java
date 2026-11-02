/*
 * TP0 - Calculette
 * Mahmoud ABOUKAMAR - Groupe ...
 * Calculatrice simple : add, substract, multiply, divide, modulo
 * 02/11/2026
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operateur;
        int operande1;
        int operande2;
        int resultat = 0;

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        operateur = sc.nextInt();

        // on teste l'operateur avant de demander les nombres
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error : the operator must be between 1 and 5");
            System.exit(0);
        }

        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();

        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();

        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
        }

        System.out.println("The result is : " + resultat);
    }
}
