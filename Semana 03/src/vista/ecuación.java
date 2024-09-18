package vista;
public class ecuación {
    public double a,b,c,valor;
    public double valor(){
        valor=Math.pow(b, 2)-4*a*c;
        return valor;
    }
    double raiz1(){ //esta es la raiz positiva
        return (+b+Math.sqrt(valor))/(2*a);
    }
    double raiz2() { //esta es la raiz negativa
        return (-b-Math.sqrt(valor))/(2*a);
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void imprimir() {
        System.out.println("El valor de A es: "+getA());
        System.out.println("El valor de B es: "+getB());
        System.out.println("El valor de C es: "+getC());
        System.out.println("La primera raiz positiva es: "+raiz1());
        System.out.println("La segunda raiz negativa es: "+raiz2());
    }
}