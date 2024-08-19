package set.pesquisa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(this.contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = this.contatoSet.stream()
                .filter(c -> c.getNome().contains(nome))
                .collect(Collectors.toSet());

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero) {

        Optional<Contato> contato = this.contatoSet.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .findFirst();

        if (contato.isPresent()) {
            contato.get().setNumero(novoNumero);
            return contato.get();
        }

        return null;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Luiz", "123456");
        agendaContatos.adicionarContato("Luiz", "112233");
        agendaContatos.adicionarContato("Luiz Cordeiro", "5665");
        agendaContatos.adicionarContato("Luiz Neto", "11111111");
        agendaContatos.adicionarContato("Luiz Backend", "654987");
        agendaContatos.adicionarContato("Maria Silva", "11111111");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Luiz"));
        System.out.println(agendaContatos.atualizarNumeroContato("Luiz", "654321"));

        agendaContatos.exibirContatos();
    }
}
