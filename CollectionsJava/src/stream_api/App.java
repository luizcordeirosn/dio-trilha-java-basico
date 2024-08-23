package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // DESAFIO 1
        numeros.stream().sorted().forEach(System.out::print);
        System.out.println();

        // DESAFIO 2
        System.out.println(numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum());

        // DESAFIO 3
        System.out.println(numeros.stream().allMatch(n -> n > 0));

        // DESAFIO 4
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println();

        // DESAFIO 5
        System.out.println(numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue)
            .average().orElse(0));

        // DESAFIO 6
        System.out.println(numeros.stream().anyMatch(n -> n == 10));

        // DESAFIO 7
        System.out.println(numeros.stream().distinct().sorted(Comparator.reverseOrder())
            .skip(1).findFirst().get());

        // DESAFIO 8
        System.out.println(numeros.stream().mapToInt(Integer::intValue).sum());

        // DESAFIO 9
        System.out.println(numeros.stream().allMatch(new HashSet<>()::add));

        // DESAFIO 10
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0)
            .collect(Collectors.toList()));

        // DESAFIO 11
        System.out.println(numeros.stream().mapToInt(n -> n * n).sum());

        // DESAFIO 12
        System.out.println(numeros.stream().reduce(1, (n1, n2) -> n1 * n2));

        // DESAFIO 13
        System.out.println(numeros.stream().filter(n -> 5 <= n && n <= 9).collect(Collectors.toList()));

        // DESAFIO 14
        System.out.println(numeros.stream().filter(App::isPrime).max(Integer::compareTo).get());

        // DESAFIO 15
        System.out.println(numeros.stream().anyMatch(n -> n < 0));

        // DESAFIO 16
        Map<Boolean, List<Integer>> agrupados = numeros.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        
        System.out.println(agrupados.get(false));
        System.out.println(agrupados.get(true));

        //DESAFIO 17
        System.out.println(numeros.stream().filter(n -> isPrime(n)).collect(Collectors.toList()));

        //DESAFIO 18
        System.out.println(numeros.stream().allMatch(n -> n.equals(numeros.get(0))));

        //DESAFIO 19
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0)
            .mapToInt(Integer::intValue).sum());
    }

    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
