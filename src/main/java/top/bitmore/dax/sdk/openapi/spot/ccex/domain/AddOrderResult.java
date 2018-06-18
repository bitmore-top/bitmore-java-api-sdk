package top.bitmore.dax.sdk.openapi.spot.ccex.domain;

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
public class AddOrderResult {
    /**
     * 下单是否成功
     */
    private boolean result;
    /**
     * 订单 id
     */
    private Long orderId;
}
