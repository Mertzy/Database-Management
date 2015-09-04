import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertis01
 */
public class ToDoApp extends JFrame {

    /**
     * @param args the command line arguments
     */

    public ToDoApp() {

    	super();

    	this.setLayout(new BorderLayout());

    	JPanel top = new JPanel();
    	this.add(top,BorderLayout.NORTH);

    	JPanel bottom = new JPanel();
    	this.add(bottom,BorderLayout.CENTER);

    	top.setLayout(new GridBagLayout());
    	GridBagConstraints c = new GridBagConstraints();
    	c.gridx = 0;
    	c.gridy = 0;
    	top.add(new JLabel("ToDo", JLabel.RIGHT),c);

    	c = new GridBagConstraints();
    	c.gridx = 1;
    	c.gridy = 0;
    	c.anchor = GridBagConstraints.WEST;
    	c.fill = GridBagConstraints.HORZONTAL;
    	top.add(new JTextField("Ente To Do Here"),c);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        ToDoApp todo = new ToDoApp();
        todo.pack();
        todo.setVisible(true);
    }
    
}
