import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("--- TABUADA DE UM NUMERO ---");
        System.out.print("Digite um numero para ver a sua tabuada: ");
        n = input.nextInt();

        for(int i = 0; i <= 10; i++){

            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}
