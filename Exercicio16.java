/**
 * Discente: Kethlyn Lopes
 * Discente: João Dias
 */
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        double grau;
    
        try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Ângulo em graus(Opções disponíveis: 30º, 45º ou 60º): ");
        grau = teclado.nextDouble();
        }
    
        if(grau==30){
            System.out.println("Angulo escolhido = 30º");
            System.out.println("Seno:1/2");
            System.out.println("Cosseno:√3/2");
            System.out.println("Tangente:√3/3");
            System.out.println("Secante:2√3/3");
        }
        else{
            if(grau==45){
                System.out.println("Angulo escolhido = 45º");
                System.out.println("Seno:√2/2");
                System.out.println("Cosseno:√2/2");
                System.out.println("Tangente:1");
                System.out.println("Secante:√2");
            }
            else{
                if(grau==60){
                    System.out.println("Angulo escolhido = 60º");
                    System.out.println("Seno:√3/2");
                    System.out.println("Cosseno:1/2");
                    System.out.println("Tangente:√3");
                    System.out.println("Secante:2");
                }
            }
        }
    }
}
