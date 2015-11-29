package Address;

public class MainAddress {
    public static void main(String[] args) {

        Address address = new Address();

        address.setIndex (12220);
        address.setCountry("Ukraine");
        address.setCity("Kuiv");
        address.setStreet("Balzaka");
        address.setHouse(16);
        address.setApartment(131);

        System.out.println("My address is :");
        System.out.println("Name\t    \tIndex");
        System.out.print("Index");
        System.out.print("\t     \t");
        System.out.println(address.getIndex());
        System.out.print("Country" );
        System.out.print("\t    \t");
        System.out.println(address.getCountry());
        System.out.print("City");
        System.out.print("\t      \t");
        System.out.println(address.getCity());
        System.out.print("Street");
        System.out.print("\t       \t");
        System.out.println(address.getStreet());
        System.out.print("House");
        System.out.print("\t     \t");
        System.out.println(address.getHouse());
        System.out.print("Apartment");
        System.out.print("\t   \t");
        System.out.println(address.getApartment());
    }
}
