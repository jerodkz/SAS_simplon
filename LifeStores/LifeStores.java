import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LifeStores {

    public static void main(String[] args) throws IOException {

        List<Product> productsD = new ArrayList<>();
        List<Product> productsF = new ArrayList<>();
        Distributor distributor = new Distributor(productsD);
        FamilyMart familyMart = new FamilyMart(productsF,1);

        String name;
        String price;


        try {
            String file = "/home/jerome/IdeaProjects/LifeStores/src/Products.csv";
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] field = line.split(",");
                name = field[0];
                price = field[1];
                System.out.println(name+","+price+"euros");
                Product prod = new Product(name,Float.parseFloat(price));
                productsD.add(prod);
                productsF.add(prod);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }

        System.out.println(distributor+"\n");
       // System.out.println(distributor.Sell(productsD.get(0)));
        System.out.println(distributor.Sell(new Product("aquarius",0f)));
        System.out.println(distributor);
        System.out.println(distributor.filled()+"\n");
        System.out.println(familyMart);
        System.out.println(familyMart.Sell(new Product("pocky",0f)));
        System.out.println(familyMart);
        familyMart.setNbEmploye(0);
        System.out.println(familyMart.Sell(new Product("evian",0f)));
        System.out.println(familyMart);




    }
}
