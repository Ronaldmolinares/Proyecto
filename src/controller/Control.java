package controller;

import model.*;
import view.IoManager;
import exceptions.*;
import persistence.*;

public class Control {
    IoManager io;
    MedicalPractice medPractice = new MedicalPractice();
    Bill bill = new Bill();
    Date date = new Date();
    Persistence persistence = new Persistence();
    private static final String PATHBILLPATIENT = "src\\persistence\\resources\\outputBillsPatients\\";
    private static final String PATHBILLSCONSULTORY = "src\\persistence\\resources\\outputBillsMedicalPractice\\";

    public Control() {
        io = new IoManager();
    }

    public void init() {
        int opcion = 0;
        do {
            try {
                opcion = io.readMenu();
                switch (opcion) {

                    case 1:
                        this.addDoctor();
                        break;
                    case 2:
                        this.addPacient(io.readGraphicInt("Digite ID"));
                        break;
                    case 3:
                        Doctor doctor = new Doctor(1, "Marx", "Slown", "312321123", "Cll 25 N°3424", "sonia@gmail",
                                "Ortodoncista");
                        medPractice.addDoctor(doctor);
                        Patient patient = new Patient(1, "Camila", "Sosa", "312321123", "Cll 50 N°3424", "sonia@gmail",
                                 date = new Date((short) 21, (short) 03, (short) 2005));
                        medPractice.addPatient(patient);
                        Doctor doctor1 = new Doctor(2, "Meredith", "Gray", "312321123", "Cll 97 N°3424", "sonia@gmail",
                                "Ortodoncista");
                        medPractice.addDoctor(doctor1);
                        Patient patient1 = new Patient(2, "Ana", "Valenzuela", "312321123", "Cll 190 N°3424",
                                "sonia@gmail",
                                 date = new Date((short) 21, (short) 03, (short) 2005));
                        medPractice.addPatient(patient1);
                        this.generateBillPacient();
                        break;
                    case 4:
                        this.generateBillMedicalPractice();
                        break;
                    case 5:

                        break;
                    default:
                        io.showGraphicMessage("You have selected an invalid option!");
                        break;
                }
            } catch (NumberFormatException e) {
                io.showGraphicErrorMessage("You must enter an integer");
                io.showGraphicErrorMessage(e.getMessage());
            }
        } while (opcion != 5);
        io.showGraphicMessage("See you later");
    }

    private String generatePathBill(Bill bill) {
        String formattedDate = bill.getConsultationDate().replaceAll(":", "-");
        return PATHBILLPATIENT +
                bill.getPatient().getId() + "__" +
                bill.getNumberBill() + "__" +
                formattedDate + "__" +
                bill.getPatient().getLastName() + "__" +
                bill.getPatient().getName();
    }

    private void writeFile(String content, String path) {
        Persistence.writeFile(content, path);
    }

    private void readFile(String path) {
        Persistence.readFile(path);
    }

    private void addDoctor() {
        try {
            int id = io.readGraphicInt("Insert Doctor id.");
            if (medPractice.findDoctor(id) == -1) {
                Doctor d = new Doctor(id, io.readGraphicString("Insert name: "),
                        io.readGraphicString("Insert last name: "),
                        io.readGraphicString("Insert phone: "),
                        io.readGraphicString("Insert address: "),
                        io.readGraphicString("Insert email: "),
                        io.readGraphicString("Insert specialty: "));
                medPractice.addDoctor(d);
                io.showGraphicMessage("Doctor generated");
                io.showGraphicMessage(d.toString());

            } else {
                Exception e = new DuplicateException("This doctor already exists");
                io.showGraphicErrorMessage(e.getMessage());
            }
        } catch (Exception em) {
            Exception e = new ValueNotFoundException("This doctor already exists");
            io.showGraphicErrorMessage(e.getMessage());
        }
    }

    private void addPacient(int id) {
        try {
            if (medPractice.findPatient(id) == -1) {
                Date bithday = new Date();
                Patient patient = new Patient(
                        id,
                        io.readGraphicString("Insert name: "),
                        io.readGraphicString("Insert last name: "),
                        io.readGraphicString("Insert phone: "),
                        io.readGraphicString("Insert address: "),
                        io.readGraphicString("Insert email"),
                        bithday = new Date(io.readGraphicShort("Digite the day"),
                                io.readGraphicShort("Digite the month"), io.readGraphicShort("Digite the year")));
                medPractice.addPatient(patient);
                io.showGraphicMessage("Patient generated");
                io.showGraphicMessage(patient.toString());
            } else {
                Exception e = new DuplicateException("This patient already exists");
                io.showGraphicErrorMessage(e.getMessage());
            }
        } catch (Exception em) {

            Exception e = new ValueNotFoundException("An error occurred when creating patient");
            System.out.println(e.getStackTrace());
        }
    }

    private void generateBillMedicalPractice() {
        io.showGraphicMessage(medPractice.showBills());
        String formattedDate = date.getDate().replaceAll(":", "-");
        this.writeFile(medPractice.showBills(), (PATHBILLSCONSULTORY + "PATHBILLSCONSULTORY__" + formattedDate + "ID "
                + medPractice.getBills().get(medPractice.getBills().size() - 1).getNumberBill()));
    }

    private void generateBillPacient() {
        try {
            int positionD = medPractice.findDoctor(io.readGraphicInt("Enter the doctor's ID"));

            int positionP = medPractice.findPatient(io.readGraphicInt("Enter patient id"));

            if (positionD == -1) {
                throw new RuntimeException("The doctor does not exist");
            } else if (positionP == -1) {
                throw new RuntimeException("The patient does not exist");
            }

            else if (positionD != -1 && positionP != -1) {
                bill = new Bill(medPractice.getBills().size(),
                        medPractice.getPatients().get(positionP),
                        io.readGraphicDouble("Enter the amount"),
                        io.readGraphicString("Enter treatment"),
                        date.getDate());

                medPractice.addBill(bill);
                io.showGraphicMessage((bill.toString()));
            }
            String bag = "\t**********\t	BILL PATIENT  " + bill.getPatient().getId() + " "
                    + bill.getPatient().getName()
                    + "\t" + bill.getPatient().getLastName() + " \t **********\t\n"
                    + "Number Bill: " + bill.getNumberBill() + "\n"
                    + "Bill Date: " + bill.getConsultationDate() + "\n"
                    + "Data patient: " + bill.getPatient().toString() + "\n"
                    + "Amount: " + bill.getAmount() + "\n"
                    + "Treatment: " + bill.getTreatment()
                    + " was the best." + "\nSee you later";
            this.writeFile(bag, this.generatePathBill(bill));
        } catch (Exception e) {
            io.showGraphicErrorMessage(e.getMessage());
        }
    }
}