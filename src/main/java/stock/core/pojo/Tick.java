package stock.core.pojo;

import lombok.Data;
import stock.core.constants.Period;

import java.util.Date;

@Data
public class Tick {

    /**
     * 股票代碼
     */
    private String symbol;
    /**
     * 股票名稱
     */
    private String name;
    /**
     * 報價時間
     */
    private Date time;

    /**
     * 價格
     */
    private double price;

    /**
     * 報價區段
     */
    private Period period;

    /**
     * 交易量
     */
    private int volume;
}
