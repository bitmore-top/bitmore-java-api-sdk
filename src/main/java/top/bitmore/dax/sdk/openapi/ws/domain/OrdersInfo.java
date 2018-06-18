package top.bitmore.dax.sdk.openapi.ws.domain;

import lombok.Data;
import top.bitmore.dax.sdk.openapi.spot.ccex.domain.Order;

/**
 * @author newex-team
 * @date 2018/6/12
 */
@Data
public class OrdersInfo extends ParamRequest {
    /**
     * order
     */
    private Order data;
}
