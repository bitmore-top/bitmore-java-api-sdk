package top.bitmore.dax.sdk.openapi.client;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import top.bitmore.dax.sdk.openapi.common.domain.ClientParameter;
import top.bitmore.dax.sdk.openapi.common.enums.Content;
import top.bitmore.dax.sdk.openapi.futures.FuturesApiFacade;
import top.bitmore.dax.sdk.openapi.spot.SpotApiFacade;

/**
 * coinmex exchange rest open api Client
 *
 * @author coinmex-sdk-team
 * @date 2018/04/28
 */
public class BitMoreRestClient {
    private final ApiClient apiClient;
    private final ClientParameter configuration;

    private BitMoreRestClient(final Builder builder) {
        this.configuration = builder.configuration;
        Validate.notNull(this.configuration, "configuration is null");
        Validate.notNull(this.configuration.getApiKey(), "apiKey is null");
        Validate.notNull(this.configuration.getSecretKey(), "secretKey is null");
        Validate.notNull(this.configuration.getPassphrase(), "passphrase is null");

        this.configuration.setBaseUrl(StringUtils.defaultIfBlank(this.configuration.getBaseUrl(), Content.BASE_URL));
        this.configuration.setTimeout(ObjectUtils.defaultIfNull(this.configuration.getTimeout(), Content.TIME_OUT));

        this.apiClient = new ApiClient(this.configuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 现货 REST API Endpoint
     *
     * @return SpotApiFacade
     */
    public SpotApiFacade spot() {
        return new SpotApiFacade(this.apiClient);
    }

    /**
     * 期货 REST API Endpoint
     *
     * @return FuturesApiFacade
     */
    public FuturesApiFacade futures() {
        return new FuturesApiFacade(this.apiClient);
    }

    public static class Builder {
        private ClientParameter configuration;

        public Builder configuration(final ClientParameter value) {
            this.configuration = value;
            return this;
        }

        public BitMoreRestClient build() {
            return new BitMoreRestClient(this);
        }
    }
}
