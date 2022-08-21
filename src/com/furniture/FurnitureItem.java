package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private double price;

    static final int DISCOUNT = 5;

    public FurnitureItem(int furnitureCode, String furnitureType, String gradeOfFurniture, String color, String furnitureUsage, double price) {
        this.furnitureCode = furnitureCode;
        this.furnitureType = furnitureType;
        this.gradeOfFurniture = gradeOfFurniture;
        this.color = color;
        this.furnitureUsage = furnitureUsage;
        this.price = price;
    }

    public FurnitureItem() {

    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public float calculateDiscount() {
        return (float) (price - (DISCOUNT*price)/100);
    }
}

