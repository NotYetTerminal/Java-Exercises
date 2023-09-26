public class Address
{
    private String street;
    private String town;
    private String county;

    public Address(String street, String town, String county)
    {
        setStreet(street);
        setTown(town);
        setCounty(county);
    }

    // setters and getters
    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getStreet()
    {
        return street;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public String getTown()
    {
        return town;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String getCounty()
    {
        return county;
    }

    public String toString()
    {
        return "Street: " + getStreet() +
               ", Town: " + getTown() +
               ", County: " + getCounty();
    }
}
