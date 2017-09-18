/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexp;

import java.rmi.RemoteException;

/**
 *
 * @author fbrito
 */
public class CriptografiaImpl extends java.rmi.server.UnicastRemoteObject implements Criptografia {

    public CriptografiaImpl() throws RemoteException {
        super();
    }

   

    

    public String criptografar(String a) throws java.rmi.RemoteException {

      return "";
    };

    
    public String descriptografar(String a) throws RemoteException {
       return "";
    }

  

}


