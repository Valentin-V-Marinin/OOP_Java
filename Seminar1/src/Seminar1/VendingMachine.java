package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine{
    List<Product> listProd = new ArrayList<>();

    void initProduct(Product product) {
        listProd.add(product);
    }

    private void getProduсt(String name, double cost){
        System.out.printf("Товар: %s    по цене %s руб.\n", name, cost);
    }
    void showAllProducts(){
        for (Product item: listProd) {
            getProduсt(item.getName(), item.getCost());
        }
    }

}