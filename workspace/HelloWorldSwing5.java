import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;  


public class HelloWorldSwing5 {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        JButton b = new JButton("Press me!!!!!");
        JButton b1 = new JButton("Press me!!!!!");
        JButton b2 = new JButton("Press me!!!!!");

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 50));
        
        JLabel label2 = new JLabel("Thomas is the best Java Coder");
        label2.setFont(new Font("Arial", Font.PLAIN, 50));
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);


        frame.getContentPane().add(label);
        JMenuBar menuBar = new JMenuBar();
        JMenu m = new JMenu("Menu");

        JMenuItem myScreen =  new JMenuItem("My screen");
        JMenuItem buttonScreen =  new JMenuItem("Buttons!");

        menuBar.add(m);
        m.add(myScreen);
        m.add(buttonScreen);
        frame.setJMenuBar(menuBar);
        
       
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Something else");
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setHorizontalAlignment(SwingConstants.CENTER);
            }
            
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("I love Quincy Hunter Williams!");
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setHorizontalAlignment(SwingConstants.CENTER);
            }
            
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("I love BRENDEN HUUUUUU!");
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setHorizontalAlignment(SwingConstants.CENTER);
            }
            
        });
        frame.setContentPane(label);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(b);
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.getContentPane().add(menuBar);
        frame.revalidate();
        myScreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(label2);
                frame.getContentPane().setLayout(new FlowLayout());
                frame.getContentPane().add(menuBar);
                frame.revalidate();

            }
            
        });
        buttonScreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(label);
                frame.getContentPane().setLayout(new FlowLayout());
                frame.getContentPane().add(b);
                frame.getContentPane().add(b1);
                frame.getContentPane().add(b2);
                frame.getContentPane().add(menuBar);
                frame.revalidate();

            }
            
        });



        

        //Display the window.
        b.setBounds(50,100,95,30);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
