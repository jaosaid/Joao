/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        double arestaQ, areaQ;
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor da aresta do quadrado: ");
            arestaQ = teclado.nextDouble();    
        }

        areaQ = arestaQ*arestaQ;

        System.out.println("Aresta do Quadrado " + arestaQ);
        System.out.printf("Área do Quadrado: " + areaQ);
    }
}