package ie.atu.week10;

public class Customer extends Person_Instance {
    private String customerNumber;
    private boolean mailingList;

    public Customer(){
    }

    public Customer(String name, String address, String tele, String customerNumber, boolean mailingList) {
        super(name, address, tele);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString(){
        return super.toString() + " " + "customerNumber=" + customerNumber + " " + "mailingList=" + mailingList;
    }
}

