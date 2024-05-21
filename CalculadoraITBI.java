import javax.swing.*;

public class CalculadoraITBI {

    public static void main(String[] args){

        double resultado, maiorValor, transacao, venal, itbi;

        transacao = Double.valueOf(JOptionPane.showInputDialog(null,
         "Digite o valor da transacao de um imovel"));

        venal = Double.valueOf(JOptionPane.showInputDialog(null,
         "Digite o valor venal do imovel: "));

        itbi = Double.valueOf(JOptionPane.showInputDialog(null,
         "Digite a porcentagem de imposto ITBI: "));


        if(transacao > venal) maiorValor = transacao;
        else maiorValor = venal;

        resultado = (maiorValor * itbi) / 100;

        JOptionPane.showMessageDialog(null, "O valor do imposto ITBI eh de: " + resultado);
    }
}
