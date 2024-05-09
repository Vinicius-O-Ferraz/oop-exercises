package aula02;

public class Pen {
    
    //atributes declaration
    String model;
    String color;
    int charge;
    float tip;
    boolean capOn;

    //methods declaration
    void write(){
        if (this.capOn){
            System.out.println("Error");
            System.out.println("Can't write the cap is on");
        }
        else{
            System.out.println("Writing things down");
        }
    }

    void cap(){
        this.capOn = true;
    }

    void uncap(){
        this.capOn = false;
    }

    void status(){
        System.out.println("Pen model: "+ this.model);
        System.out.println("Pen color: "+ this.color);
        System.out.println("Pen capped: " + this.capOn);
        System.out.println("Pen charge: " + this.charge);
        System.out.println("Pen tip: " + this.tip);
    }


}
