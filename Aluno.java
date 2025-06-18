public class Aluno {
    private String nome;
    private int nota;
    public Aluno(String nome, int nota){
        this.nome=nome;
        this.nota=nota;
    }
    public String getNome(){
        return this.nome;
    }
    public int getNota(){
        return this.nota;
    }
    public int compareTo(Aluno outra) {
        // Ordena por nota, crescente ou nome
        int comp = Integer.compare(this.nota, outra.nota);
        if (comp != 0) return comp;
        return this.nome.compareTo(outra.nome);
    }
    @Override
    public String toString(){
        return this.nome+" recebeu "+this.nota;
    }
}
