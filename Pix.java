public class Pix implements Pagamento {
    public boolean autorizar(double valor){
        return valor <= 5000;
    }
}
