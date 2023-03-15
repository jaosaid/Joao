// João Antonio Dias, KETHLYN DA SILVA LOPESimport java.util.Scanner;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lendo os valores de resistência e corrente elétrica
        System.out.print("Digite o valor da resistência em ohms: ");
        double resistencia = input.nextDouble();
        System.out.print("Digite o valor da corrente elétrica em amperes: ");
        double corrente = input.nextDouble();
        
        // Calculando a tensão
        double tensao = resistencia * corrente;
        
        // Exibindo o resultado
        System.out.println("A tensão do circuito é: " + tensao + " volts");
    }
}