import javax.swing.*;
import java.awt.*;
import java.io.*;


public class gui {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public gui() {
	layout();
    }
    
    public void layout() {
	frame = new JFrame("New Window");
	frame.setVisible(true);
	frame.setSize(600,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panel = new JPanel();
	panel.setBackground(Color.BLUE);
	
	button = new JButton("TEST");
	label = new JLabel("This is just a label");
	
	//Add
	//     Panel
	panel.add(button);
	panel.add(label);

	//     frame
	frame.add(panel);
    } 




    public static void main(String[] args) {
	new gui();

    }



}