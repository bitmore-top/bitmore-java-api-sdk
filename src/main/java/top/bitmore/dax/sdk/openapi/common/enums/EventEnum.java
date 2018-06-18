package top.bitmore.dax.sdk.openapi.common.enums;

/**
 * @author newex-team
 * @date 2018/6/11
 */
public enum EventEnum {

    /**
     * 登录
     */
    SIGNIN("signin"),
    /**
     * 订阅
     */
    SUBSCRIBE("subscribe"),
    /**
     * 取消订阅
     */
    UNSUBSCRIBE("unsubscribe");

    private final String typeName;

    EventEnum(final String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }

}
