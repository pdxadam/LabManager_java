import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI extends JFrame{
    UI_ComputerList cList;
    public UI(){
        super();
        this.setLayout(new BorderLayout());
        this.cList = new UI_ComputerList();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(cList, BorderLayout.CENTER);
        
        JPanel buttonRow = new JPanel();
        buttonRow.setBounds(200, 200, 300, 100);
        JButton testButton = new JButton("Test Me");
        buttonRow.add(testButton);
        this.getContentPane().add(buttonRow, BorderLayout.SOUTH);
        
        this.setPreferredSize(new Dimension(300, 300));
        this.pack();

    }
    public void setComputerList(ArrayList<Computer> computers){
        cList.setComputerList(computers);
    }
}

