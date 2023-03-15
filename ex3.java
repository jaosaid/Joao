// João Antonio Dias, KETHLYN DA SILVA LOPES

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da diagonal do quadrado: ");
    double diagonal = scanner.nextDouble();

    double lado = diagonal / Math.sqrt(2); // Calcula o lado do quadrado
    double area = lado * lado; // Calcula a área do quadrado

    System.out.println("A área do quadrado é: " + area);

    scanner.close();
  }
}
