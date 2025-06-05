public class teste{
    public static void main(String[] args) {
        Racional a=new Racional(2,4);
        Racional b=new Racional(5,2);
        Racional c=a.soma(b);
        System.out.println(a);
        System.out.println(c.getNum()+"/"+c.getDen());
    }
    
}