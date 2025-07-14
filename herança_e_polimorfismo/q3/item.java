package herança_e_polimorfismo.q3;

import java.util.List;

public abstract class item{
    protected String descricao;
    protected int qtd;
    public item(String descricao, int qtd){
        this.descricao = descricao;
        this.qtd = qtd;
    }
    public abstract double Get_Preco();
}
