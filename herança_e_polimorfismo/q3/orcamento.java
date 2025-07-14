package herança_e_polimorfismo.q3;
import java.util.List;

public class orcamento {
    private String cliente;
    private String data;
    private List<item> itens;
    public orcamento(String cliente, String data){
        this.cliente = cliente;
        this.data = data;
    }
    public void adicionar_item(item item){
        itens.add(item);
    }
    public double Total(){
        double result = 0.0;
        for (item item : itens) {
            result += item.Get_Preco();
        }
        return result;
    }
}
