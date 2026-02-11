import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.*;


public class LabManager{
    static ArrayList<Computer> computers = new ArrayList<Computer>();
    static ArrayList<JCheckBox> computerButtons = new ArrayList<JCheckBox>();
    
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Lab Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel top = new JPanel();
        // TOP PANEL
        top.setBackground(Color.blue);
        top.setPreferredSize(new Dimension(300, 50));

        frame.getContentPane().add(top, BorderLayout.NORTH);

        // middle-left panel
        JPanel left = new JPanel();
        left.setBackground(Color.yellow);
        left.setPreferredSize(new Dimension(75, 100));
        frame.getContentPane().add(left, BorderLayout.WEST);

        //Center panel
        JPanel center = new JPanel();
        
        center.setBackground(Color.cyan);
        center.setPreferredSize(new Dimension(150, 100));
        frame.getContentPane().add(center, BorderLayout.CENTER);
        for (Computer c : computers){
            JCheckBox b = new JCheckBox(c.friendlyName);
            b.setBounds(40,20,200,100);
            center.add(b);
            computerButtons.add(b);

        }

        //middle-right panel
        JPanel right = new JPanel();
        right.setBackground(Color.green);
        right.setPreferredSize(new Dimension(75, 200));
        frame.getContentPane().add(right, BorderLayout.EAST);

        //bottom panel
        JPanel bottom = new JPanel();
        bottom.setBackground(Color.red);
        bottom.setPreferredSize(new Dimension(300, 50));
        frame.getContentPane().add(bottom, BorderLayout.SOUTH);
        JButton cmdTest = new JButton(" Test me ");
        cmdTest.setBounds(40, 20, 200, 100);
        bottom.add(cmdTest);


        //conter controls
        JLabel centerLabel = new JLabel("Hello World!", SwingConstants.CENTER);
        center.add(centerLabel, BorderLayout.CENTER);
        //show the grame
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);


    }
    public static void main(String[] args){
        Lab lab = new Lab("Hillman Tech. Center");
        lab.addComputer(new Computer("mm-01"));
        lab.addComputer(new Computer("mm-02"));
        lab.addComputer(new Computer("mm-03"));
        

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                // createAndShowGUI();
                UI view = new UI();
                new MyController(lab, view);
            }
        });


    }
    public static void actionPerformed(ActionEvent e){
        System.out.println(e.getActionCommand());
    }
}