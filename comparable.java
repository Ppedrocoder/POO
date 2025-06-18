import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparable {
    public static void main(String[] args){
        //questão1
        String[] lista={"Pedro","João","Eduardo","Leonardo","Mario"};
        Arrays.sort(lista);
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
        //questão2
        Integer[] lista_={1,5,7,9,12,15,8};
        Arrays.sort(lista_);
        Arrays.sort(lista_,Collections.reverseOrder());
        for(int i=0;i<lista_.length;i++){
            System.out.println(lista_[i]);
        }
        //questão3
        List<produto> produtos = Arrays.asList(
            new produto("Maçã",3),
            new produto("Banana",2),
            new produto("Kiwi",5),
            new produto("Melancia",15)
        );
        produtos.sort(new Comparator<produto>() {
            @Override
            public int compare(produto p1, produto p2) {
                return Integer.compare(p1.getPreco(), p2.getPreco());
            }
        });
        System.out.println(produtos);
        //questão4
        List<Aluno> alunos = Arrays.asList(
            new Aluno("João",55),
            new Aluno("Mario",72),
            new Aluno("Pedro",72),
            new Aluno("Takami",95)
        );
        alunos.sort(new Comparator<Aluno>() {
            @Override
            public int compare(Aluno p1, Aluno p2) {
                return p1.compareTo(p2);
            }
        });
        System.out.println(alunos);
    }
}