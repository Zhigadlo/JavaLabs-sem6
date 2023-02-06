package lab.Client;

import lab.WebService.IConverterWebService;

import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
public class Client {
    public static void main(String[] args) throws MalformedURLException {

        int num = 30;

        URL url = new URL("http://localhost:1000/WebService/convert/");
        QName qname = new QName("http://WebService.lab/", "ConverterWebServiceService");

        Service service = Service.create(url, qname);
        IConverterWebService ws = service.getPort(IConverterWebService.class);

        System.out.println("Initial numbers: " + num);
        System.out.println("Num in 2 system: " + ws.intToBinary(num));
        System.out.println("Num in 3 system: " + ws.intToSystem3(num));
        System.out.println("Num in 8 system: " + ws.intToSystem8(num));
        System.out.println("Num in 16 system: " + ws.intToSystem16(num));
    }
}
