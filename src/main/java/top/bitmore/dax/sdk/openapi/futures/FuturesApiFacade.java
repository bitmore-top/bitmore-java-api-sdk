package top.bitmore.dax.sdk.openapi.futures;

import top.bitmore.dax.sdk.openapi.client.ApiClient;

/**
 * @author newex-team
 * @date 2018-05-01
 */
public class FuturesApiFacade {
    private final ApiClient apiClient;

    public FuturesApiFacade(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }
}
