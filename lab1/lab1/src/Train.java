import java.io.Serializable;

import java.util.Date;

public class Train implements Serializable {
    private String startStation;
    private String endStation;
    private Date date;
    private int number;
    private int cost;



    @Override
    public String toString() {
        return number + " " + startStation + "-" + endStation + " " + date.toLocaleString();
    }

    public String toCheckString(){
        return "Number: " + number + "\n" +
               "Start station: " + startStation + "\n" +
               "End station: " + endStation + "\n" +
               "Date: " + date.toLocaleString() + "\n" +
               "Cost: " + cost;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getStartStation() {
        return startStation;
    }
    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }
    public String getEndStation() {
        return endStation;
    }
    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }
}
