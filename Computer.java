public class Computer {
    String friendlyName;
    String computerName;
    String address;
    
    public Computer(String friendlyName){
        this.friendlyName = friendlyName;
        this.computerName = "HS-Lab-" + computerName;
        this.address = this.computerName;

    }
    public Computer(String friendlyName, String computerName, String address){
        this.friendlyName = friendlyName;
        this.computerName = computerName;
        this.address = address;
    }

}
