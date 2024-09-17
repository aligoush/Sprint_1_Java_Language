package JUnit.n1exercise3;

public class Classroom {
    String[] people = new String[] {"John", "Jane", "Jack", "Jill"};
    public static void main(String[] args) {
        Classroom classA = new Classroom();
        classA.launchException();
    }
    public void launchException(){
        try{
            String person = this.people[people.length];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
