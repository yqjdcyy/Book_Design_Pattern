package proxy.java.skeleton;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Creator: Yao
 * Date:    2018/1/17
 * For:
 * Other:
 */
public class ProxyRemoteImpl extends UnicastRemoteObject implements ProxyRemote {

    public ProxyRemoteImpl() throws RemoteException {
    }

    @Override
    public String getStatus() throws RemoteException {
        return "running";
    }

    public static void main(String[] args) {

        try {
            Naming.rebind("proxy", new ProxyRemoteImpl());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
