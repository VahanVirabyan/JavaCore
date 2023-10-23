package homework1.medicalCenter.storage;

import homework1.medicalCenter.model.Doctor;
import homework1.medicalCenter.model.Patient;
import homework1.medicalCenter.model.Person;
import homework1.medicalCenter.util.DateUtil;

import java.util.Date;

public class Storage {

    private Person[] array = new Person[10];
    private int size;

    public void add(Person person) {
        if (size == array.length) {
            extend();
        }
        array[size++] = person;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = array[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = array[i];
            if (person.getId().equals(id)
                    && person instanceof Doctor) {
                deleteByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = array[i];
            if (person.getId().equals(id)
                    && person instanceof Doctor) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = array[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor )) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodaysPatient () {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Patient) {
                Patient patient = (Patient) array[i];
                if (DateUtil.isSameDay(today, patient.getDate())) {
                    System.out.println(patient);
                }
            }
        }
    }

    private void extend() {
        Person[] temp = new Person[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            array[j] = array[j + 1];
        }
        size--;
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDateTime) {
        for (int i = 0; i < size; i++) {
            Person person = array[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) &&
                patient.getDate().equals(registerDateTime)) {
                    return false;
                }
            }
        }
        return true;
    }
}
