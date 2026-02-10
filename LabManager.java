import java.awt.*;

import javax.swing.*;


public class LabManager{
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Lab Manager");
        JPanel top = new JPanel();
        // TOP PANEL
        top.setBackground(Color.blue);
        top.setPreferredSize(new Dimension(300, 50));

        frame.getContentPane().add(top, BorderLayout.PAGE_START);

        // middle-left panel
        JPanel left = new JPanel();
        left.setBackground(Color.yellow);
        left.setPreferredSize(new Dimension(75, 100));
        frame.getContentPane().add(left, BorderLayout.LINE_START);

        //Center panel
        JPanel center = new JPanel();
        center.setBackground(Color.cyan);
        center.setPreferredSize(new Dimension(150, 100));
        frame.getContentPane().add(center, BorderLayout.CENTER);

        //middle-right panel
        JPanel right = new JPanel();
        right.setBackground(Color.green);
        right.setPreferredSize(new Dimension(75, 200));
        frame.getContentPane().add(right, BorderLayout.LINE_END);

        //bottom panel
        JPanel bottom = new JPanel();
        bottom.setBackground(Color.red);
        bottom.setPreferredSize(new Dimension(300, 50));
        frame.getContentPane().add(bottom, BorderLayout.PAGE_END);

        //conter controls
        JLabel centerLabel = new JLabel("Hello World!", SwingConstants.CENTER);
        center.add(centerLabel, BorderLayout.CENTER);
        //show the grame
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);


    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });


    }
}