package Seminar1;

import java.util.List;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        vm.initProduct(new Product("coffee",2.35));
        vm.initProduct(new Product("tea", 1.9));
        vm.initProduct(new Product("coffee cup", 0.9));
        vm.initProduct(new Product("tea cup", 0.9));
        vm.showAllProducts();

        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        hdvm.initProduct(new HotDrink("каппучино", 12.48, 55, 0.2));
        hdvm.initProduct(new HotDrink("каппучино", 11.25, 55, 0.15));
        hdvm.initProduct(new HotDrink("эспрессо", 19.15, 70, 0.25));
        hdvm.initProduct(new HotDrink("эспрессо", 19.15, 60, 0.25));
        hdvm.initProduct(new HotDrink("корретто", 8.08, 65, 0.25));
        hdvm.initProduct(new HotDrink("маккиато", 10.64, 63, 0.15));
        hdvm.initProduct(new HotDrink("маккиато", 12.70, 60, 0.25));
        hdvm.initProduct(new HotDrink("маккиато", 11.52, 70,0.2));
        hdvm.initProduct(new HotDrink("латте", 15.22, 60, 0.3));
        hdvm.showAllProducts();

        select_product(hdvm);
    }
    
    public static void select_product(HotDrinkVendingMachine vm){
        String name; double temperature; double volume; boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите напиток, который хотите получить из автомата.\n" +
                "Для этого укажите название, температуру и объём.");
        System.out.println("Введите название напитка: ");
        name = sc.next();
        System.out.println("Введите температуру напитка: ");
        temperature = sc.nextDouble();
        System.out.println("Введите объём чашки напитка: ");
        volume = sc.nextDouble();

        for (HotDrink item : vm.listProd) {
            if ( (item.getName().equals(name)) && (item.getTemperature()==temperature) && (item.getVolume()==volume) )
            {
                System.out.println("______________________________________________________________________________");
                vm.getProduсt(item.getName(), item.getCost(), item.getTemperature(), item.getVolume());
                flag = true;
                break;
            }
            else
            { flag = false;}
        }
        if (!flag) {
            System.out.println("______________________________________________________________________________");
            System.out.println("Такого напитка в автомате нет.");
        }
    }
}