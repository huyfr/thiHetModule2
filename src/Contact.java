public class Contact {

    private int phoneNumber;
    private String crew;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;

    public Contact() {
    }

    public Contact(int phoneNumber, String crew, String name, String gender, String address, String dateOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.crew = crew;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Date of birth: " + dateOfBirth + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Crew: " + crew + "\n" +
                "Address: " + address + "\n" +
                "Email: " + email + "\n";
    }
}
