package retangulo;
import ponto.Ponto;

public class Retangulo {
    public Ponto p1, p2, p3, p4;
    
    public Retangulo (int x1, int y1, int x2, int y2) {
        setP1(new Ponto(x1, y1));
        setP2(new Ponto(x2, y2));
        setP3(new Ponto(x1, y2));
        setP4(new Ponto(x2, y1));
    }
    
    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        setP1(p1);
        setP2(p2);
        setP3(p3);
        setP4(p4);
    }
        
        public Retangulo (Retangulo r){
        setP1(r.getP1());
        setP2(r.getP2());
        setP3(r.getP3());
        setP4(r.getP4());
    }
    //setters
        public void setP1(Ponto p){
            this.p1 = p;
    }
        public void setP2(Ponto p){
            this.p2 = p;
    }
    public void setP3(Ponto p){
            this.p3 = p;
    }
    public void setP4(Ponto p){
            this.p4 = p;
    }
    //getters
    public Ponto getP3(){
            return this.p3;
    }
    public Ponto getP4(){
            return this.p4;
    }
        public Ponto getP1(){
            return this.p1;
    }
        public Ponto getP2(){
            return this.p2;
    }
    public Retangulo (double x1, double x2, double y1, double y2){
        setP1(new Ponto (x1, y1));
        setP2(new Ponto (x2, y2));
        setP1(new Ponto (x1, y2));
        setP1(new Ponto (x2, y1));
    }
    
    public double calcularM(){
        // m = (y2-y1)/(x2-x1)
        double m = (getP2().getY() - getP1().getY())/(getP2().getX() - getP1().getX());
        return m;
    }
    
    public double calcularB(){
        //b = y1 - mx1
        double b = getP1().getY() - calcularM()*getP1().getX();
        return b;
    }
    
    public String toString(){
        String s = "P1: " + getP1().toString() + " P2: " + getP2().toString();
        s = s + "\nEq. da reta: y = " + calcularM() + "*x + " + calcularB();
        return s;
    }
}
