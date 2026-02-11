public class MyController {
    private Lab lab;
    private UI ui;
    public MyController(Lab lab, UI ui){
        this.lab = lab;
        this.ui = ui;
        this.ui.setComputerList(lab.getComputers());
        this.ui.setVisible(true);
    }

}
