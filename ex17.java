// João Antonio Dias, KETHLYN DA SILVA LOPESimport java.util.Scanner;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lendo os valores de X e Y
        System.out.print("Digite o valor de X: ");
        double x = input.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = input.nextDouble();
        
        // Calculando X elevado a Y
        double resultado = Math.exp(y * Math.log(x));
        
        // Exibindo o resultado
        System.out.println("O resultado de " + x + " elevado a " + y + " é: " + resultado);
    }
}
