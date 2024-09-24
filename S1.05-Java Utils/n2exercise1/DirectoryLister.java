package n2exercise1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Properties;

public class DirectoryLister {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println("Current working directory: " + new File(".").getAbsolutePath());
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            System.out.println("An error occurred loading config.properties file."  + e.getMessage());
            return;
        }

        String directoryPath = properties.getProperty("directory.path");
        String outputFilePath = properties.getProperty("output.file");

        if (directoryPath == null || outputFilePath == null) {
            System.out.println("Invalid directory.path or output.file in config.properties.");
            return;
        }

        File outputFile = new File(outputFilePath);
        try {
            if (outputFile.createNewFile()) {
                System.out.println("File created: " + outputFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));
        listSortedDirectoryInLevels(directoryPath, 0, writer);
        writer.close();
    }

    public static void listSortedDirectoryInLevels(String path, int level, BufferedWriter writer) throws IOException {
        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The path is not a valid directory.");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            Arrays.sort(files);
            writeToFile(writer, files, level);
        } else {
            System.out.println("The directory is empty");
        }
    }

    public static void writeToFile(BufferedWriter writer, File[] files, int level) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File file : files) {
            String indent = " ".repeat(level * 4);
            String type = file.isDirectory() ? "D" : "F";
            String lastModified = dateFormat.format(file.lastModified());
            String line = indent + type + " - " + file.getName() + " - " + lastModified;
            System.out.println(line);
            writer.write(line);
            writer.newLine();

            if (file.isDirectory()) {
                listSortedDirectoryInLevels(file.getPath(), level + 1, writer);
            }
        }
    }
}

