public class Person {
    
    private String name;
    private Integer age;
    private String sex;

    public Person(String name, Integer age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age ;
    }

    public String getSex(){
        return sex;
    }



    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }


    public void havingBirthday(){
        this.age++;
        System.out.println(this.name + "Fez aniversário, agora ele tem " + this.age + " anos de idade");
    }

}
