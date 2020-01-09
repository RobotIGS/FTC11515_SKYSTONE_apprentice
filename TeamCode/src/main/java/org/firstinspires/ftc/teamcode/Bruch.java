package org.firstinspires.ftc.teamcode;



public class Bruch {
    int Nenner, Zähler;
    int kürzer;

    public Bruch(int nenner, int zähler){
        this.Nenner = nenner;
        this.Zähler = zähler;
    }

    public Bruch mal(Bruch A, Bruch B){
         int ENenner = A.Nenner * B.Nenner;
         int EZähler = A.Zähler * B.Zähler;
         return new Bruch(ENenner, EZähler);

    }

    public Bruch teil(Bruch A, Bruch B){
        int ENenner = A.Nenner / B.Nenner;
        int EZähler = A.Zähler / B.Zähler;
        return new Bruch(ENenner, EZähler);
    }

    public Bruch kürz(Bruch A, int kürzer ) {
        for (kürzer = Nenner; kürzer > 1; kürzer --) {
            if (Nenner % kürzer == 0 && Zähler % kürzer == 0){
                int ENenner = A.Nenner / kürzer;
                int EZähler = A.Zähler / kürzer;
                return  new Bruch(ENenner, EZähler);
            }
        }
        return null;
    }
}

class Nervt {
    public Nervt(){}
     Bruch TestBruch = new Bruch(5,10);
     Bruch TestBruch2 = new Bruch(4, 10);
     public void test() {
         this.TestBruch.mal(TestBruch, TestBruch2);
                return;
     }
}

