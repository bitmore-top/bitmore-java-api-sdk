package top.bitmore.dax.sdk.openapi.spot.common;

import org.junit.After;
import org.junit.Before;
import top.bitmore.dax.sdk.openapi.client.BitMoreRestClient;
import top.bitmore.dax.sdk.openapi.common.domain.ClientParameter;
import top.bitmore.dax.sdk.openapi.common.enums.SupportedLocaleEnum;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
public class BaseTest {

    /**
     * 用户 apiKey
     */
    private final String apiKey = "";
    /**
     * 用户 secretKey
     */
    private final String secretKey = "";
    /**
     * 口令
     */
    private final String passphrase = "";
    /**
     * ccex open api 根路径
     */
    private final String baseUrl = "https://www.bitmore.top/api/v1/";

    protected ClientParameter parameter = ClientParameter.builder()
            .apiKey(this.apiKey)
            .secretKey(this.secretKey)
            .passphrase(this.passphrase)
            .baseUrl(this.baseUrl)
            .locale(SupportedLocaleEnum.EN_US.getName())
            .build();

    protected BitMoreRestClient bitmoreClient;

    @Before
    public void setup() {
        this.bitmoreClient = BitMoreRestClient.builder()
                .configuration(this.parameter)
                .build();
    }

    @After
    public void tearDown() {

    }
}
