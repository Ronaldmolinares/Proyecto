package controller;

import model.*;
import view.IoManager;
import model.Patient;
import exceptions.DuplicateException;
import exceptions.ValueNotFoundException;

public class Control {
    IoManager io;
    MedicalPractice medPractice = new MedicalPractice();

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
                        this.addMedicalPractice();
                        break;
                    case 2:
                        this.addDoctor();
                        break;
                    case 3:
                        this.addPacient(io.readGraphicInt("Digite ID"));
                        break;
                    case 4:
                        this.generateBillPacient();
                        break;
                    case 5:
                        this.generateBillMedicalPractice();
                        break;
                    case 6:
                        break;
                    default:
                        io.showGraphicMessage("You have selected an invalid option!");
                        break;
                }
            } catch (NumberFormatException e) {
                io.showGraphicErrorMessage("You must enter an integer");
                io.showGraphicErrorMessage(e.getMessage());
            }
        } while (opcion != 6);
        io.showGraphicMessage("See you later");
    }

    private void addMedicalPractice() {
        medPractice = new MedicalPractice(
                io.readGraphicInt("Digite the ID from MedicalPractice"),
                io.readGraphicString("Digite the name"),
                io.readGraphicString("Digite the City"),
                io.readGraphicString("Digite the Adress"));
        io.showGraphicMessage("MedicalPractice created succesfully");
        io.showGraphicMessage(medPractice.toString());
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
                        io.readGraphicString("Insert gender: "),
                        bithday = new Date(io.readGraphicShort("Digite the day"),
                                io.readGraphicShort("Digite the month"), io.readGraphicShort("Digite the year")));
                medPractice.addPatient(patient);
                io.showGraphicMessage("Doctor generated");
                io.showGraphicMessage(patient.toString());
            } else {
                Exception e = new DuplicateException("This patient already exists");
                io.showGraphicErrorMessage(e.getMessage());
            }
        } catch (Exception em) {
            Exception e = new ValueNotFoundException("An error occurred when creating patient");
            io.showGraphicErrorMessage(e.getMessage());
        }
    }

    private void generateBillMedicalPractice() {
    }

    private void generateBillPacient() {
    }

}
