package ua.lviv.iot.fishingGoods.manager;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ua.lviv.iot.fishingGoods.modules.*;

import java.util.List;

@Getter
@NoArgsConstructor


public class ItemManager {
    public List<Goods> goodsList;

    public ItemManager(List<Goods> goods){
        goodsList = goods;
    }

    public List<Goods> sortByPrice(final boolean reverse) {
        if (reverse) {
            goodsList.sort((Goods i1, Goods i2) -> Float.compare(i2.getPrice(), i1.getPrice()));
        } else {
            goodsList.sort((Goods i1, Goods i2) -> Float.compare(i1.getPrice(), i2.getPrice()));
        }
        return goodsList;
    }

    public List<Goods> sortByWeight(final boolean reverse) {
        if (reverse) {
            goodsList.sort((Goods i1, Goods i2) -> Float.compare(i2.getweightInGrams(), i1.getweightInGrams()));
        } else {
            goodsList.sort((Goods i1, Goods i2) -> Float.compare(i1.getweightInGrams(), i2.getweightInGrams()));
        }
        return goodsList;
    }

}