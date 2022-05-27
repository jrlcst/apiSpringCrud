package github.com.jrlcst.entities.enums;

public enum OrderStatus {
    WAITING_PAIMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CALCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int GetCode() {
        return code;
    }

    public static github.com.jrlcst.entities.enums.OrderStatus valueOf(int code) {
        for(github.com.jrlcst.entities.enums.OrderStatus value : github.com.jrlcst.entities.enums.OrderStatus.values()) {
            if(value.GetCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
