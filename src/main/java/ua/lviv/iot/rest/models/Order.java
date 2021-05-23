package ua.lviv.iot.rest.models;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "lesson_order")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer price;

    private String brand;

    private String category;

    @NonNull
    private String name;

    public Order(Integer price, @NonNull String name, String brand, String category) {
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.category = category;
    }
}
