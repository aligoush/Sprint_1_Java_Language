package n1exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> countries = new HashMap<>();
        int points = 0;
        String dataOutput = "";
        File myFile = new File(
                "S1.03-Java Collections/n1exercise3/countries.txt");
        File myFileOutput = new File("S1.03-Java Collections/n1exercise3/classification.txt");
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] data = line.split("\\s+");
            if (data.length == 2) {
                countries.put(data[0], data[1]);
            }
        }
        for (HashMap.Entry<String, String> entry : countries.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
        String userName = Main.readInput("Insert your name: ");
        ArrayList<Integer> randomNumbersShown = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            String country = Main.showRandomCountry(countries,randomNumbersShown);
            String userInput = Main.readInput("The capital of the " + country + " is: ");

            if (countries.get(country).equalsIgnoreCase(userInput)) {
                points++;
                System.out.println("You've got it!");
            } else {
                System.out.println("It should have been " + countries.get(country));
            }
        }
        dataOutput = userName.concat(" " + points + "\n");
        Main.writeToFile(myFileOutput, dataOutput);
        System.out.println(dataOutput);
    }

    public static String readInput(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String showRandomCountry(HashMap<String, String> countries,ArrayList<Integer> randomNumbersShown) {
        ArrayList<String> list = new ArrayList<>(countries.keySet());
        Random random = new Random();
        int indexCountries = random.nextInt(list.size());
        if(randomNumbersShown.isEmpty()){
            randomNumbersShown.add(indexCountries);
        } else {
            while(randomNumbersShown.contains(indexCountries)){
                indexCountries = random.nextInt(list.size());
            }
            randomNumbersShown.add(indexCountries);
        }
        String key = list.get(indexCountries);
        return key;
    }

    public static void writeToFile(File myFile, String data) {
        try {
            Files.writeString(myFile.toPath(), data, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }


}


