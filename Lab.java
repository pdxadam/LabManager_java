import java.util.ArrayList;

public class Lab {
    private ArrayList<Computer> computers = new ArrayList<Computer>();
    int rows, columns;
    String name;
    public Lab(String name){
        this.name = name;
    }   
    public void addComputer(Computer c){
        computers.add(c);

    }
    public ArrayList<Computer> getComputers(){
        return computers;
    }

}
