/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexp;

/**
 *
 * @author fbrito
 */

    public interface Criptografia extends java.rmi.Remote {
        
    public String criptografar (String a) throws java.rmi.RemoteException;
    public String descriptografar (String a) throws java.rmi.RemoteException;
    
}


