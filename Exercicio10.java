/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        double celcius, fahrenheit;
    
        try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Grau Celcius: ");
        celcius = teclado.nextDouble();
        }
    
        fahrenheit = (celcius*9/5) + 32;
    
        System.out.println("O valor " + celcius + " em celcius convertido para Fahrenheit:  " + fahrenheit);
    
    }
    
}