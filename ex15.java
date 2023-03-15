// João Antonio Dias, KETHLYN DA SILVA LOPESimport java.util.Scanner;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lendo os valores da cotação do dólar e da quantidade de dólares
        System.out.print("Digite o valor da cotação do dólar: ");
        double cotacaoDolar = input.nextDouble();
        System.out.print("Digite a quantidade de dólares: ");
        double quantidadeDolares = input.nextDouble();
        
        // Calculando o valor em Reais correspondente
        double valorReais = cotacaoDolar * quantidadeDolares;
        
        // Exibindo o resultado
        System.out.println("O valor correspondente em Reais é: R$" + valorReais);
    }
}

