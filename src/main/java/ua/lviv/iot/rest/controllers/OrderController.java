package ua.lviv.iot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.rest.models.Order;
import ua.lviv.iot.rest.services.OrderService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private static final Logger LOGGER = Logger.getLogger("MyLogger");

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable(name = "id") Integer idd) {
        try {
            return new ResponseEntity<>(orderService.getOrder(idd), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            LOGGER.severe("Order with" + idd + "id does not exists");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {

        if (order.getId() == null) {
            return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.OK);
        }
        LOGGER.severe("Tried to create an order with passed id. Order creation should not use ids");
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Order> deleteOrder(@PathVariable Integer id) {
        try {
            Order existDevice = orderService.getOrder(id);
            orderService.deleteOrder(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateDevice(@RequestBody Order order, @PathVariable Integer id) {
        try {
            Order existOrder = orderService.getOrder(id);
            order.setId(id);
            orderService.saveOrder(order);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
