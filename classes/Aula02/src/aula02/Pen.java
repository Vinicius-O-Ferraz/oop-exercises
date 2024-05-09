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

    }

    void cap(){
        
    }

    void uncap(){
        
    }

    void status(){
        System.out.println("A "+ this.color+ "pen");
        System.out.println("This pen is" + this.capOn);
    }


}
