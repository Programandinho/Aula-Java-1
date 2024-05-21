import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valor, desconto, resultado;

        System.out.print("Digite o valor do produto: ");
        valor = input.nextFloat();

        System.out.print("Digite o valor de desconto: ");
        desconto = input.nextFloat();

        resultado = valor - ((valor * desconto) / 100);

        System.out.println("O produto com o desconto fica no valor de: " + resultado);
    }
}