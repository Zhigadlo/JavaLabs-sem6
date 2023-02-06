package lab.WebService;

import javax.jws.WebService;

@WebService(endpointInterface = "lab.WebService.IConverterWebService")
public class ConverterWebService implements IConverterWebService {
    @Override
    public String intToBinary(int num) {
        return Integer.toString(num, 2);
    }

    @Override
    public String intToSystem3(int num) {
        return Integer.toString(num, 3);
    }

    @Override
    public String intToSystem8(int num) {
        return Integer.toString(num, 8);
    }

    @Override
    public String intToSystem16(int num) {
        return Integer.toString(num, 16);
    }
}
