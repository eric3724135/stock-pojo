package stock.core.pojo;

import lombok.Data;
import stock.core.constants.Period;

import java.util.Date;

/**
 * 報價Quote基本物件
 */
@Data
public class Quote {


    /**
     * 股票代碼
     */
    private String symbol;
    /**
     * 股票名稱
     */
    private String name;
    /**
     * Quote最高值
     */
    private double high;
    /**
     * Quote 最低值
     */
    private double low;
    /**
     * Quote 初始值
     */
    private double open;
    /**
     * Quote 最終值
     */
    private double close;
    /**
     * Quote 時間
     */
    private Date tradeDate;
    /**
     * Quote 取樣區間
     */
    private Period period;


}
