package aula04;

public class Pen {
    public String model;
    private float tip;

   public String getModel(){
    return this.model;
   }

   public void setModel(String model){
    this.model = model;
   }

   public float  getTip(){
    return this.tip;
   }

   public void setTip(float tip){
    this.tip = tip;
   }

   public void status(){
    System.out.println("Pen model: "+ this.model);
    System.out.println("Pen tip: " + this.tip);
}

}
