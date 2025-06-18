public class produto {
    private int preco;
    private String nome;
    public produto(String nome,int preco){
        this.nome=nome;
        this.preco=preco;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPreco(){
        return this.preco;
    }
    public int compareTo(produto outra) {
        // Ordena por idade, crescente
        return Integer.compare(this.preco, outra.preco);
    }
    @Override
    public String toString(){
        return this.nome+" vale "+this.preco;
    }
}
