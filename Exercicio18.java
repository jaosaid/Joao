/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        double v1, v2, v3, v4, v5, total, pag, troco;
            
        try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Valor do 1º produto: ");
        v1 = teclado.nextDouble();
        System.out.println("Valor do 2º produto: ");
        v2 = teclado.nextDouble();
        System.out.println("Valor do 3º produto: ");
        v3 = teclado.nextDouble();
        System.out.println("Valor do 4º produto: ");
        v4 = teclado.nextDouble();
        System.out.println("Valor do 5º produto: ");
        v5 = teclado.nextDouble();

        System.out.println("Valor do pagamento: ");
        pag = teclado.nextDouble();

        }
    
        total = v1+v2+v3+v4+v5;
        troco = pag-total;
    
        System.out.println("Total dos produtos: " + total + " reais" );
        System.out.println("Troco: " + troco + " reais" );
    }
}