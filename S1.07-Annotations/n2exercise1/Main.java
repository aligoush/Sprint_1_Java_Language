package n2exercise1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Bob", "Richardson", 37);
        serializeObjectToJson(person);
    }

    public static void serializeObjectToJson(Object obj) throws IOException {
        Class<?> objClass = obj.getClass();
        if (objClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objClass.getAnnotation(JsonSerializable.class);

            String fileName = objClass.getSimpleName() + ".json";
            String directory = annotation.directory();

            File outputFile = new File(directory, fileName);

            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            try (FileWriter fileWriter = new FileWriter(outputFile,true)) {
                if (obj instanceof Person) {
                    String json = ((Person) obj).toJson();
                    fileWriter.write(json);
                    System.out.println("Serialized object to: " + outputFile.getAbsolutePath());
                } else {
                    System.out.println("Cannot serialize object, toJson method not found.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The class " + objClass.getSimpleName() + " is not annotated with @JsonSerializable.");
        }
    }
}
