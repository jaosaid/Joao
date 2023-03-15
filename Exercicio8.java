/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        double valorMilha=1852, milha, quilometro;
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Milha marítima = ");
            milha = teclado.nextDouble();
            
        }

        quilometro = milha*valorMilha;

        System.out.println(milha + "em quilômetros equivale a: "+ quilometro + " quilômetros.");
    }
    
}