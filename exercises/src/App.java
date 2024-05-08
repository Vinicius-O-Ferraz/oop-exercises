
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Monark", 42, "M");
        System.out.println();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());
    } 
}