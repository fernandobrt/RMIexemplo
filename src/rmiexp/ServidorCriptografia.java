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

public class ServidorCriptografia {

    public ServidorCriptografia() {

        try {
            CriptografiaImpl obj = new CriptografiaImpl();
            Naming.rebind("//localhost:2020/criptoService", obj);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public static void main(String[] args) {
       
        new ServidorCriptografia();

    }
}
