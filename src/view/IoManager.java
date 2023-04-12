package view;

import javax.swing.JOptionPane;

public class IoManager {

    public void showMenssage(String message) {
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

    public char readGraphicChar(String menssage) {
        this.showMenssage(menssage);
        return JOptionPane.showInputDialog(null, menssage).charAt(0);
    }

    public String readGraphicString(String menssage) {
        this.showMenssage(menssage);
        return JOptionPane.showInputDialog(null, menssage);
    }

    public short readGraphicShort(String message) {
        this.showMenssage(message);
        return Short.parseShort(JOptionPane.showInputDialog(null, message));
    }

    public int readGraphicInt(String message) {
        this.showMenssage(message);
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }

    public long readGraphicLong(String message) {
        this.showMenssage(message);
        return Long.parseLong(JOptionPane.showInputDialog(null, message));
    }

    public double readGraphicDouble(String message) {
        this.showMenssage(message);
        return Double.parseDouble(JOptionPane.showInputDialog(null, message));
    }

    public float readGraphicFloat(String message) {
        this.showMenssage(message);
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