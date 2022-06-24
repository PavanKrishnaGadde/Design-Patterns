package com.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {

        ElectronicItem phone = new ElectronicItem(20000.00, "Iphone 14", "GSTIN002");
        ElectronicItem airpods = new ElectronicItem(5000.00, "Apple Air pods", "GSTIN02344");

        FoodItem meal = new FoodItem(2342.00, "Meal Combo", "GSTIN55636", "KFC", 234.00);
        FoodItem snacks = new FoodItem(332.00, "Snacks", "GSTIN556446", "Starbucks", 23.00);
        FoodItem juice = new FoodItem(53.00, "Juice", "GSTIN553636", "SubWay", 4.00);

        FurnitureItem table = new FurnitureItem(7669.00,"Wooden table", "GST887", true);
        FurnitureItem chair = new FurnitureItem(879.00,"Chair", "GST87877", true);

        FurnitureItem closet = new FurnitureItem(9879.00,"Closet", "GST872877", false);

        List<SellableItem> sellableItemList = new ArrayList<>();
        sellableItemList.add(phone);
        sellableItemList.add(airpods);
        sellableItemList.add(meal);
        sellableItemList.add(snacks);
        sellableItemList.add(juice);
        sellableItemList.add(table);
        sellableItemList.add(chair);
        sellableItemList.add(closet);




        double totalStatetax = 0;
        SGSTCalculator sgstCalculator = new SGSTCalculator();
        for(SellableItem item: sellableItemList) {
            totalStatetax += item.calculateTax(sgstCalculator);
        }
        System.out.println("Total State Tax: " + totalStatetax);

        double totalCentraltax = 0;
        CGSTCalculator cgstCalculator = new CGSTCalculator();
        for(SellableItem item: sellableItemList) {
            totalCentraltax += item.calculateTax(cgstCalculator);
        }
        System.out.println("Total State Tax: " + totalCentraltax);

        System.out.println("Total Tax: " + (totalCentraltax + totalStatetax));

    }
}
