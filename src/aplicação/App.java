package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Pamela");
        list.add("João");
        list.add("Pedro");
        list.add("José");
        list.add(2, "Marcos");

        System.out.println(list.size());

        for (String obj : list) {
            System.out.println(obj);
            
        }

        System.out.println("------------------------------------------");

        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'J'); //função lambda predicado return v ou f  
                                                         //pegue um valor obj do tipo string e verifica se a primeira posição 
                                                         //da string é 'J' e retorne v ou f
        for (String obj : list) {
            System.out.println(obj);
                                                        
        }

        System.out.println("------------------------------------------");

        System.out.println("index of Pedro: " + list.indexOf("Pedro"));//Achar a posição do meu elemento na lista 
        System.out.println("------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());//nessa função o que esta acontecendo é o seguinte
                                                                                                               // primeiro estamos instanciando uma nova lista
                                                                                                               // depois estamos pegando ela trasnformando num tipo stream para podermos usar expressões lambda
                                                                                                               // usando um filter, depois fazendoa função collect para desconverter ou converter de stream para lista novamente

        for (String obj : result) {
             System.out.println(obj);
                                                                                                                                                            
        }

        System.out.println("------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);//Função para pegar o primeiro elemento da lista com a letra P caso não ache será dado o valor nulo
        System.out.println(name);
                                                                                                    
     }
    

}
