package top.bitmore.dax.sdk.openapi.spot.ccex.api;

import com.alibaba.fastjson.JSONObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Account;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Ledger;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.WithdrawalParam;

import java.util.List;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
public interface AccountApi {

    @GET("spot/ccex/account/assets")
    Call<List<Account>> assets();


    @GET("spot/ccex/account/{currencyCode}/ledger")
    Call<List<Ledger>> ledger(@Path("currencyCode") String currencyCode,
                              @Query("before") Long before,
                              @Query("after") Long after,
                              @Query("limit") Integer limit);

    @POST("spot/ccex/account/withdraw")
    Call<JSONObject> withdrawal(@Body WithdrawalParam body);
}
