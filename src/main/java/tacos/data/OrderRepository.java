package tacos.data;

import tacos.Order;

/**
 * Created by Sanya on 05.01.2019.
 */
public interface OrderRepository {
    Order save(Order order);
}
