// João Antonio Dias, KETHLYN DA SILVA LOPESimport java.util.Scanner;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lendo os valores de velocidade inicial, aceleração e tempo de percurso
        System.out.print("Digite o valor da velocidade inicial em m/s: ");
        double velocidadeInicial = input.nextDouble();
        System.out.print("Digite o valor da aceleração em m/s²: ");
        double aceleracao = input.nextDouble();
        System.out.print("Digite o valor do tempo de percurso em segundos: ");
        double tempo = input.nextDouble();
        
        // Calculando a velocidade final
        double velocidadeFinal = velocidadeInicial + aceleracao * tempo;
        
        // Convertendo para km/h
        velocidadeFinal *= 3.6;
        
        // Exibindo o resultado
        System.out.println("A velocidade final do automóvel é: " + velocidadeFinal + " km/h");
    }
}
