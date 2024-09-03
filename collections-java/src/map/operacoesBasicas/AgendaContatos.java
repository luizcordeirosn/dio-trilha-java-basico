package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!this.agendaContatoMap.isEmpty()) {
            this.agendaContatoMap.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        if (!this.agendaContatoMap.isEmpty()) {
            return this.agendaContatoMap.get(nome);
        }
        return null;
    }

    public void exibirContatos() {
        System.out.println(this.agendaContatoMap);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Luiz", 123);
        agendaContatos.adicionarContato("Luiz", 456);
        agendaContatos.adicionarContato("Luiz Cordeiro", 123456);
        agendaContatos.adicionarContato("Luiz Neto", 111);
        agendaContatos.adicionarContato("Luiz Backend", 444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Luiz");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Luiz Backend"));
    }
}