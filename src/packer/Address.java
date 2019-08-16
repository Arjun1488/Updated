package packer;

/**
 *
 * @author I.M.Bad
 */
public class Address {
    private String street;
    private String suburb;
    private String city;
    private String postcode;
    private Coordinates coordinates;

    public Address(String street, String suburb, String city, String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }

    
    //adding override to override
    @Override
    public String toString() {
        return 
                street + "\n" + //For street
                suburb + "\n" + // Suburb in address
                city + "\n" + //City where they live
                postcode; //Post code of address
        // For a proper address
    }
    /**
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
