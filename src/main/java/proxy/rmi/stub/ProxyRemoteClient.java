package proxy.rmi.stub;

import proxy.rmi.skeleton.ProxyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Creator: Yao
 * Date:    2018/1/17
 * For:
 * Other:
 */
public class ProxyRemoteClient {

    public void getStatus() {

        try {
            ProxyRemote remote = (ProxyRemote) Naming.lookup("rmi://127.0.0.1/proxy");
            System.out.println(remote.getStatus());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new ProxyRemoteClient().getStatus();
        }
    }
}
