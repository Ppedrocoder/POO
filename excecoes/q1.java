package excecoes;

public class q1 {
    public static boolean dividir(int a, int b){
        try{
            return a % b == 0;
        }
        catch(ArithmeticException e){
            if (b == 0) {
                return true;
            }
            return false;
        }
    }
}