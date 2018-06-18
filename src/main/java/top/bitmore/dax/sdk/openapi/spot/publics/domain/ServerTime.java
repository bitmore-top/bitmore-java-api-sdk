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
public class ServerTime {
    /**
     * 时间戳
     */
    private Long timestamp;
    /**
     * 时间
     */
    private String iso;
}
