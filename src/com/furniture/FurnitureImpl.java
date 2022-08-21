package com.furniture;

public class FurnitureImpl {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();
        obj.setFurnitureCode(101);
        obj.setFurnitureType("table");
        obj.setGradeOfFurniture("grade1");
        obj.setFurnitureUsage("outdoor");
        obj.setColor("red");
        obj.setPrice(10);

        System.out.println("furnitureCode = " + obj.getFurnitureCode());
        System.out.println("obj.getFurnitureType() = " + obj.getFurnitureType());
        System.out.println("obj.getGradeOfFurniture() = " + obj.getGradeOfFurniture());
        System.out.println("obj.getFurnitureUsage() = " + obj.getFurnitureUsage());
        System.out.println("obj.color = " + obj.getColor());
        System.out.println("obj.getPrice() = $" + obj.getPrice());
        System.out.println("obj.calculateDiscount() = $" + obj.calculateDiscount());
    }
}