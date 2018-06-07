package top.bitmore.dax.sdk.openapi.spot.ccex.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderParam {
    /**
     * 币对如 etc_eth
     */
    private String code;
    /**
     * 买卖类型 buy/sell
     */
    private String side;
    /**
     * 订单类型 限价单 limit 市价单 market
     */
    private String type;
    /**
     * 交易数量
     */
    private String size;
    /**
     * 限价单使用 价格
     */
    private String price;
    /**
     * 市价单使用 价格
     */
    private String funds;
}
