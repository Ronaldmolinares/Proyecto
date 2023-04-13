package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IoManager {
    private Scanner scanner;

    public IoManager() {
        scanner = new Scanner(System.in);
    }

    public char readChar(String menssage) {
        this.showMessage(menssage);
        return scanner.next().charAt(0);
    }

    public String readString(String message) {
        this.showMessage(message);
        return scanner.nextLine();
    }

    public short readShort(String message) {
        showMessage(message);
        return scanner.nextShort();
    }

    public int readInt(String message) {
        showMessage(message);
        return scanner.nextInt();
    }

    public long readLong(String message) {
        showMessage(message);
        return scanner.nextLong();
    }

    public double readDouble(String message) {
        showMessage(message);
        return scanner.nextDouble();
    }

    public float readFloat(String message) {
        this.showMessage(message);
        return scanner.nextFloat();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showMenssageInLine(String message) {
        System.out.print(message);
    }

    public void showArrayaString(String[] strings) {
        for (int contador = 0; contador <= strings.length - 1; contador++) {
            System.out.println(strings[contador]);
        }
    }

    // ----NUMERICAL DATA

    public char readGraphicChar(String message) {
        showMessage(message);
        return JOptionPane.showInputDialog(null, message).charAt(0);
    }

    public String readGraphicString(String message) {
        showMessage(message);
        return JOptionPane.showInputDialog(null, message);
    }

    public short readGraphicShort(String message) {
        this.showMessage(message);
        return Short.parseShort(JOptionPane.showInputDialog(null, message));
    }

    public int readGraphicInt(String message) {
        this.showMessage(message);
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }

    public long readGraphicLong(String message) {
        this.showMessage(message);
        return Long.parseLong(JOptionPane.showInputDialog(null, message));
    }

    public double readGraphicDouble(String message) {
        this.showMessage(message);
        return Double.parseDouble(JOptionPane.showInputDialog(null, message));
    }

    public float readGraphicFloat(String message) {
        this.showMessage(message);
        return Float.parseFloat(JOptionPane.showInputDialog(null, message));
    }

    public void showGraphicMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void showGraphicArrayString(String[] message) {
        String show = "";
        for (int i = 0; i < message.length; i++)
            show += message[i] + "\n";
        JOptionPane.showMessageDialog(null, show);
    }

    public void showGraphicArrayStringInLine(String[] message) {
        String show = "";
        for (int i = 0; i < message.length; i++)
            show += message[i] + "/";
        JOptionPane.showMessageDialog(null, show);
    }

    public void showGraphicErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public int readMenu() {
        String menuText = ("Welcome, select an option\n" +
                "1. Create Medical Practice\n" +
                "2. Create doctor\n" +
                "3. Create a patient\n" +
                "4. Generate Bill to patient\n" +
                "5. Generate Bill to medical practice\n" +
                "6. Exit");
        return readGraphicInt(menuText);
    }

}