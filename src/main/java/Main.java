import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Asset> assetArrayList = new ArrayList<>();

        House europeHouse = new House("My Mansion in Switzerland", "08/26/2028", 3045908.45,
                "random street 99", 10, 10000, 10000);

        House americaHouse = new House("My Penthouse in New york", "09/26/2028", 4045908.95,
                "Madison square", 34, 4200, 234000);

        Vehicle lamborghiniAventador = new Vehicle("v12 coupe italian","10/20/2028",350000.99,
                "Lamborghini Aventador",2027,0);

        Vehicle rollRoyceMcallan = new Vehicle("SUV English 4 door","10/26/2028",543000.98,
                "Roll Royce Mcallan",2027,500);



    }
}
