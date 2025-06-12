import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo=new Catalogo();
        Scanner sc=new Scanner(System.in);
        String menu="-1";
        while (menu!="0") {
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Buscar livros por autor");
            System.out.println("4. Mostrar todos os autores");
            System.out.println("5. Mostrar livros por ano de publicação");
            System.out.println("6. Mostrar livros ordenados por título");
            System.out.println("0. Sair");
            menu=sc.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("Escreva o Titulo");
                    String titulo=sc.nextLine();
                    System.out.println("Escreva o Autor");
                    String autor=sc.nextLine();
                    System.out.println("Escreva o Ano de Publicação");
                    int ano=sc.nextInt();
                    Livro livro=new Livro(titulo,autor,ano);
                    catalogo.adicionar(livro);
                    break;
                case "2":
                    catalogo.getLivros();
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                case "6":
                    
                    break;
                default:
                    break;
            }
        }
    }
}