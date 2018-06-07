package top.bitmore.dax.sdk.openapi.spot.ccex.service;

import top.bitmore.dax.sdk.openapi.common.domain.Record;
import top.bitmore.dax.sdk.openapi.common.enums.OrderStatusEnEnum;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.AddOrderResult;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.OrderParam;

import java.io.IOException;
import java.util.List;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
public interface OrderService {

    /**
     * 下单 POST /spot/ccex/orders
     *
     * @param param 下单请求参数
     * @return top.bitmore.dax.sdk.openapi.spot.ccex.domain.AddOrderResult
     * @throws IOException
     * @see OrderParam
     * @see AddOrderResult
     */
    AddOrderResult postOrder(OrderParam param) throws IOException;

    /**
     * 根据订单 id、币对 撤单 DELETE /spot/ccex/orders/{orderId}
     *
     * @param code    币对
     * @param orderId 订单 id
     */
    void deleteOrder(String code, Long orderId) throws IOException;

    /**
     * 根据 币对 批量撤单 DELETE /spot/ccex/orders
     *
     * @param code 币对
     */
    void deleteOrders(String code) throws IOException;

    /**
     * 根据 id、币对 获取订单信息 GET /spot/ccex/orders/{orderId}
     *
     * @param code    币对
     * @param orderId 订单 id
     * @return 订单信息结构体 top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order
     * @see Order
     */
    Order getOrder(String code, Long orderId) throws IOException;

    /**
     * 分页获取订单信息 GET /spot/ccex/orders
     *
     * @param code   币对
     * @param status 订单状态
     * @param before 订单 id 游标，
     * @param after  订单 id 游标
     * @param limit  最大返回数量
     * @return 订单信息列表 top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order
     * @see Order
     */
    Record<List<Order>, Long> getOrders(String code,
                                        OrderStatusEnEnum status,
                                        Long before,
                                        Long after,
                                        Integer limit) throws IOException;
}
