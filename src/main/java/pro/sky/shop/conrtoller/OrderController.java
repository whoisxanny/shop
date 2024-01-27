package pro.sky.shop.conrtoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shop.service.OrderService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String add(@RequestParam ("item") List<Integer> ids) {
        orderService.add(ids);
        return "Your order added to your list. You need smth else?";
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return orderService.get();
    }



}
