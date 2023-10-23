package homework1.medicalCenter.model;

public class Doctor extends Person {
    private String email;
    private String professional;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String professional) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.professional = professional;
    }

    public Doctor(String email, String professional) {
        this.email = email;
        this.professional = professional;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return professional;
    }

    public void setProfession(String professional) {
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", professional='" + professional + '\'' +
                "} " + super.toString();
    }
}