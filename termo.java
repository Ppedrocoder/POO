import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class termo{
    private char[] termo;
    private String[] palavras={conhecimento, ensino, faculdade, cinema, escola, aluno, discernimento, longitude, ensinamento, pessoa, viagem, passeio, hotel, parque};
    private int tentativas;
    private boolean finalizado=false;
    private list<Character> tentativa_feita= new ArrayList<>();
    private list<String> resposta= new ArrayList<>();
    public termo(){
        this.termo= elementoaleatorio(palavras).toCharArray();
    }
    public static String elementoaleatorio(String[] array){
        Random random= new Random();
        int indice= random.nextInt(array.length);
        return array[indice];
    }
    public jogar(){
        while (tentativas<=7) {
             
             Scanner sc=new Scanner(System.in);
             String tentativa=sc.nextLine();
             char[] termo_clone=Arrays.copyOf(termo, termo.length);
             char[] tentativa_array=this.tentativa.toLowerCase().toCharArray();
             for (Char caractere : tentativa_array) {
                tentativa_feita.add(caractere);
             }
             for (int i=0; i<tentativa_array.length;i++) {
                for (int j=0; j<termo.length;j++) {
                    if (i==j | tentativa_feita[i]==termo_clone[j]) {
                        resposta.add("Verde");
                        termo_clone[j]="";
                    }
                    else if(tentativa_feita[i]==termo_clone[j]) {
                        resposta.add("Amarelo");
                        termo_clone[j]="";
                    }
                    else{
                        resposta.add("Preto");
                        termo_clone[j]="";
                    }
                }
             }
             for (String string : resposta) {
                System.out.printf(string);
             }
             for (int i=0; i<resposta.length;i++) {
                if (resposta[i]=="Amarelo" :: resposta[i]=="Preto") {
                   break;
                }
                if (i==resposta.length-1) {
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
        if (finalizado==true) {
            return "Você Ganhou";
        }

    }

}