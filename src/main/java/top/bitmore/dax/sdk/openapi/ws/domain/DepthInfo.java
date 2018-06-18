package top.bitmore.dax.sdk.openapi.ws.domain;

import lombok.Data;
import top.bitmore.dax.sdk.openapi.spot.publics.domain.OrderBook;

/**
 * @author newex-team
 * @date 2018/6/12
 */
@Data
public class DepthInfo extends ParamRequest {

    /**
     * data
     */
    private OrderBook data;
}
