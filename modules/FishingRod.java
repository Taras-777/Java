package ua.lviv.iot.fishingGoods.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class FishingRod extends Goods {
    private MaterialsType materialsType;
    private Integer length;
    private RodType type;

    public FishingRod(String name, String brand, float price, CountryType originCountryType,
                      GoodsType goodsType, float weightInGrams,
                      MaterialsType materialsType, Integer length, RodType type){
        super(name, brand, price, originCountryType, goodsType, weightInGrams);

        this.materialsType = materialsType;
        this.length = length;
        this.type = type;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|Materials: " + materialsType
                + "|\n|Length: " + length
                + "|\n|Type: " + type
                + "|\n________________________\n";

    }

}
