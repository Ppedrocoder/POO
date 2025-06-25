import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class comparacoes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Toad");
        nomes.add("Mario");
        nomes.add("Luigi");
        nomes.add("João");
        Collections.sort(nomes);
        for (String string : nomes) {
            System.out.println(string);
        }
    }
}
