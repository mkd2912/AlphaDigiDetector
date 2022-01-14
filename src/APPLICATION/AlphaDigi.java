
package APPLICATION;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlphaDigi {
    public static void main(String[] args) {
        JFrame frame= new JFrame("AlphaDigiDetector");
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton button=new JButton("Lets Play");
        frame.add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s=JOptionPane.showInputDialog("Enter your character!");
                char ch=s.charAt(0);
                if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){
                    JOptionPane.showMessageDialog(null, ""+ "You Enetered a Alphabet "+ch);
                }
                if(ch>='0'&&ch<='9'){
                    JOptionPane.showMessageDialog(null, ""+ "You Enetered a Digit "+ch);
                }
                else{
                    JOptionPane.showMessageDialog(null, ""+ "Not an alphabet or digit.");
                }
            }
        });
    }
    
}
