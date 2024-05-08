
public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Monark", 42, "M");
        System.out.println();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
        person.havingBirthday();

    } 
}