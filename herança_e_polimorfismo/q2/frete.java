package herança_e_polimorfismo.q2;

public abstract class frete {
    protected double distancia;
    protected double peso;
    public frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }
    public abstract double Get_Frete();
}
