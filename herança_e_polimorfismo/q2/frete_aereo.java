package herança_e_polimorfismo.q2;

public class frete_aereo extends frete {
    private double seguro;
    public frete_aereo(double d, double p){
        super(d, p);
    }
    @Override
    public double Get_Frete( ){
        frete_terrestre frete_terrestre = new frete_terrestre(distancia, peso);
        double frete = (2 * frete_terrestre.Get_Frete()) + (seguro * 0.01);
        return frete;
    }
}
