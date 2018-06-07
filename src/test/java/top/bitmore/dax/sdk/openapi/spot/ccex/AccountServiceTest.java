package top.bitmore.dax.sdk.openapi.spot.ccex;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import top.bitmore.dax.sdk.openapi.client.BitMoreClient;
import top.bitmore.dax.sdk.openapi.common.domain.Record;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Account;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Ledger;
import top.bitmore.dax.sdk.openapi.spot.common.BaseTest;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
public class AccountServiceTest extends BaseTest {

    @Test
    public void testAssets() throws IOException {
        final List<Account> accounts = this.bitmoreClient.spot().ccex().account()
                .assets();
        System.out.println(accounts);
    }

    @Test
    public void testLedger() throws IOException {
        final String currency = "BTC";
        final Record<List<Ledger>, Long> accounts = this.bitmoreClient.spot().ccex().account()
                .ledger(currency, null, null, 100);
        System.out.println(accounts);
    }

    @Test
    public void testWithdrawal() throws IOException {
        final String address = "15699188603";
        final String currency = "BTC";
        final BigDecimal amount = new BigDecimal("2.0181");
        final JSONObject object = this.bitmoreClient.spot().ccex().account()
                .withdrawal(address, currency, amount);
        System.out.println(object);
    }

    public void testExample() throws IOException {
        final BitMoreClient bitmoreClient = BitMoreClient.builder()
                .configuration(this.parameter)
                .build();

        bitmoreClient.spot()
                .ccex()
                .order().postOrder(null);

        bitmoreClient.spot()
                .ccex()
                .account().assets();

        bitmoreClient.spot()
                .publics()
                .ticker("BTC");

        bitmoreClient.spot()
                .margin();

        bitmoreClient.futures();
    }
}
