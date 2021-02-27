import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CacaNiquel {
    private static Map<Integer,Integer> mapa = new HashMap<>();
    public static void main(String[] args) {


            mapa.put(0,10);/** 0 = Banana = 10 pontos*/
            mapa.put(1,20);/** 1 = Morango = 20 pontos*/
            mapa.put(2,40);/** 2 = Estrela = 40 pontos*/

        Random random = new Random();
        int primeirosorteio = random.nextInt(3);
        int segundosorteio = random.nextInt(3);
        int terceirosorteio = random.nextInt(3);


        if(primeirosorteio == 0)
            System.out.println("Banana");
        else if(primeirosorteio == 1)
            System.out.println("Morango");
        else if(primeirosorteio == 2)
            System.out.println("Estrela");

        if(segundosorteio == 0)
            System.out.println("Banana");
        else if(segundosorteio == 1)
            System.out.println("Morango");
        else if(segundosorteio == 2)
        System.out.println("Estrela");

        if(terceirosorteio == 0)
            System.out.println("Banana");
        else if(terceirosorteio == 1)
            System.out.println("Morango");
        else if(terceirosorteio == 2)
        System.out.println("Estrela");

        Integer resultado1 = mapa.get(primeirosorteio);
        Integer resultado2 = mapa.get(segundosorteio);
        Integer resultado3 = mapa.get(terceirosorteio);

        System.out.println("Seus pontos : " + (resultado1 + resultado2 + resultado3) );
    }
    }



