
public class App {
    public static void main(String[] args) throws Exception {
        Person[] p = new Person[2];
        Book[] b = new Book[3];

        p[0] = new Person("Pablito", 25, "M");
        p[1] = new Person("Ana", 29, "F");
        
        System.out.println(p[0]);
        System.out.println(p[1]);



    } 
}