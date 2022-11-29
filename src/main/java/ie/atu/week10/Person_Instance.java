package ie.atu.week10;

public class Person_Instance {
    private String name;
    private String address;
    private String tele;

    public Person_Instance(){
    }

    public Person_Instance(String name, String address, String tele){
        this.name=name;
        this.address=address;
        this.tele=tele;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }
    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString(){
        return "Person{" +
                "name'" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + tele + '\'' +
                '}';
    }
}
