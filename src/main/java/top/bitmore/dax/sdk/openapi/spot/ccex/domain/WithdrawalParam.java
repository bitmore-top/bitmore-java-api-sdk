package top.bitmore.dax.sdk.openapi.spot.ccex.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author coinmex-sdk-team
 * @date 2018/04/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WithdrawalParam {
    /**
     * 提现金额
     */
    private BigDecimal amount;
    /**
     * 币种
     */
    private String currencyCode;
    /**
     * 地址
     */
    private String address;
}
