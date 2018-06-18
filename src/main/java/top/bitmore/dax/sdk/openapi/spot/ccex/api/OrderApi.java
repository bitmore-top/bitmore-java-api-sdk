package top.bitmore.dax.sdk.openapi.spot.ccex.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.AddOrderResult;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.CancelOrderParam;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.OrderParam;

import java.util.List;

/**
 * @author coinmex-sdk-team
 * @date 2018/04/28
 */
public interface OrderApi {

    /**
     * 下单接口
     *
     * @param body 请求结构体 top.bitmore.dax.sdk.openapi.spot.ccex.domain.OrderParam
     * @return 成功 返回 订单id
     * @see OrderParam
     * @see AddOrderResult
     */
    @POST("spot/ccex/orders")
    Call<AddOrderResult> postOrder(@Body OrderParam body);

    /**
     * 根据订单 id 撤单
     *
     * @param orderId 订单 id
     * @param body    请求结构体 top.bitmore.dax.sdk.openapi.spot.ccex.domain.CancelOrderParam
     * @return 无
     * @see CancelOrderParam
     */
    @HTTP(method = "DELETE", path = "spot/ccex/orders/{orderId}", hasBody = true)
    Call<Void> deleteOrder(@Path("orderId") Long orderId, @Body CancelOrderParam body);

    /**
     * 批量撤单，会根据 code 撤单
     *
     * @param body 请求结构体 top.bitmore.dax.sdk.openapi.spot.ccex.domain.CancelOrderParam
     * @return 无
     * @see CancelOrderParam
     */
    @HTTP(method = "DELETE", path = "spot/ccex/orders", hasBody = true)
    Call<Void> deleteOrders(@Body CancelOrderParam body);

    /**
     * 根据订单 id 获取订单信息
     *
     * @param orderId 订单 id
     * @param code    币对(ltc-btc,btc-usdt等)
     * @return 订单信息 top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order
     * @see Order
     */
    @GET("spot/ccex/orders/{orderId}")
    Call<Order> getOrder(@Path("orderId") Long orderId, @Query("code") String code);

    /**
     * 分页获取订单信息
     *
     * @param code   币对
     * @param status 状态
     * @param before 游标 订单 id
     * @param after  游标 订单 id
     * @param limit  获取数量
     * @return 订单信息列表
     * @see Order
     */
    @GET("spot/ccex/orders")
    Call<List<Order>> getOrders(@Query("code") String code,
                                @Query("status") String status,
                                @Query("before") Long before,
                                @Query("after") Long after,
                                @Query("limit") Integer limit);
}
