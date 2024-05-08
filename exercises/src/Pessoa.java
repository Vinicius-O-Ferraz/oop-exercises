import javax.print.attribute.IntegerSyntax;

public class Pessoa {
    
    public String nome;
    public Integer idade;
    public String sexo;

    public Pessoa(String nome, Integer idade, String sexo){
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

}
