package zn.taco_cloud;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Date;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
        String deliveryZip,
        Date startDate,
        Date endDate
    );

    // List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(
    //     String deliveryTo,
    //     String deliveryCity
    // );

    // List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);

    // @Query("Order o where o.deliveryCity = 'Seattle'")
    // List<TacoOrder> readOrdersDeliveredInSeattle();


}