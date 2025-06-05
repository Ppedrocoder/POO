import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class termo{
    private char[] termo;
    private String[] palavras={"CONHECIMENTO", "ENSINO", "FACULDADE", "CINEMA", "ESCOLA", "ALUNO", "SABEDORIA", "LONGITUDE", "ENSINAMENTO", "PESSOA", "VIAGEM", "PASSEIO", "HOTEL", "PARQUE"};
    private int tentativas;
    private boolean finalizado=false;
    private ArrayList<Character> tentativa_feita= new ArrayList<>();
    private ArrayList<String> resposta= new ArrayList<>();
    public termo(){
        this.termo= elementoaleatorio(palavras).toCharArray();
    }
    public static String elementoaleatorio(String[] array){
        Random random= new Random();
        int indice= random.nextInt(array.length);
        return array[indice];
    }
    public String jogar(){
        System.out.println("Tamanho da Palavra: "+termo.length);
        while (tentativas<7) {
             
             Scanner sc=new Scanner(System.in);
             String tentativa=sc.nextLine();
             if (tentativa.length()>termo.length) {
                System.out.println("Tentativa Excedeu Limite");
                tentativa=sc.nextLine();
             }
             char[] termo_clone=Arrays.copyOf(termo, termo.length);
             char[] tentativa_array=tentativa.toUpperCase().toCharArray();
             for (char caractere : tentativa_array) {
                tentativa_feita.add(caractere);
             }
             for (int i=0; i<tentativa_array.length;i++) {
                for (int j=0; j<termo.length;j++) {
                    if (i==j | tentativa_feita.get(i)==termo_clone[j]) {
                        resposta.add("V");
                        termo_clone[j]='0';
                    }
                    else if(tentativa_feita.get(i)==termo_clone[j]) {
                        resposta.add("A");
                        termo_clone[j]='0';
                    }
                    else{
                        resposta.add("P");
                        termo_clone[j]='0';
                    }
                }
             }
             for (char c : tentativa_feita) {
                System.out.printf(c+" ");
             }
             System.out.println(" ");
             for (String string : resposta) {
                System.out.printf(string+" ");
             }
             System.out.println(" ");
             for (int i=0; i<resposta.size();i++) {
                if (resposta.get(i)=="A" || resposta.get(i)=="P") {
                   break;
                }
                if (i==resposta.size()-1) {
                    finalizado=true;
                }
             }
             if(finalizado==true){
                break;
             }
             tentativa_feita.clear();
             resposta.clear();
             tentativas++;
        }
        if (finalizado==false) {
            return "Você Perdeu";
        }
        return "Você Ganhou";
    }

}