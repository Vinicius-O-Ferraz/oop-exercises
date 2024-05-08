
public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Monark", 42, "M");
        System.out.println();
        System.out.println(person.getNome());
        System.out.println(person.getIdade());
        System.out.println(person.getSexo());
        person.FazerAniversario();

    } 
}