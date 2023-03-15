/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        double alturaC, raioC, volumeC;
    
        try (Scanner teclado = new Scanner(System.in)) {
    
        System.out.println("Altura do cone : ");
        alturaC = teclado.nextDouble();
        System.out.println("Raio da base do cone : ");
        raioC = teclado.nextDouble();

        }
    
        volumeC = (3.14*Math.pow(raioC,2)*alturaC)/3;
    
        System.out.println("O volume do cone com altura " + alturaC + "e raio " + raioC + " é " + volumeC + "³");
    }
}