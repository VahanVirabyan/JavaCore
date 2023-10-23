package homework1.medicalCenter;

import homework1.medicalCenter.model.Doctor;
import homework1.medicalCenter.model.Patient;
import homework1.medicalCenter.storage.Storage;
import homework1.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public final class MedicalCenterMain implements Commands {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Storage personStorage = new Storage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = SCANNER.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorByID();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatirntsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatient();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void printAllPatirntsByDoctor() {
        personStorage.print();
        System.out.println("Please chose Doctor id");
        String doctorId = SCANNER.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void addPatient() {
        personStorage.print();
        System.out.println("Please chose Doctor id");
        String doctorId = SCANNER.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id, name, surname, phone, registerDateTime(12-03-2023 12:00)");
            String patientDataStr = SCANNER.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setId(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setDate(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered!");
                } else {
                    System.out.println("doctor is unavailable in that time, please chose another time");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again!");
            }
        }else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void changeDoctorByID() {
        personStorage.print();
        System.out.println("Please chose Doctor id");
        String doctorId = SCANNER.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Pleasi input id, name, surname, phone, email, profession");
            String doctorDataStr = SCANNER.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(doctorData[4]);
            System.out.println("Doctor changed!");


        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void deleteDoctorById() {
        personStorage.print();
        System.out.println("Please chose Doctor id");
        String doctorId = SCANNER.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = SCANNER.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Pleasi input id, name, surname, phone, email, profession");
        String doctorDataStr = SCANNER.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setPhoneNumber(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            doctor.setProfession(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("Doctor added");
        } else {
            System.out.println("doctor with " + doctorId + "already exists!");
        }
    }
}
