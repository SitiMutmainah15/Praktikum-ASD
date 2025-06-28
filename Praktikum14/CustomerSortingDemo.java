import java.util.ArrayList;

public class CustomerSortingDemo {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(3, "Zainab"));
        customers.add(new Customer(1, "Andi"));
        customers.add(new Customer(2, "Rara"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        
        System.out.println(customers);
    }
}
