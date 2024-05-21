import java.util.Scanner;

public class Resistencias {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
            int resis[] = new int[4], equivalente = 0,maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

            for(int i = 0; i < resis.length; i++){
                System.out.print(" Digite o valor da " + (i + 1) + " resistencia : ");
                resis[i] = input.nextInt();

                equivalente += resis[i];

                if(resis[i] > maior) maior = resis[i];
                if(resis[i] < menor) menor = resis[i];

            }


        System.out.println("A resistência equivalente é: " + equivalente);
        System.out.println("A maior resistência  é: " + menor);
        System.out.println("A menor resistência  é: " + maior);
    }
}


