package n1exercise2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("The program needs one argument: the path of the directory");
        } else {
            String path = args[0];
            listSortedDirectoryInLevels(path, 0);
        }
    }
    public static void listSortedDirectoryInLevels(String path, int level) {
        File directory = new File(path);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if(!directory.exists() || !directory.isDirectory()){
            System.out.println("The path is not a valid directory");
            return;
        }
        File[] files = directory.listFiles();
        if(files != null){
            Arrays.sort(files);
            for(File file : files) {
                String indent = " ".repeat(level * 4);
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = dateFormat.format(file.lastModified());
                System.out.println(indent + type + " - " + file.getName() + " - " + lastModified);

                if(file.isDirectory()){
                    listSortedDirectoryInLevels(file.getPath(), level + 1);
                }
            }
        } else {
            System.out.println("The directory is empty");
        }
    }
}
