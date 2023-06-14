import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.

        String str = JOptionPane.showInputDialog("Digite Algo: ");
        System.out.println(str);

        //int num = Integer.parseInt(str);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite Algo: "))+1;
        //Store the input as a String and print it.
        System.out.println(num);
        
        
        //Parse the input as an int.
        //Print its value +1
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
