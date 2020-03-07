import iptv.CSPResponseServiceStub;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) throws RemoteException {
        System.out.println("Hello World!");



            CSPResponseServiceStub stub = new CSPResponseServiceStub("http://127.0.0.1:8080/services/CSPResponseService/");


        CSPResponseServiceStub.ResultNotify resultNotify = new CSPResponseServiceStub.ResultNotify();
        org.apache.axis2.databinding.types.soapencoding.String cspId = new org.apache.axis2.databinding.types.soapencoding.String();
        cspId.setString("aaaaa");
        resultNotify.setCSPID(cspId);

        resultNotify.setLSPID(cspId);
        resultNotify.setCmdResult(101);
        resultNotify.setCorrelateID(cspId);
        resultNotify.setResultFileURL(cspId);


        CSPResponseServiceStub.ResultNotifyResponse notifyResponse = stub.resultNotify(resultNotify);


        CSPResponseServiceStub.CSPResult csr = notifyResponse.getResultNotifyReturn();


        System.out.println(csr.getResult());
        System.out.println(csr.getErrorDescription());


    }
}
