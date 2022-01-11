package moin.miley.cse489.stock_prediction_project.ui.StockList;

public class StockSamples {
    private String Symbol;
    private String Name;
    private String Last_Sale;
    private String Net_Change;
    private String chance_percent;
    private String market_cap;
    private String ipo_year;
    private String volume;
    private String sector;
    private String industry;

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLast_Sale() {
        return Last_Sale;
    }

    public void setLast_Sale(String last_Sale) {
        Last_Sale = last_Sale;
    }

    public String getNet_Change() {
        return Net_Change;
    }

    public void setNet_Change(String net_Change) {
        Net_Change = net_Change;
    }

    public String getChance_percent() {
        return chance_percent;
    }

    public void setChance_percent(String chance_percent) {
        this.chance_percent = chance_percent;
    }

    public String getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(String market_cap) {
        this.market_cap = market_cap;
    }

    public String getIpo_year() {
        return ipo_year;
    }

    public void setIpo_year(String ipo_year) {
        this.ipo_year = ipo_year;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "StockSamples{" +
                "Symbol='" + Symbol + '\'' +
                ", Name='" + Name + '\'' +
                ", Last_Sale='" + Last_Sale + '\'' +
                ", Net_Change='" + Net_Change + '\'' +
                ", chance_percent='" + chance_percent + '\'' +
                ", market_cap=" + market_cap +
                ", ipo_year=" + ipo_year +
                ", volume=" + volume +
                ", sector='" + sector + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }

}

