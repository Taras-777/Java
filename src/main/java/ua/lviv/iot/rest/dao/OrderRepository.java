package ua.lviv.iot.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.rest.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
