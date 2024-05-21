import java.util.Scanner;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {

        int idade, contri;
        String sexo;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite a sua idade atual ( entre 0 e 120 ): ");
            idade = input.nextInt();
        } while (idade > 120 || idade < 0);

        do {
            System.out.print("Digite o seu tempo de contribuição ( deve ser menor do que idade ): ");
            contri = input.nextInt();
            input.nextLine();
        } while (contri > idade);

        do {

            System.out.print("Digite o seu sexo ( masculino ou feminino ): ");
            sexo = input.nextLine().toLowerCase();
        } while (!sexo.equals("masculino") && !sexo.equals("feminino"));


        if (sexo.equals("masculino")) {

            // masculino
            if (idade > 65) {
                if (contri > 15) System.out.println("Voce já pode se aposentar");
                else {
                    System.out.println("Voce não pode se aposentar ainda");
                    System.out.println("Faltam: " + (15 - contri) + " anos de contribuição para você se aposentar");
                }
            } else {
                if (contri >= 35) System.out.println("Voce já pode se aposentar");
                else {
                    System.out.println("Voce ainda nao pode se aposentar");
                    System.out.println("Faltam: " + (35 - contri) + " anos de contribuição para você se aposentar");
                }

            }

        } else {
            // feminino
            if (idade > 62) {
                if (contri > 15) System.out.println("Voce já pode se aposentar");
                else {
                    System.out.println("Voce não pode se aposentar ainda");
                    System.out.println("Faltam: " + (15 - contri) + " anos de contribuição para você se aposentar");
                }
            } else {
                if (contri >= 30) System.out.println("Voce já pode se aposentar");
                else {
                    System.out.println("Voce ainda nao pode se aposentar");
                    System.out.println("Faltam: " + (30 - contri) + " anos de contribuição para você se aposentar");
                }
            }


        }
    }
}
