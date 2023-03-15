/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        double baseT, alturaT, areaT;
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Altura do triângulo: ");
            alturaT = teclado.nextDouble();
            
            System.out.println("Base do triângulo: ");
             baseT = teclado.nextDouble();
        }

        areaT = (baseT*alturaT)/2;
        
        System.out.printf("Área do triângulo: " + areaT);
    }
}