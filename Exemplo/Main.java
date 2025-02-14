import models.Livro;

public class Main
{
    public static void main(String[] args)
    {
        Livro livro = new Livro("Robô Selvagem", "Peter Brown", 288, 37.60);

        System.out.println("Título: "+ livro.getTitulo());
        System.out.println("Autor: "+ livro.getAutor());
        System.out.println("Páginas: "+ livro.getPaginas());
        System.out.println("Preço: "+ livro.getPreco());
    }
}
