package top.bitmore.dax.sdk.openapi.client;

import org.apache.commons.lang3.Validate;
import top.bitmore.dax.sdk.openapi.ws.WebSocketFactory;
import top.bitmore.dax.sdk.openapi.ws.domain.WebSocketRequest;

/**
 * @author newex-team
 * @date 2018/6/11
 */
public class BitMoreWebSocketClient {

    private final WebSocketRequest webSocketRequest;

    public BitMoreWebSocketClient(final Builder builder) {

        this.webSocketRequest = builder.webSocketRequest;
        Validate.notNull(this.webSocketRequest, "webSocketRequest is null");
        Validate.notNull(this.webSocketRequest.getEvent(), "event is null");
    }

    public WebSocketFactory spot() {
        return new WebSocketFactory();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private WebSocketRequest webSocketRequest;

        public Builder configuration(final WebSocketRequest value) {
            this.webSocketRequest = value;
            return this;
        }

        public BitMoreWebSocketClient build() {
            return new BitMoreWebSocketClient(this);
        }
    }
}
