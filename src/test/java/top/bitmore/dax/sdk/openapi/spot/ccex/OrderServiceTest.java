package top.bitmore.dax.sdk.openapi.spot.ccex;

import org.junit.Test;
import top.bitmore.dax.sdk.openapi.common.domain.Record;
import top.bitmore.dax.sdk.openapi.common.enums.OrderStatusEnEnum;
import top.bitmore.dax.sdk.openapi.common.enums.OrderTypeEnum;
import top.bitmore.dax.sdk.openapi.common.enums.SideTypeEnum;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.AddOrderResult;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.OrderParam;
import top.bitmore.dax.sdk.openapi.spot.common.BaseTest;

import java.io.IOException;
import java.util.List;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
public class OrderServiceTest extends BaseTest {


    static final String CODE = "LTC_BTC";

    @Test
    public void testPostOrderLimitedSell() throws IOException {
        // limit sell
        final OrderParam param = OrderParam.builder()
                .code(OrderServiceTest.CODE)
                .side(SideTypeEnum.SELL.getSideName())
                .type(OrderTypeEnum.LIMITED.getTypeName())
                .size("1")
                .price("1.001")
                .build();
        final AddOrderResult result = this.bitmoreClient.spot().ccex().order()
                .postOrder(param);
        System.out.println(result);
    }

    @Test
    public void testPostOrderLimitedBuy() throws IOException {
        // limit buy
        final OrderParam param = OrderParam.builder()
                .code(OrderServiceTest.CODE)
                .side(SideTypeEnum.BUY.getSideName())
                .type(OrderTypeEnum.LIMITED.getTypeName())
                .size("1")
                .price("1.001")
                .build();
        final AddOrderResult result = this.bitmoreClient.spot().ccex().order().postOrder(param);
        System.out.println(result);
    }

    @Test
    public void testPostOrderMarketSell() throws IOException {
        // market sell
        final OrderParam param = OrderParam.builder()
                .code(OrderServiceTest.CODE)
                .side(SideTypeEnum.SELL.getSideName())
                .type(OrderTypeEnum.MARKET.getTypeName())
                .size("1")
                .build();
        final AddOrderResult result = this.bitmoreClient.spot().ccex().order().postOrder(param);
        System.out.println(result);
    }

    @Test
    public void testPostOrderMarketBuy() throws IOException {
        // market buy
        final OrderParam param = OrderParam.builder()
                .code(OrderServiceTest.CODE)
                .side(SideTypeEnum.BUY.getSideName())
                .type(OrderTypeEnum.MARKET.getTypeName())
                .funds("1.001")
                .build();
        final AddOrderResult result = this.bitmoreClient.spot().ccex().order().postOrder(param);
        System.out.println(result);
    }

    @Test
    public void testDeleteOrder() throws IOException {
        final OrderParam param = OrderParam.builder()
                .code(OrderServiceTest.CODE)
                .side(SideTypeEnum.BUY.getSideName())
                .type(OrderTypeEnum.LIMITED.getTypeName())
                .size("1")
                .price("1.001")
                .build();
        final AddOrderResult result = this.bitmoreClient.spot().ccex().order().postOrder(param);
        this.bitmoreClient.spot().ccex().order().deleteOrder(OrderServiceTest.CODE, result.getOrderId());
    }

    @Test
    public void testDeleteOrders() throws IOException {
        this.bitmoreClient.spot().ccex().order().deleteOrders(OrderServiceTest.CODE);
    }

    @Test
    public void testGetOrder() throws IOException {
        final OrderParam param = OrderParam.builder()
                .code(OrderServiceTest.CODE)
                .side(SideTypeEnum.BUY.getSideName())
                .type(OrderTypeEnum.LIMITED.getTypeName())
                .size("1")
                .price("1.001")
                .build();
        final AddOrderResult result = this.bitmoreClient.spot().ccex().order().postOrder(param);
        final Order order = this.bitmoreClient.spot().ccex().order().getOrder(OrderServiceTest.CODE, result.getOrderId());
        System.out.println(order);
    }

    @Test
    public void testGetOrders() throws IOException {

        final Record<List<Order>, Long> orderList = this.bitmoreClient.spot().ccex().order()
                .getOrders(OrderServiceTest.CODE, OrderStatusEnEnum.OPEN, null, null, null);
        System.out.println(orderList);
    }
}
