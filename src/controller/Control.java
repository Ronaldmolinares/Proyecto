package controller;

import model.*;
import view.IoManager;
import model.Patient;
import model.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import exceptions.DuplicateException;
import exceptions.ValueNotFoundException;
import model.Bill;

public class Control {
    IoManager io;
    MedicalPractice medPractice = new MedicalPractice();
    Bill bill = new Bill();
    Date date = new Date();

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
                        medPractice = new MedicalPractice(1,"confaboy", "Tunja", "calle 1");
                         Doctor doc = new Doctor(1, "carlos", "Carlitos", "3111524", "calle 23", "e@e.com", "nutricion");
                         Patient pat = new Patient(1, "luis", "luisito", "565656", "calle244", "b@.com", "masculino", date = new Date((short)1,(short) 1, (short)1));
                         medPractice.addPatient(pat);
                         medPractice.addDoctor(doc);
                        

                         Doctor doc1 = new Doctor(2, "carlos", "Carlitos", "3111524", "calle 23", "e@e.com", "nutricion");
                         Patient pat1 = new Patient(2, "luis", "luisito", "565656", "calle244", "b@.com", "masculino", date = new Date((short)1,(short) 1, (short)1));
                         medPractice.addPatient(pat1);
                         medPractice.addDoctor(doc1);
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
        io.showGraphicMessage(medPractice.getBills() + "\n");
    }

    private void generateBillPacient() {
        try {
            int positionD = medPractice.findDoctor(io.readGraphicInt("Enter the doctor's ID"));
            
            int positionP = medPractice.findPatient(io.readGraphicInt("enter patient id"));
        
            if (positionD == -1) {
                throw new RuntimeException("the doctor does not exist");
            } else if (positionP == -1){
                throw new RuntimeException("the patient does not exist");
            } 

            else if (positionD != -1 && positionP != -1){
                bill = new Bill(medPractice.getBills().size(), 
                medPractice.getPatients().get(positionP),
                io.readGraphicDouble("enter the amount"),
                io.readGraphicString("enter treatment"),
                date.getDate());

                medPractice.addBill(bill);
                io.showGraphicMessage((bill.toString()));
            }

        } catch (Exception e) {
			io.showGraphicErrorMessage(e.getMessage());
		}

    }


}
