package n1exercise4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) throws IOException {
        if(args.length != 1){
            System.out.println("The program needs one argument: the path of the directory");
        } else {

            String path = args[0];

            if((new File(path)).exists() && (new File(path)).isDirectory()){
                File directory = new File(path);
                File myFile = new File(
                        "directories.txt");
                try {
                    if(myFile.createNewFile()){
                        System.out.println("File created: " + myFile.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                }  catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,true));
                listSortedDirectoryInLevels(0,writer, directory);
                writer.close();

            } else if((new File(path)).exists() && (new File(path)).isFile()){
                readFile(path);
            } else {
                System.out.println("The path is not a valid directory");
            }
        }
    }
    public static void listSortedDirectoryInLevels(int level, BufferedWriter writer, File directory) throws IOException {
        File[] files = directory.listFiles();
        if(files != null){
            Arrays.sort(files);
            writeToFile(writer, files, level);
        } else {
            System.out.println("The directory is empty");
        }

    }
    public static void writeToFile(BufferedWriter writer, File[] files, int level) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for(File file : files) {
            String indent = " ".repeat(level * 4);
            String type = file.isDirectory() ? "D" : "F";
            String lastModified = dateFormat.format(file.lastModified());
            String line = indent + type + " - " + file.getName() + " - " + lastModified;
            System.out.println(line);
            writer.write(line);
            writer.newLine();

            if(file.isDirectory()){
                listSortedDirectoryInLevels(level + 1, writer, file);
            }
        }
    }
    public static void readFile(String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

