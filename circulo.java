import java.util.Math;
public class circulo{
    private double raio;
    public circulo(double raio){
        this.raio= isValidRaio(raio) ? raio : 1;
    }
    public getRaio(){
        return this.raio;
    }
    private boolean isValidRaio(double raio){
        if (raio>=0) {
            return true;
        }
        else{
            return false;
        }

    }
    public setRaio(double raio){
        if(isValidRaio(raio)){
            this.raio=raio;
        }
    }
    public double area(){
        return Math.PI*Math.pow(this.raio, 2);
    }
    public double circunferencia(){
        return 2*Math.PI*this.raio;
    }
}