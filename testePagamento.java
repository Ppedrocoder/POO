public class testePagamento {
    public static void main(String[] args) {
        Pagamento receba = new CartãoCredito(1000);
        Pagamento recebas = new Pix();
        System.out.println(receba.autorizar(10020));
        System.out.println(recebas.autorizar(700));
    }
}
