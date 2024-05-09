package aula02;

public class Pen {
    
    //atributes declaration
    public String model;
    public String color;
    public float tip;
    protected int charge;
    protected boolean capOn;

    //methods declaration
    public void write(){
        if (this.capOn){
            System.out.println("Error");
            System.out.println("Can't write the cap is on");
        }
        else{
            System.out.println("Writing things down");
        }
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
        System.out.println("Pen charge: " + this.charge);
        System.out.println("Pen tip: " + this.tip);
    }
}
