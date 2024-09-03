package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valor = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : this.estoqueProdutosMap.values()) {
                valor += p.getPreco() * p.getQuantidade();
            }
        }
        return valor;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_NORMAL;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : this.estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1l, "Produto A", 10, 5);
        estoque.adicionarProduto(2l, "Produto B", 5, 10);
        estoque.adicionarProduto(3l, "Produto C", 2, 15);

        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
    }
}
