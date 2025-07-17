package excecoes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class q3 {
    public static boolean leitorTXT(File file){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            return true;

        } catch (IOException e) {
            System.out.println("Falha na Leitura");
            return false;
        }
        finally{
            if (reader != null) {
                try{
                    reader.close();
                }
                catch(IOException e){
                    System.out.println("Falha no Fechamento do Arquivo");
                    return false;
                }
            }
        }
    }
}
