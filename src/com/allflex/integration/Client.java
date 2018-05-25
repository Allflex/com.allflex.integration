package com.allflex.integration;

public class Client
{
    /// <summary>
    /// Initializes a new instance of the <see cref="Client"/> class.
    /// </summary>
    /// <param name="apiKey">The API key.</param>
    /// <param name="apiUrl">The API URL.</param>
    public Client(String apiKey, String apiUrl)
    {
        throw new UnsupportedOperationException();
    }
    
    /// <summary>
    /// Gets the status string.
    /// </summary>
    /// <param name="status">The status.</param>
    /// <returns></returns>
    public static String GetStatusString(OrderStatusEnum status)
    {
        throw new UnsupportedOperationException();
    }

    /// <summary>
    /// Gets the status from a string.
    /// </summary>
    /// <param name="status">The status</param>
    /// <returns></returns>
    public static OrderStatusEnum GetStatusEnum(String status)
    {
        throw new UnsupportedOperationException();
    }

    /// <summary>
    /// Sends the status.
    /// </summary>
    /// <param name="status">The status.</param>
    /// <returns></returns>
    public boolean PostStatus(OrderStatus status)
    {
        throw new UnsupportedOperationException();
    }

    /// <summary>
    /// Gets the order status.
    /// </summary>
    /// <param name="wsOrderId">The ws order identifier.</param>
    /// <returns></returns>
    public OrderStatus GetOrderStatus(String wsOrderId)
    {
        throw new UnsupportedOperationException();
    }

    /// <summary>
    /// Posts the order to flex service.
    /// </summary>
    /// <param name="order">The order.</param>
    /// <returns></returns>
    /// <exception cref="Exception"></exception>
    public OrderHeader PostOrder(OrderHeader order)
    {
        throw new UnsupportedOperationException();
    }

    /// <summary>
    /// Retrieves all orders.
    /// </summary>
    /// <param name="saveFile">if set to <c>true</c> [save file].</param>
    /// <returns></returns>
    public Document RetrieveOrders()
    {
        throw new UnsupportedOperationException();
    }
}

class Document{} // TODO: Move to it's own package
class OrderStatus{} // TODO: Move to it's own package
class OrderHeader{} // TODO: Move to it's own package