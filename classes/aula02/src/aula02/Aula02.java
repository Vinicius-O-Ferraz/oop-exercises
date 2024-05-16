package aula02;

public class Aula02 {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.model = "bic";
        p1.tip = 0.5f;
        p1.charge = 100;
        p1.cap();
        p1.write();
        p1.status();

        Pen p2 = new Pen();
        p2.color = "black";
        p2.model = "compactor";
        p2.tip = 1;
        p2.charge = 100;
        p2.uncap();
        p2.write();
        p2.status();
    }
}
