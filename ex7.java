// João Antonio Dias, KETHLYN DA SILVA LOPESimport java.util.Scanner;

import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
    double valor1 = scanner.nextDouble();

    System.out.print("Digite o segundo valor: ");
    double valor2 = scanner.nextDouble();

    double mediaGeometrica = Math.sqrt(valor1 * valor2); // Calcula a média geométrica dos valores digitados

    System.out.println("A média geométrica de " + valor1 + " e " + valor2 + " é: " + mediaGeometrica);

    scanner.close();
  }
}
