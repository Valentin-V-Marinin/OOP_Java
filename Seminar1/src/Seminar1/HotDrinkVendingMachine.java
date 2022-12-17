package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine{
    List<HotDrink> listProd = new ArrayList<>();

    void initProduct(HotDrink product) {
        listProd.add(product);
    }

    void getProduсt(String name, double cost, double temperature, double volume) {
        System.out.printf("Товар: %s   -по цене %s руб.  -с температурой %s  -объёмом %s\n", name, cost, temperature, volume);
    }

    void showAllProducts() {
        for (HotDrink item : listProd) {
            getProduсt(item.getName(), item.getCost(), item.getTemperature(), item.getVolume());
        }
    }


}
