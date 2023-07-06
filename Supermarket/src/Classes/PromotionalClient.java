package Classes;

import Interfaces.iReturnOrder;

public class PromotionalClient extends Actor{

    private static int participantCount;
    private String promotionName;
    private int clientId;


    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
    }


    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean processReturn(String orderName) {
        // Логика обработки возврата товара
        // Проверяем наличие заказа с указанным именем

        //Order order = getOrderByName(orderName); Это предполагаемый метод, который получает объект заказа по его имени
        //if (order != null && order.isDelivered()) {
            // Если заказ доставлен, выполняем логику возврата
            // ...

          //  return true; // Возврат товара успешно обработан
        // }

       // return false; // Невозможно обработать возврат товара
        return false;
    }

    @Override
    public boolean canReturn(String orderName) {
        // Логика проверки возможности возврата товара
        // Проверяем наличие заказа с указанным именем
        //Order order = getOrderByName(orderName); Это предполагаемый метод, который получает объект заказа по его имени
       // if (order != null && order.isDelivered()) {
            // Если заказ доставлен, проверяем условия для возврата товара
            // ...

           // return true; // Возврат товара возможен
       // }

        return false; // Возврат товара невозможен
    }

    @Override
    public String getReturnStatus(String orderName) {
            // Логика получения информации о статусе возврата товара
            // Проверяем наличие заказа с указанным именем
           // Order order = getOrderByName(orderName); Это предполагаемый метод, который получает объект заказа по его имени
           // if (order != null) {
                // Если заказ найден, получаем статус возврата
                // ...

            //    return "Статус возврата: ..."; // Информация о статусе возврата товара
          //  }

            return "Заказ не найден"; // Заказ с указанным именем не существует
        }
    }

