package com.green.day16_0404.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        /*
        Product p = new Product(1000); // price에 저장 > 1/10 값이 보너스에 저장
        Product p2 = new Product(500); // price에 저장 > 1/10 값이 보너스에 저장
        System.out.printf("p\tPrice: %d\tBonusPoint: %d\n", p.getPrice(), p.getBonusPoint());
        System.out.printf("p2\tPrice: %d\tBonusPoint: %d\n", p2.getPrice(), p2.getBonusPoint());
        System.out.println(p);
        System.out.println(p2);
         */
        /*
        Tv tv = new Tv();
        System.out.println(tv);
        Computer com = new Computer();
        System.out.println(com);
        Sofa sofa = new Sofa();
        System.out.println(sofa);
        */
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        buyer.showMeTheMoney();
    }
}
class Buyer {
    private int haveMoney;
    private int haveBonusPoint;
    Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
    }
    public int getHaveMoney() {
        return haveMoney;
    }
    void buy (Product product) {
        haveMoney -= product.getPrice();
        haveBonusPoint += product.getBonusPoint();
        System.out.println(product);
    }
    void showMeTheMoney() {
        System.out.printf("haveMoney: %d, haveBonusPoint: %d\n", haveMoney, haveBonusPoint);
       // System.out.println(toString());
    }
//    @Override
//    public String toString(){
//        return String.format("haveMoney: %d, haveBonusPoint: %d", haveMoney, haveBonusPoint);
//    }

}

class Sofa extends Product {
    Sofa() {
        super(80);
    }
    @Override
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    @Override
    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }
    @Override
    public String toString() {
        return String.format("Tv %s", super.toString());
    }
}

class Product {
    private final int price;
    private final int bonusPoint;

    Product (int price){
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public int getPrice (){
        return price;
    }
    public int getBonusPoint (){
        return bonusPoint;
    }

    @Override
    public String toString(){
        return String.format("Price: %d, BonusPoint: %d", getPrice(), getBonusPoint());
    }

}
