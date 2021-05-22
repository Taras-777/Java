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

    private Integer totalPrice;

    @NonNull
    private String submitter;

    public Order(Integer totalPrice, @NonNull String submitter) {
        this.totalPrice = totalPrice;
        this.submitter = submitter;
    }
}
