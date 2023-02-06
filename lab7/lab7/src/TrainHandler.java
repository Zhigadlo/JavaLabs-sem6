import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.sql.Date;
import java.util.ArrayList;

public class TrainHandler extends DefaultHandler{
    ArrayList<Train> tList;
    Train t;
    boolean train, startStation, endStation,date, cost, number;
    @Override
    public void startDocument() throws SAXException {
        tList = new ArrayList<>();
        System.out.println("Document Started");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println(tList.size());
        System.out.println(tList);
        System.out.println("Document ended");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(qName);
        switch(qName) {
            case "train": t = new Train();
                train = true;
                break;
            case "startStation" : startStation = true;
                break;
            case "endStation" : endStation = true;
                break;
            case "date" : date = true;
                break;
            case "cost" : cost = true;
                break;
            case "number" : number = true;
                break;
        }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        System.out.println("character event");
        String val = new String(ch, start, length);
        if(number){
            t.setNumber(Integer.parseInt(val));
            number = false;
        } else if(startStation) {
            t.setStartStation(val);
            startStation = false;
        } else if(endStation) {
            t.setEndStation(val);
            endStation =false;
        } else if(date){
            t.setDate(Date.valueOf(val));
            date = false;
        } else if(cost){
            t.setCost(Integer.parseInt(val));
            cost = false;
        } else if(number){
            t.setNumber(Integer.parseInt(val));
            number = false;
        }
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch(qName) {
            case "train": tList.add(t);
                train =false;
                break;
        }
        System.out.println(qName+"train ended");
    }

    public ArrayList<Train> getTrains(){
        return tList;
    }
}
