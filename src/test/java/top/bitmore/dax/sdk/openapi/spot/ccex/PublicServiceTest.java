package top.bitmore.dax.sdk.openapi.spot.ccex;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import top.bitmore.dax.sdk.openapi.common.domain.Record;
import top.bitmore.dax.sdk.openapi.common.enums.KlineEnum;
import top.bitmore.dax.sdk.openapi.spot.common.BaseTest;
import top.bitmore.dax.sdk.openapi.spot.publics.domain.CodeInfo;
import top.bitmore.dax.sdk.openapi.spot.publics.domain.OrderBook;
import top.bitmore.dax.sdk.openapi.spot.publics.domain.ServerTime;

import java.io.IOException;
import java.util.List;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
public class PublicServiceTest extends BaseTest {

    static final String CODE = "LTC-BTC";

    @Test
    public void testTime() throws IOException {
        final ServerTime time = this.bitmoreClient.spot().publics().time();
        System.out.println(time);
    }

    @Test
    public void testTicker() throws IOException {
        final Object[] ticker = this.bitmoreClient.spot().publics().ticker(PublicServiceTest.CODE);
        System.out.println(JSON.toJSONString(ticker));
    }

    @Test
    public void testOrderBook() throws IOException {
        final Integer size = 100;
        final OrderBook orderBook = this.bitmoreClient.spot().publics().orderbook(PublicServiceTest.CODE, size);
        System.out.println(JSON.toJSONString(orderBook));
    }

    @Test
    public void testProducts() throws IOException {
        final List<CodeInfo> codeInfos = this.bitmoreClient.spot().publics().products();
        System.out.println(JSON.toJSONString(codeInfos));
    }

    @Test
    public void testFills() throws IOException {
        final Record<List<Object[]>, Integer> fills = this.bitmoreClient.spot().publics()
                .fills(PublicServiceTest.CODE, null, null, null);
        System.out.println(JSON.toJSONString(fills));
    }

    @Test
    public void testCandles() throws IOException {
        final List<Object[]> candles = this.bitmoreClient.spot().publics()
                .candles(PublicServiceTest.CODE, KlineEnum.DAY, "2018-01-01 00:00:00", "2018-04-27 00:00:00");
        System.out.println(JSON.toJSONString(candles));
    }

}
