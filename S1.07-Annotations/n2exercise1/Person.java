package n2exercise1;

@JsonSerializable(directory = "./S1.07-Annotations/n2exercise1")
public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toJson() {
        return "{\"name\":\"" + name + "\",\"surname\":\"" + surname + "\",\"age\":\"" + age + "\"}";
    }
}
