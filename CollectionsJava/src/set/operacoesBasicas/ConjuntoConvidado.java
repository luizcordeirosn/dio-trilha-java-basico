package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!this.convidadoSet.isEmpty()) {
            this.convidadoSet.removeIf(c -> c.getCodigoConvite() == codigoConvite);
        }
    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
