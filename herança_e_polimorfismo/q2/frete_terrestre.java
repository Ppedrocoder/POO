package herança_e_polimorfismo.q2;

public class frete_terrestre extends frete {
    public frete_terrestre(double d, double p){
        super(d, p);
    }
    @Override
    public double Get_Frete( ){
        double frete = (peso * distancia) * 0.01;
        return frete;
    }
}
