package top.bitmore.dax.sdk.openapi.spot.publics.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author coinmex-sdk-team
 * @date 2018/04/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CodeInfo {

    /**
     * 币对
     */
    private String code;
    /**
     * 基准币
     */
    private String baseCurrencyCode;
    /**
     * 交易币
     */
    private String quoteCurrencyCode;
    /**
     * 基准币最小交易量
     */
    private String baseMinSize;
    /**
     * 基准币最大交易量
     */
    private String baseMaxSize;
    /**
     * 交易币最小交易单位
     */
    private String quoteIncrement;
}
