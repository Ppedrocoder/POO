package herança_e_polimorfismo.q2;

public class Main {
    public static void main(String[] args) {
        frete_aereo frete_aereo = new frete_aereo(5, 200);
        frete_terrestre frete_terrestre = new frete_terrestre(5, 200);
        System.out.println(frete_aereo.Get_Frete());
        System.out.println(frete_terrestre.Get_Frete());
    }
}
