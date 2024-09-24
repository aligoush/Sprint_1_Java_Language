package n1exercise5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class DirectoryLister  {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("The program needs one argument: the path of the directory");
        } else {
            String path = args[0];
            if((new File(path)).exists() && (new File(path)).isDirectory()){
                File directory = new File(path);
                ArrayList<DirectoryItem> items = new ArrayList<>();
                listSortedDirectoryInLevels(items, 0, directory);
                serialize(items);
                deserialize();
            } else if((new File(path)).exists() && (new File(path)).isFile()){
                readFile(path);
            } else {
                System.out.println("The path is not a valid directory");
            }
        }
    }

    public static void listSortedDirectoryInLevels(ArrayList<DirectoryItem> items, int level,  File directory){
        File[] files = directory.listFiles();
        if(files != null){
            Arrays.sort(files);
            for(File file : files) {
                items.add(new DirectoryItem(file.getName(), file.isDirectory(), file.lastModified()));
                if(file.isDirectory()){
                    listSortedDirectoryInLevels(items, level + 1, file);
                }
            }
        } else {
            System.out.println("The directory is empty");
        }
    }

    public static void readFile(String path){
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

    public static void serialize(ArrayList<DirectoryItem> items) {
        try(FileOutputStream fileOut = new FileOutputStream("directories.ser")){
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(items);
            System.out.println("Object has been serialized and saved in directories.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static void deserialize(){
        try(FileInputStream fileIn = new FileInputStream(("directories.ser"))){
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<DirectoryItem> items = (ArrayList<DirectoryItem>) objectIn.readObject();
            System.out.println("Object has been deserialized");
            for(DirectoryItem item: items){
                System.out.println(item);
            }
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

