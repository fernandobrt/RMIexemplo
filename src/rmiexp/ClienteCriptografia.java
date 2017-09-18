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

package rmiexp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class ClienteCriptografia {

    public static void main(String[] args) {

        String a, resp = "";
        int opcao = JOptionPane.showConfirmDialog(null, "Sim = criptografia" + "\nNao= deografia ", "Escolha uma opçao", 0);

        try {
            criptografia cripto = (Criptografia) Naming.lookup("//localhost/" + "criptoService");
            if (opcao == 0) {
                A = JOptionPane.showInputDialog("entre com o TEXTO:  sem acento");
                resp = cripto.criptografar(A);

            } else {
                A = JOptionPane.showInputDialog("entre com o TEXTO:  sem acento");
                resp = cripto.deografar(A);
            }
        } catch (MalformedURLException murle) {

            System.out.println();
            System.out.println("MalformedURLException");
            System.out.println(murle);

        } catch (RemoteException re) {

            System.out.println();
            System.out.println("RemoteException");
            System.out.println(re);
           
        }catch(NotBoundException nbe){
            System.out.println();
            System.out.println("NotBoundException");
            System.out.println(nbe) 
        }catch(java.lang.ArithmeticException ae){
            System.out.println();
            System.out.println("java.lang.ArithmeticException");
            System.out.println(ae) ;
            
        }catch(java.lang.StringIndexOutOfBoundsException str){
            System.out.println();
            System.out.println("java.lang.StringIndexOutOfBoundsException");
            System.out.println(str) ; 
            
        }catch(java.lang.ArrayIndexOutOfBoundsException arr){
            System.out.println();
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            System.out.println(arr) ;
            
        }//fim catch
        
        JTextArea outputArea = new JTextArea();
        outputArea.setText (resp);
        
        
        JOptionPane.showMessageDialog(null, outputArea, "TEXTO CRIPTOGRAFADO:"
       , JOptionPane.INFORMATION_MESSAGE)
            
    }
}
