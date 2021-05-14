package ua.lviv.iot.fishingGoods;

import ua.lviv.iot.fishingGoods.modules.*;
import ua.lviv.iot.fishingGoods.manager.*;

import java.util.ArrayList;


public class App {

    public static void main(String[] args) {
        ItemManager manager = new ItemManager(new ArrayList<>());
        manager.getGoodsList().add(new Bait("Gladiator Ranger-001", "Favorite", 100f,
                CountryType.China, GoodsType.Bait, 100f, AppointmentType.AMUR));
        manager.getGoodsList().add(new Bait("Vigor Spin", "Brain", 500f,
                CountryType.USA, GoodsType.Bait, 50f, AppointmentType.CARP));


        manager.getGoodsList().add(new FishingRod("Warrior WRR-895", "Brain", 108f,
                CountryType.USA, GoodsType.FishingRod, 350f, MaterialsType.CARBON, 50, RodType.SPINING));
        manager.getGoodsList().add(new FishingRod("Free Carp-89", "Salmo", 580f,
                CountryType.China, GoodsType.FishingRod, 499f, MaterialsType.GRAPHITE, 100, RodType.WINTER_FISHING_ROD));


        manager.getGoodsList().add(new Cord("Gladiator Ranger", "Select", 155f,
                CountryType.Ukraine, GoodsType.Cord, 500f, 45, 10f, "Red"));
        manager.getGoodsList().add(new Cord("Vigor Spin777r", "Brain", 440f,
                CountryType.Ukraine, GoodsType.Cord, 800f, 200, 5f, "White"));


        System.out.println("**************************************************");
        System.out.println("***********Сортування за зростанням****************");
        System.out.println("**************************************************");
        manager.sortByPrice(true).forEach(System.out::println);
        System.out.println("**************************************************");
        System.out.println("***********Сортування за спаданням****************");
        System.out.println("**************************************************");
        manager.sortByPrice(false).forEach(System.out::println);
        System.out.println("**************************************************");
        System.out.println("***********Сортування за вагою********************");
        System.out.println("**************************************************");
        manager.sortByWeight(true).forEach(System.out::println);

    }
}