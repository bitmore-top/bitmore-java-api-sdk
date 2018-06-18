package top.bitmore.dax.sdk.openapi.spot.ws;

import com.alibaba.fastjson.JSON;
import top.bitmore.dax.sdk.openapi.client.BitMoreWebSocketClient;
import top.bitmore.dax.sdk.openapi.common.enums.EventEnum;
import top.bitmore.dax.sdk.openapi.common.enums.KlineEnum;
import top.bitmore.dax.sdk.openapi.ws.WebSocketApiCallBack;
import top.bitmore.dax.sdk.openapi.ws.domain.AssetsInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.CandlesInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.DepthInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.FillsInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.OrdersInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.ParamRequest;
import top.bitmore.dax.sdk.openapi.ws.domain.TickersInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.WebSocketRequest;

/**
 * @author newex-team
 * @date 2018/6/11
 */
public class WebSocketTest {

    public static void main(final String[] args) {


        //depth
        WebSocketTest.depth();

        //ticker
        //tickers();

        //candles
        // candles();

        //orders
        //  orders();

        //assets
        // assets();

        //fills
        //fills();

    }

    public static void depth() {
        final ParamRequest request = ParamRequest.builder()
                .biz("spot")
                .type("depth")
                .base("btc")
                .quote("usdt")
                .build();

        final WebSocketRequest webSocketRequest = WebSocketRequest.builder()
                .params(request)
                .event(EventEnum.SUBSCRIBE)
                .build();

        final BitMoreWebSocketClient webSocketClient = BitMoreWebSocketClient.builder().configuration(webSocketRequest).build();


        webSocketClient.spot().newWebSocketClient().depth(webSocketRequest, new WebSocketApiCallBack<DepthInfo>() {
            @Override
            public void onResponse(final DepthInfo response) {
                System.out.println(JSON.toJSONString(response));
            }
        });
    }

    public static void tickers() {
        final ParamRequest request = ParamRequest.builder()
                .biz("spot")
                .type("tickers")
                .build();

        final WebSocketRequest webSocketRequest = WebSocketRequest.builder()
                .params(request)
                .event(EventEnum.SUBSCRIBE)
                .build();

        final BitMoreWebSocketClient webSocketClient = BitMoreWebSocketClient.builder().configuration(webSocketRequest).build();


        webSocketClient.spot().newWebSocketClient().tickers(webSocketRequest, new WebSocketApiCallBack<TickersInfo>() {
            @Override
            public void onResponse(final TickersInfo response) {
                System.out.println(JSON.toJSONString(response));
            }
        });
    }

    public static void candles() {
        final ParamRequest request = ParamRequest.builder()
                .biz("spot")
                .type("candles")
                .base("btc")
                .quote("usdt")
                .granularity(KlineEnum.MIN1.getTypeName())
                .build();

        final WebSocketRequest webSocketRequest = WebSocketRequest.builder()
                .params(request)
                .event(EventEnum.SUBSCRIBE)
                .build();

        final BitMoreWebSocketClient webSocketClient = BitMoreWebSocketClient.builder().configuration(webSocketRequest).build();


        webSocketClient.spot().newWebSocketClient().candles(webSocketRequest, new WebSocketApiCallBack<CandlesInfo>() {
            @Override
            public void onResponse(final CandlesInfo response) {
                System.out.println(JSON.toJSONString(response));
            }
        });
    }

    public static void orders() {
        final ParamRequest request = ParamRequest.builder()
                .api_key("")
                .passphrase("")
                .biz("spot")
                .type("orders")
                .build();

        final WebSocketRequest webSocketRequest = WebSocketRequest.builder()
                .params(request)
                .event(EventEnum.SUBSCRIBE)
                .build();

        final BitMoreWebSocketClient webSocketClient = BitMoreWebSocketClient.builder().configuration(webSocketRequest).build();


        webSocketClient.spot().newWebSocketClient().orders(webSocketRequest, new WebSocketApiCallBack<OrdersInfo>() {
            @Override
            public void onResponse(final OrdersInfo response) {
                System.out.println(JSON.toJSONString(response));
            }
        });
    }

    public static void assets() {
        final ParamRequest request = ParamRequest.builder()
                .api_key("")
                .passphrase("")
                .biz("spot")
                .type("assets")
                .build();

        final WebSocketRequest webSocketRequest = WebSocketRequest.builder()
                .params(request)
                .event(EventEnum.SUBSCRIBE)
                .build();

        final BitMoreWebSocketClient webSocketClient = BitMoreWebSocketClient.builder().configuration(webSocketRequest).build();


        webSocketClient.spot().newWebSocketClient().assets(webSocketRequest, new WebSocketApiCallBack<AssetsInfo>() {
            @Override
            public void onResponse(final AssetsInfo response) {
                System.out.println(JSON.toJSONString(response));
            }
        });
    }

    public static void fills() {
        final ParamRequest request = ParamRequest.builder()
                .biz("spot")
                .type("fills")
                .base("btc")
                .quote("usdt")
                .build();

        final WebSocketRequest webSocketRequest = WebSocketRequest.builder()
                .params(request)
                .event(EventEnum.SUBSCRIBE)
                .build();

        final BitMoreWebSocketClient webSocketClient = BitMoreWebSocketClient.builder().configuration(webSocketRequest).build();


        webSocketClient.spot().newWebSocketClient().fills(webSocketRequest, new WebSocketApiCallBack<FillsInfo>() {
            @Override
            public void onResponse(final FillsInfo response) {
                System.out.println(JSON.toJSONString(response));
            }
        });
    }
}