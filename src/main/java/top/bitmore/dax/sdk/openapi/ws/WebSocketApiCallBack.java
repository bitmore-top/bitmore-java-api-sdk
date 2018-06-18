package top.bitmore.dax.sdk.openapi.ws;

/**
 * @author newex-team
 * @date 2018/6/11
 */
@FunctionalInterface
public interface WebSocketApiCallBack<T> {

    /**
     * websocket call back respose
     *
     * @param response
     */
    void onResponse(T response);

    /**
     * web socket failure
     *
     * @param cause
     */
    default void onFailure(final Throwable cause) {
    }
}
