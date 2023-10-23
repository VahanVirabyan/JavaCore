package homework1.medicalCenter.model;

 public abstract class Person {
    private String id;
    private String name;
    private String surname;
    private String phoneNumber;

     public Person(String id, String name, String surname, String phoneNumber) {
         this.id = id;
         this.name = name;
         this.surname = surname;
         this.phoneNumber = phoneNumber;
     }

     public Person() {
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
