package top.bitmore.dax.sdk.openapi.spot.publics.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author bitmore-sdk-team
 * @date 2018/04/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderBook {
    /**
     * 卖单
     */
    private List<String[]> asks;

    /**
     * 买单
     */
    private List<String[]> bids;
}
