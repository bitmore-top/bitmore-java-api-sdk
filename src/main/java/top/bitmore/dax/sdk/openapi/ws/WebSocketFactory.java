package top.bitmore.dax.sdk.openapi.ws;

import top.bitmore.dax.sdk.openapi.ws.impl.SpotWebSocketClientImpl;

/**
 * @author newex-team
 * @date 2018/6/11
 */
public class WebSocketFactory {

    public static SpotWebSocketClient newWebSocketClient() {
        return new SpotWebSocketClientImpl();
    }

}
