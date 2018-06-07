package top.bitmore.dax.sdk.openapi.common.enums;

import lombok.Getter;

/**
 * @author newex-team
 * @date 2018-05-05
 */
@Getter
public enum SupportedLocaleEnum {
    EN_US("en-US", "English"),
    ZH_CN("zh-CN", "Simplified chinese"),
    ZH_TW("zh-TW", "Traditional chinese");

    private final String name;
    private final String comment;

    SupportedLocaleEnum(final String name, final String comment) {
        this.name = name;
        this.comment = comment;
    }
}
