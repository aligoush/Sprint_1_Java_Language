package n1exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("The program needs one argument: the path of the directory");
        } else {
            String path = args[0];
            listSortedDirectory(path);
        }
    }
    public static void listSortedDirectory(String path) {
        File directory = new File(path);
        if(!directory.exists() || !directory.isDirectory()){
            System.out.println("The path is not a valid directory");
            return;
        }
        String[] files = directory.list();
        if(files != null){
            Arrays.sort(files);
            for(String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("The directory is empty");
        }
    }
}
