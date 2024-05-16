package uecpackage;

public class Fighter{

    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int losses;
    private int draws;

    public Fighter(String name, String nationality, int age, float height, float weight, int wins, int losses, int draws){

      this.name = name;
      this.nationality = nationality;
      this.age = age;
      this.height = height;
      this.weight = weight;
      this.wins = wins;
      this.losses = losses;
      this.draws = draws;
      this.setCategory(height);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(float height) {
        if(height <52.2){
            this.category = "invalid";
        }
        else if(height < 70.3){
            this.category = "lightweight";
        }
        else if(height < 83.9){
            this.category = "mediumweight";
        }
        else if(height < 120.2){
            this.category = "heavyweight";
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        setCategory(weight);
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public  void win() {
        setWins(getWins()+1);
    }

    public void lose(){
        setLosses(getLosses()+1);
    }
    
    public void draw(){
        setDraws(getDraws()+1);
    }

    public void presentation() {
        System.out.println("Name: "+ this.getName());
        System.out.println("Nationality: "+this.getNationality());
        System.out.println("Age: "+this.getAge()+ "years ");
        System.out.println("Height: "+this.getHeight() +" with meters tall");
        System.out.println("Weighting "+this.getWeight() +" kilograms");
        System.out.println("Winning: "+this.getWins());
        System.out.println("Losing: "+this.getLosses());
        System.out.println("Draw: "+this.getDraws());
        }
}
