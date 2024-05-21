import javax.swing.*;

public class Media {

    public static void main(String [] args){

        int nota1, nota2, trabalho, media;
        String mensagem;

        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da primeira prova:"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da segunda prova:"));
        trabalho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do trabalho:"));

        media = (nota1 + nota2 + trabalho) / 3;

        JOptionPane.showMessageDialog(null, "A media final do aluno é: " + media);

        if(media >= 6) mensagem = "O aluno está aprovado!!!";
        else mensagem = "O aluno está reprovado";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
