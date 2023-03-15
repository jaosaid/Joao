/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        double n1, n2, n3, n4, mediaTotal;
              
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("1° Nota: ");
            n1 = teclado.nextDouble();

            System.out.println("2° Nota: ");
            n2 = teclado.nextDouble();

            System.out.println("3° Nota: ");
            n3 = teclado.nextDouble();

            System.out.println("4° Nota: ");
            n4 = teclado.nextDouble(); 
        }

        mediaTotal = (n1+n2+n3+n4)/4;
 
        System.out.printf("A média aritmética é: " + mediaTotal);
    }
    
}