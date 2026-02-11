
import java.util.ArrayList;

import javax.swing.*;

public class UI_ComputerList extends JPanel {
    ArrayList<JCheckBox> computerChecks = new ArrayList<JCheckBox>();
    public UI_ComputerList(){
        super();
    }
    public void setComputerList(ArrayList<Computer> computers){
        for (Computer c: computers){
            JCheckBox j = new JCheckBox(c.friendlyName);
            computerChecks.add(j);
            this.add(j);

        }
    }

}
