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
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorCriptografia {

    public ServidorCriptografia() {

        try {
            LocateRegistry.createRegistry(2021);
            CriptografiaImpl obj = new CriptografiaImpl();
            Naming.rebind("//localhost:2021/criptoService", obj);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public static void main(String[] args) {
       
        new ServidorCriptografia();

    }
}

