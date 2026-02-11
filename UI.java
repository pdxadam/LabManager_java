import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class UI extends JFrame{
    UI_ComputerList cList;
    public UI(){
        super();
        this.setLayout(new BorderLayout());
        this.cList = new UI_ComputerList();
        this.getContentPane().add(cList, BorderLayout.CENTER);
        this.setVisible(true);

    }
    public void setComputerList(ArrayList<Computer> computers){
        cList.setComputerList(computers);
    }
}

