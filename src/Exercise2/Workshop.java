package Exercise2;

/**
 * Created by Nikita on 13.03.2021 at 13:00
 */
class Workshop {
    private String name;
    private String country;
    private int postcode;
    private String city;
    private String street;
    private String phone;

    public Workshop(String name, String country, int postcode, String city, String street, String phone) {
        this.name = name;
        this.country = country;
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
