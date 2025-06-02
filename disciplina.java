public class disciplina{
    private String nome;
    private int n1,n2,pf;
    public disciplina(String nome){
        this.n1=0;
        this.n2=0;
        this.pf=0;
        this.nome=nome;
    }
    public disciplina(String nome,int nota1,int nota2, int pf){
        this.nome=nome;
        this.n1=nota1;
        this.n2=nota2;
        this.pf= pf;
    }
    public int getNota1(){
        return this.n1;
    }
    public int getNota2(){
        return this.n2;
    }
    public int getPf(){
        return this.pf;
    }
    public String getNome(){
        return this.nome;
    }
    public setNota1(int nota){
        if (nota>0 | nota<=100){
            this.n1=nota;
        }
    }
    public setNota2(int nota){
        this.n2=nota;
    }
    public setPf(int nota){
        this.pf=nota;
    }
    public setNome(String nome){
        this.nome=nome;
    }
    private int media(int n1,int n2){
        return (2*n1+3*n2)/5;
    }
    public int mediaParcial(){
        return media(this.n1, this.n2);
    }
    public int mediaFinal(){
        if (mediaParcial()>=60) {
            return mediaParcial();
        }
        int media1= (mediaParcial()+this.pf)/2;
        int media2=media(this.pf, this.n2);
        int media3=media(this.n1,this.pf);
        if (media1>media2 | media1>media3) {
            return media1;
        }
        if (media2>media1 | media2>media3) {
            return media2;
        }
        return media3;
    }
}