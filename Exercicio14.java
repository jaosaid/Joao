/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        double rEsfera, vEsfera, aCubo, vCubo, vLivre;

        try(Scanner scan = new Scanner(System.in)){

        System.out.print("Raio da esfera: ");
        rEsfera = scan.nextDouble();

        System.out.print("Aresta do cubo: ");
        aCubo = scan.nextDouble();
        }

        vCubo = Math.pow(aCubo, 3);
        vEsfera = (4 * Math.PI * Math.pow(rEsfera, 3)) / 3;
        vLivre = vCubo - vEsfera;

        System.out.println("Volume livre: " + vLivre);
    }
    
}