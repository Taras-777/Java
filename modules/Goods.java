package ua.lviv.iot.fishingGoods.modules;

import lombok.NoArgsConstructor;


@NoArgsConstructor


public class Goods {
    private String name;
    private String brand;
    private float price;
    private CountryType originCountryType;
    private GoodsType goodsType;
    private float weightInGrams;

    public Goods(String name, String brand, float price, CountryType originCountryType, GoodsType goodsType,
                 float weightInGrams) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.originCountryType = originCountryType;
        this.goodsType = goodsType;
        this.weightInGrams = weightInGrams;

    }


    @Override
    public String toString() {
        return itemToString() + "\n________________________\n";
    }

    public String itemToString() {
        return "________________________"
                + "\n|Name: " + name
                + "|\n|brand: " + brand
                + "|\n|Price: " + price
                + "|\n|Country: " + originCountryType
                + "|\n|Goods type: " + goodsType
                + "|\n|Weight in grams: " + weightInGrams;
    }


    public float getPrice() {
        return price;
    }


    public float getweightInGrams() {
        return weightInGrams;
    }
}