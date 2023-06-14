import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String corpo = JOptionPane.showInputDialog("Parte do corpo que você gosta");
        String comida = JOptionPane.showInputDialog("Comida favorita");
        String nomeAmigo = JOptionPane.showInputDialog("Nome de um amigo");
        String elogio = JOptionPane.showInputDialog("Escreva um elogio para ele");
        String palavra = JOptionPane.showInputDialog("Uma palavra aleatória");
        String animal = JOptionPane.showInputDialog("Digite o nome de um animal");

        JOptionPane.showMessageDialog(null,"Ola " + nome + " você é um/a " + elogio +".\n"
                + "Eu sei que você tem uma queda pela/o " + corpo + " de um/a " + animal + ",\n" +
                "não julgo, mas gostaria de saber se você quer assistir " + comida + " e a Pedra Filosofal,\n" +
                "enquanto comemos " + palavra + " frito/a. Beijos " + nomeAmigo,"Mensagem de um Amigo",0);
    }   
}