
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author komputer 18
 */
public class MyLayout extends JFrame{
    JButton b1,b2,b3,b4,b5;
    
    public MyLayout(){
        super("Border Layout");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        b1 = new JButton("NORT");
        b2 = new JButton("SOUTH");
        b3 = new JButton("EAST");
        b4 = new JButton("WEST");
        b5 = new JButton("CENTER");
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(b1,BorderLayout.NORTH);
        panel.add(b2,BorderLayout.SOUTH);
        panel.add(b3,BorderLayout.EAST);
        panel.add(b4,BorderLayout.WEST);
        panel.add(b5,BorderLayout.CENTER);
        
        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args){
        MyLayout layout = new MyLayout();
    }
}
