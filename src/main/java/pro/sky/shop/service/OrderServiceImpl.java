package pro.sky.shop.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import pro.sky.shop.orderList.OrderList;

import java.util.Collection;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderList orderList;

    public OrderServiceImpl(OrderList orderList) {
        this.orderList = orderList;
    }

    @Override
    public String add(List<Integer> ids) {
        orderList.addIds(ids);
        return "Your order added, do u want smth else?";
    }

    @Override
    public Collection<Integer> get() {
        return orderList.getIds();
    }
}
