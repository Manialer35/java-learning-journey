import javax.swing.JOptionPane;

public class GCD {
    public static void main(String[] args){
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("A = "));
        b = Integer.parseInt(JOptionPane.showInputDialog("B = "));

        while(a != b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        JOptionPane.showMessageDialog(null, "The GCD is: " + a);
    }
}
