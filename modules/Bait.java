package ua.lviv.iot.fishingGoods.modules;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public final class Bait extends Goods {
    private AppointmentType appointment;

    public Bait(String name, String brand, float price, CountryType originCountryType,
                GoodsType goodsType, float weightInGrams,
                AppointmentType appointment){
        super(name, brand, price, originCountryType, goodsType, weightInGrams);

        this.appointment = appointment;
    }
    @Override
    public String toString() {
        return itemToString()
                + "|\n|AppointmentType: " + appointment
                + "|\n________________________\n";
    }

}