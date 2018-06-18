package top.bitmore.dax.sdk.openapi.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author coinmex-sdk-team
 * @date 2018/04/28
 */
public enum SideTypeEnum {
    BUY("buy"),
    SELL("sell");

    private final String sideName;

    private SideTypeEnum(final String sideName) {
        this.sideName = sideName;
    }

    public static SideTypeEnum fromName(final String sideName) {
        if (StringUtils.isEmpty(sideName)) {
            return null;
        }
        for (final SideTypeEnum t : SideTypeEnum.values()) {
            if (t.getSideName().equalsIgnoreCase(sideName)) {
                return t;
            }
        }
        return null;
    }


    public String getSideName() {
        return this.sideName;
    }
}