package prueba.tecnica.API.utils;

import java.util.Random;

public class RandomId {

    public static int randomId(){
        Random random = new Random();
        return random.nextInt();
    }
}
