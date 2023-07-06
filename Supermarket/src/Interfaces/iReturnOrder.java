package Interfaces;

public interface iReturnOrder {

    /**
     * Метод для обработки возврата товара.
     *
     * @param orderNumber номер заказа
     * @return true, если возврат товара успешно обработан, false в противном случае
     */
    boolean processReturn(String orderName);

    /**
     * Метод для проверки возможности возврата товара.
     *
     * @param orderNumber номер заказа
     * @return true, если возврат товара возможен, false в противном случае
     */
    boolean canReturn(String orderName);

    /**
     * Метод для получения информации о статусе возврата товара.
     *
     * @param orderNumber номер заказа
     * @return информация о статусе возврата товара
     */
    String getReturnStatus(String orderName);
}

