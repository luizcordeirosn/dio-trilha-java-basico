import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(
                    "O valor para o primeiro parâmetro deve ser menor que o segundo parâmetro");
        }

        int contagem = parametroDois - parametroUm;
        for(int i =0; i<contagem; i++){
            System.out.println("imprimindo o número " + (i+1));
        }
    }
}
