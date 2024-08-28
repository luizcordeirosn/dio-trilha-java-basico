import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
		cliente.setNome("Luiz Neto");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(250);
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
