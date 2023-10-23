package homework1.medicalCenter.model;

import java.util.Date;

public class Patient extends Person {
    private Doctor doctor;
    public Date date;

    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, Date date) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.date = date;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", date=" + date +
                "} " + super.toString();
    }
}
