import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());

        for(String nome:list){
            System.out.println(nome);
        }
        System.out.println("------------");
        //Remover pessoas que comecam com M
        list.removeIf(pessoa -> pessoa.charAt(0) == 'M');

        for(String pessoa : list){
            System.out.println(pessoa);
        }
        System.out.println("------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) =='A').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }
        System.out.println("------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}