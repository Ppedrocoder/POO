public abstract class Figura3d {
    public abstract double GetVolume();
}
public class Esfera extends Figura3d {
    private double raio;
    public Esfera(double raio){
        this.raio = raio;
    }
    @Override
    public double GetVolume(){
        return (4/3) * 3.14 * this.raio*this.raio*this.raio;
    }
}
public class Cubo extends Figura3d {
    private double lado;
    public Cubo(double lado){
        this.lado = lado;
    }
    @Override
    public double GetVolume(){
        return this.lado*this.lado*this.lado;
    }
}
public static void main(String[] args){
    Figura3d esfera = new Esfera(12.5);
    Figura3d cubo = new Cubo(17.2);
    cubo.GetVolume();
    esfera.GetVolume();
}