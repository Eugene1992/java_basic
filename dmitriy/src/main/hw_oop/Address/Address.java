package Address;

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    //getter

    public int getIndex() {
        return index;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public int getHouse() {
        return house;
    }
    public int getApartment() {
        return apartment;
    }

    //setter

    public void setIndex(int newIndex){
        index = newIndex;
    }
    public void setCountry(String newCountry){
        country = newCountry;
    }
    public void setCity(String newCity){
        city = newCity;
    }
    public void setStreet(String newStreet){
        street = newStreet;
    }
    public void setHouse(int newHouse){
        house = newHouse;
    }
    public void setApartment(int newApartment){
        apartment = newApartment;
    }

}




