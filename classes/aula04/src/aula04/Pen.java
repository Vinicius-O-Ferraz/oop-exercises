package aula04;

public class Pen {
    public String model;
    private float tip;
    private String color;
    private boolean capOn;

    public Pen(String model, float tip, String color){
        this.cap();
        this.model = model;
        this.tip = tip;
        this.color = color;
    }

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

   protected void cap(){
    this.capOn = true;
}

protected void uncap(){
    this.capOn = false;
}


public void status(){
    System.out.println("Pen model: "+ this.model);
    System.out.println("Pen color: "+ this.color);
    System.out.println("Pen capped: " + this.capOn);
    System.out.println("Pen tip: " + this.tip);
}

}
