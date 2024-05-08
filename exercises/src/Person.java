import javax.print.attribute.IntegerSyntax;

public class Person {
    
    public String nome;
    public Integer idade;
    public String sexo;

    public Person(String nome, Integer idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void FazerAniversario(){
        this.idade++;
        System.out.println(this.nome + "Fez aniversário, agora ele tem" + this.idade + "anos");
    }

}
