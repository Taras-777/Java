package ua.lviv.iot.fishingGoods.modules;

import lombok.NoArgsConstructor;


@NoArgsConstructor

public class Cord extends Goods {
    private Integer longs;
    private float diameter;
    private String color;

    public Cord(String name, String brand, float price, CountryType originCountryType,
                GoodsType goodsType, float weightInGrams,
                Integer longs, float diameter, String color){
        super(name, brand, price, originCountryType, goodsType, weightInGrams);

        this.longs = longs;
        this.diameter = diameter;
        this.color = color;

    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Long: " + longs
                + "|\n|Diameter: " + diameter
                + "|\n|Color: " + color
                + "|\n________________________\n";
    }
}