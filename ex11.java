// João Antonio Dias, KETHLYN DA SILVA LOPESimport java.util.Scanner;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lendo o valor do diâmetro
        System.out.print("Digite o valor do diâmetro em centímetros: ");
        double diametro = input.nextDouble();
        
        // Calculando a área
        double raio = diametro / 2.0;
        double area = Math.PI * Math.pow(raio, 2);
        
        // Exibindo o resultado
        System.out.println("A área do círculo é: " + area + " cm²");
    }
}