
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Catalogo{
    private List<Livro> livros;
    private Set<String> autores;
    Map<Integer,List<Livro>> catalogo_por_ano;
    public void adicionar(Livro livro){
        String nomelista=;
        List<Livro> nomelista=new ArrayList();
        if (autores.contains(livro.getAutor()) || livros.contains(livro.getTitulo())) {
            
        }
        if (catalogo_por_ano.containsKey(livro.getAno())) {
            List<Livro> ano=catalogo_por_ano.get(livro.getAno());
            ano.add(livro);
        }
        else{
            catalogo_por_ano.put(livro.getAno(), new List<Livro>());
        }
        this.livros.add(livro);
        this.autores.add(livro.getAutor());
        
    }
    public List<Livro> getLivros(){
        return this.livros;
    }
}