package objComposition;

public class CustomerRunner {


    public static void main(String[]args){
        Address homeAddress = new Address("line1","Dhaka","55478");
        Customer customer = new Customer("nandan",homeAddress); ;
        Address workAddress = new Address("line 1 for work","Dhaka","3540");
        customer.setworkAddress(workAddress);
    System.out.println(customer);
    }
}
