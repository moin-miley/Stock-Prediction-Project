package moin.miley.cse489.stock_prediction_project.ui.StockList;

public class StockSamples {
    private String date;
    private String trading_code;
    private double last_traded_price;
    private double high;
    private double low;
    private double opening_price;
    private double closing_price;
    private double yesterdays_closing_price;
    private double trade;
    private double value_mn;
    private double volume;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTrading_code() {
        return trading_code;
    }

    public void setTrading_code(String trading_code) {
        this.trading_code = trading_code;
    }

    public double getLast_traded_price() {
        return last_traded_price;
    }

    public void setLast_traded_price(double last_traded_price) {
        this.last_traded_price = last_traded_price;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getOpening_price() {
        return opening_price;
    }

    public void setOpening_price(double opening_price) {
        this.opening_price = opening_price;
    }

    public double getClosing_price() {
        return closing_price;
    }

    public void setClosing_price(double closing_price) {
        this.closing_price = closing_price;
    }

    public double getYesterdays_closing_price() {
        return yesterdays_closing_price;
    }

    public void setYesterdays_closing_price(double yesterdays_closing_price) {
        this.yesterdays_closing_price = yesterdays_closing_price;
    }

    public double getTrade() {
        return trade;
    }

    public void setTrade(double trade) {
        this.trade = trade;
    }

    public double getValue_mn() {
        return value_mn;
    }

    public void setValue_mn(double value_mn) {
        this.value_mn = value_mn;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "StockSamples{" +
                "date='" + date + '\'' +
                ", trading_code='" + trading_code + '\'' +
                ", last_traded_price=" + last_traded_price +
                ", high=" + high +
                ", low=" + low +
                ", opening_price=" + opening_price +
                ", closing_price=" + closing_price +
                ", yesterdays_closing_price=" + yesterdays_closing_price +
                ", trade=" + trade +
                ", value_mn=" + value_mn +
                ", volume=" + volume +
                '}';
    }
}

