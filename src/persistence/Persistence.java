package persistence;

import java.io.*;
import java.util.ArrayList;

import view.*;

public class Persistence {
    static IoManager io;

    public Persistence() {
        io = new IoManager();
    }

    public static void writeFile(String content, String path) {
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file, true);
            fw.write(content);
            fw.close();
            io.showGraphicMessage("The File " + file.getName() + " was created successfully.");
        } catch (IOException e) {
            io.showGraphicErrorMessage("Error creating the file.");
            e.printStackTrace();
        }
    }
    
    public static ArrayList<String> readFileLine(String path) {
    	ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linea = br.readLine();
            while (linea != null) {
                lines.add(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            io.showGraphicErrorMessage("Error reading the file.");
            e.printStackTrace();
        }
        return lines;
    }

    public static void readFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linea = br.readLine();
            while (linea != null) {
                io.showGraphicMessage(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            io.showGraphicErrorMessage("Error reading the file.");
            e.printStackTrace();
        }
    }
}