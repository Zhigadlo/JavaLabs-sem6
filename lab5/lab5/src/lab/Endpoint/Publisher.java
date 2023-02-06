package lab.Endpoint;

import lab.WebService.ConverterWebService;
import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:1000/WebService/convert/", new ConverterWebService());
    }
}
