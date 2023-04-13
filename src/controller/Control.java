package controller;

import model.Doctor;
import model.MedicalPractice;
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
                        this.addPacient();
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

    private void addPacient() {
    }

    private void generateBillMedicalPractice() {
    }

    private void generateBillPacient() {
        try {
            int positionD = medPractice.findDoctor(io.readGraphicInt("Enter the doctor's ID"));
            
            int postionP = medPractice.findPatient(io.readGraphicInt("enter patient id"));
        
            if (positionD == -1) {
                throw new RuntimeException("the doctor does not exist");
            } else if (postionP == -1){
                throw new RuntimeException("the patient does not exist");
            } else {
                bill = new Bill(positionD, 
                medPractice.getPatients().get(medPractice.findPatient(postionP)), 
                io.readDouble("enter the amount"),
                io.readGraphicString("enter treatment"),
                date = new Date(io.readGraphicShort("enter the day"),
                                io.readGraphicShort("enter the month"),
                                io.readGraphicShort("enter the year") )
                                );

                medPractice.addBill(bill);
                io.showGraphicMessage((bill.toString()));
            }
    

        } catch (Exception e) {
			io.showGraphicErrorMessage(e.getMessage());
		}

    }

}
