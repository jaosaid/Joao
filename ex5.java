import java.util.Scanner;

public class ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do diâmetro da esfera: ");
    double diametro = scanner.nextDouble();

    double raio = diametro / 2.0; // Calcula o raio da esfera
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3); // Calcula o volume da esfera

    System.out.println("O volume da esfera é: " + volume);

    scanner.close();
  }
}