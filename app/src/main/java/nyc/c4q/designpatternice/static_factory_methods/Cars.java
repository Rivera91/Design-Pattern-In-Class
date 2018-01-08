package nyc.c4q.designpatternice.static_factory_methods;

/**
 * Created by AmyRivera on 1/7/18.
 */

public class Cars {


    private static Cars carsInstance;

    private Cars(){

    }

    public static Cars getInstance(){

        if(carsInstance != null){
            return carsInstance;
        }

        carsInstance = new Cars();
        return carsInstance;

    }
}
