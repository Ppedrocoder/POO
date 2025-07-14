package herança_e_polimorfismo.q3;

public class servico extends item {
    private int tempo;
    public servico(String descricao, int qtd){
        super(descricao, qtd);
    }
    @Override
    public double Get_Preco(){
        return tempo * 100.00;
    }
}
