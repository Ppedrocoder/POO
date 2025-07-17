package excecoes;

public class q2 {
    public static boolean parseAndDivide(String a, String b){
        try{
            return Integer.parseInt(a) % Integer.parseInt(b) == 0;
        }
        catch(ArithmeticException e){
            if (Integer.parseInt(b) == 0) {
                return true;
            }
            return false;
        }
        catch(IllegalArgumentException e){
            return false;
        }
    }
}
