import java.io.IOException;
import java.util.Scanner;

public class Senha {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int cont = 3;
        String usuario, senha;

        while(cont > 0) {

            System.out.print("Digite o usuario: ");
            usuario = input.nextLine();
            System.out.print("Digite a senha: ");
            senha = input.nextLine();


            if (!usuario.equals("Java8") || !senha.equals("Java8")) {
                cont--;
                System.out.println("Usuario ou senha incorretos");
                System.out.println(cont + " tentativas restantes");
            }else{
                System.out.println("Dados Corretos");
                break;
            }
            if(cont < 1){
                System.out.println("Tentativas esgotadas");
                break;

            }
        }

    }

}
