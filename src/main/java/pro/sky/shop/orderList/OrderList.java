package pro.sky.shop.orderList;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class OrderList {
    private List<Integer> orderList;

    public OrderList(List<Integer> orderList) {
        this.orderList = new ArrayList<>();
    }

    public List<Integer> addIds(List<Integer> iDs) {
        orderList.addAll(iDs);
        return iDs;
    }

    public List<Integer> getIds() {
        return Collections.unmodifiableList(orderList);
    }
}
