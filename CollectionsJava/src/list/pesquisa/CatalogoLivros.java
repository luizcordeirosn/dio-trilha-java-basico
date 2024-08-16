package list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!this.livrosList.isEmpty()) {
            livrosPorAutor = this.livrosList.stream()
                    .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                    .collect(Collectors.toList());
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!this.livrosList.isEmpty()) {
            livrosPorIntervaloAnos = this.livrosList.stream()
                    .filter(l -> anoInicial <= l.getAnoPublicacao() && anoFinal >= l.getAnoPublicacao())
                    .collect(Collectors.toList());
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!this.livrosList.isEmpty()) {
            Optional<Livro> livroPorTitulo = this.livrosList.stream()
                    .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                    .findFirst();

            if (livroPorTitulo.isPresent()) {
                return livroPorTitulo.get();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1994, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
