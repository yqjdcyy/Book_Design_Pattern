package proxy.rmi.skeleton;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Creator: Yao
 * Date:    2018/1/17
 * For:
 * Other:
 */
public interface ProxyRemote extends Remote {

    public String getStatus() throws RemoteException;
}
