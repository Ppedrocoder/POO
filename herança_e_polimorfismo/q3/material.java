package herança_e_polimorfismo.q3;

public class material extends item{
    private double precoCompra;
    public material(String descricao, int qtd){
        super(descricao, qtd);
    }
    @Override
    public double Get_Preco(){
        return precoCompra + (precoCompra * 0.15);
    }
}
