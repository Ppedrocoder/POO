public class Racional{
    private int num;
    private int den;
    public Racional(int num, int den){
        this.num=num;
        this.den=den;
    }
    public Racional(int num){
        this.num=num;
        this.den=1;
    }
    public Racional(){
        this(0, 1);
    }
    public int getNum(){
        return this.num;
    }
    public int getDen(){
        return this.den;
    }
    public Racional vezes(Racional numero){
        int num_final=this.num*numero.num;
        int den_final=this.den*numero.den;
        return new Racional(num_final,den_final);
    }
    public Racional vezes(int numero){
        if (numero==1){
            return this;
        }
        int num_final=this.num*numero;
        int den_final=this.den*1;
        return new Racional(num_final,den_final);
    }
    public Racional divisao(Racional numero){
        int den= this.den*numero.num;
        int num= this.num*numero.den;
        return new Racional(num,den);
    }
    private static int mmc(int den1, int den2){
        return 1;
    }
    public Racional soma(Racional numero){
        int den_final=mmc(this.den, numero.den);
        int num_final=((den_final/this.den)*this.num)+((den_final/numero.den)*numero.num);
        return new Racional(num_final,den_final);
    }
    public double toDouble(){
        return (double)this.num/this.den;
    }
    public boolean equals(Racional numero){
        return this.num==numero.num && this.den==numero.den;
    }
    public String toString(){
        return num+"/"+den;
    }
}