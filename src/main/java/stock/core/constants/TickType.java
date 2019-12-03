package stock.core.constants;

public enum TickType {
    QUOTE("ta"),
    TICK("tick");

    TickType(String yahooCode) {
        this.yahooCode = yahooCode;
    }

    private String yahooCode;


    public String getYahooCode() {
        return yahooCode;
    }
}
