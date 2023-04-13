package controller;

import model.MedicalPractice;
import view.IoManager;

public class Control {
    IoManager io;
    MedicalPractice medicalPractice = new MedicalPractice();

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
        medicalPractice = new MedicalPractice(
                io.readInt("Digite the ID from MedicalPractice"),
                io.readString("Digite the name"), io.readString("Digite the City"),
                io.readString("Digite the Adress"));
        io.showMenssage(medicalPractice.toString());
        io.showMenssage("MedicalPractice created succesfully");

    }

    private void addDoctor() {
    }

    private void addPacient() {
    }

    private void generateBillMedicalPractice() {
    }

    private void generateBillPacient() {
    }

}
