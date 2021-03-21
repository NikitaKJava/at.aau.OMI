package Exercise3;

/**
 * Created by Nikita on 13.03.2021 at 12:59
 */
class Brand {
    private String name;
    private String country;
    private String phone;
    private String email;

    public Brand(String name, String country, String phone, String email) {
        this.name = name;
        this.country = country;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
