package moin.miley.cse489.stock_prediction_project.ui.slideshow;

public class Stockdata {
    private String Date;
    private Double Open;
    private Double High;
    private Double Low;
    private Double Close;
    private Double Volume;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Double getOpen() {
        return Open;
    }

    public void setOpen(Double open) {
        Open = open;
    }

    public Double getHigh() {
        return High;
    }

    public Double getLow() {
        return Low;
    }

    public void setLow(Double low) {
        Low = low;
    }

    public void setHigh(Double high) {
        High = high;
    }

    public Double getClose() {
        return Close;
    }

    public void setClose(Double close) {
        Close = close;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double volume) {
        Volume = volume;
    }

    @Override
    public String toString() {
        return "The Stock quote for the selected stock is: " +
                "Date = '" + Date + '\'' +
                ", Open = " + Open +
                ", High = " + High +
                ", Low = " + Low +
                ", Close = " + Close +
                ", Volume = " + Volume;
    }
}
