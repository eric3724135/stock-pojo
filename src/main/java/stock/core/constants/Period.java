package stock.core.constants;

public enum Period {
    ONE_MIN("1m"),
    FIVE_MIN("5m"),
    FIFTEEN_MIN("15m"),
    THIRTY_MIN("30m"),
    ONE_HOUR("60m"),
    ONE_DAY("d"),
    ONE_WEEK("w"),
    ONE_MONTH("m");


    Period(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }
}
