public class CartãoCredito implements Pagamento {
    private int limite;
    public CartãoCredito(int limite){
        this.limite=limite;
    }
    public boolean autorizar(double valor){
        return valor<=limite;
    }
}