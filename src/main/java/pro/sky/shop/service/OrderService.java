package pro.sky.shop.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequestScope
public interface OrderService {


    public String add(List<Integer> ids);

    public Collection<Integer> get();
}
