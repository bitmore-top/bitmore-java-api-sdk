package top.bitmore.dax.sdk.openapi.ws;

import top.bitmore.dax.sdk.openapi.ws.domain.AssetsInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.CandlesInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.DepthInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.FillsInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.OrdersInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.TickersInfo;
import top.bitmore.dax.sdk.openapi.ws.domain.WebSocketRequest;

import java.io.Closeable;

/**
 * @author newex-team
 * @date 2018/6/11
 */
public interface SpotWebSocketClient extends Closeable {


    /**
     * depth
     *
     * @param webSocketRequest
     * @param callBack
     * @return
     */
    Closeable depth(WebSocketRequest webSocketRequest, WebSocketApiCallBack<DepthInfo> callBack);

    /**
     * tickers
     *
     * @param webSocketRequest
     * @param callBack
     * @return
     */
    Closeable tickers(WebSocketRequest webSocketRequest, WebSocketApiCallBack<TickersInfo> callBack);

    /**
     * candles
     *
     * @param webSocketRequest
     * @param callBack
     * @return
     */
    Closeable candles(WebSocketRequest webSocketRequest, WebSocketApiCallBack<CandlesInfo> callBack);


    /**
     * orders
     *
     * @param webSocketRequest
     * @param callBack
     * @return
     */
    Closeable orders(WebSocketRequest webSocketRequest, WebSocketApiCallBack<OrdersInfo> callBack);


    /**
     * assets
     *
     * @param webSocketRequest
     * @param callBack
     * @return
     */
    Closeable assets(WebSocketRequest webSocketRequest, WebSocketApiCallBack<AssetsInfo> callBack);

    /**
     * fills
     *
     * @param webSocketRequest
     * @param callBack
     * @return
     */
    Closeable fills(WebSocketRequest webSocketRequest, WebSocketApiCallBack<FillsInfo> callBack);


}
