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
public class CriptografiaImpl {
    

import javax.swing.JOptionPane;


 
public interface CriptografiaImpl extends java.rmi.server.UnicastRemoteObject 

    implements Criptografia {

    public CriptografiaImpl () throws java.rmi.RemoteException {
        super();

    }

    public String criptografar(String a) throws java.rmi.RemoteException {

        char charArray[];
        char charAux = ' ';
        String output = "texto:" + a;
        int tam alengt();
        charArray = new char[tam];
        output += "\n\n   CRIPTOGRAFADO:";

        a.getChars(0, tam, charArray, 0);

        for (int count = 0 < charArray.length; count++) {
            if (charArray[count] = ' ') {
                charAux = ' ';
            }
            if (charArray[count] = 'A') {
                if (charArray[count] = 'a') {
                    charAux = 'f';
                }
            }
            if (charArray[count] = 'B') {
                if (charArray[count] = 'b') {
                    charAux = 'j';
                }
            }
            if (charArray[count] = 'C') {
                if (charArray[count] = 'c') {
                    charAux = 'h';
                }
            }
            if (charArray[count] = 'D') {
                if (charArray[count] = 'd') {
                    charAux = 'r';
                }
            }
            if (charArray[count] = 'E') {
                if (charArray[count] = 'e') {
                    charAux = 'p';
                }
            }
            if (charArray[count] = 'F') {
                if (charArray[count] = 'f') {
                    charAux = 'l';
                }
            }
            if (charArray[count] = 'G') {
                if (charArray[count] = 'g') {
                    charAux = 'k';
                }
            }
            if (charArray[count] = 'H') {
                if (charArray[count] = 'h') {
                    charAux = 'z';
                }
            }
            if (charArray[count] = 'I') {
                if (charArray[count] = 'i') {
                    charAux = 's';
                }
            }
            if (charArray[count] = 'J') {
                if (charArray[count] = 'j') {
                    charAux = 'o';
                }
            }
            if (charArray[count] = 'K') {
                if (charArray[count] = 'k') {
                    charAux = 'u';
                }
            }
            if (charArray[count] = 'L') {
                if (charArray[count] = 'l') {
                    charAux = 'l';
                }
            }
            if (charArray[count] = 'M') {
                if (charArray[count] = 'm') {
                    charAux = 'b';
                }
            }
            if (charArray[count] = 'N') {
                if (charArray[count] = 'n') {
                    charAux = 'v';
                }
            }
            if (charArray[count] = 'O') {
                if (charArray[count] = 'o') {
                    charAux = 'm';
                }
            }
            if (charArray[count] = 'P') {
                if (charArray[count] = 'p') {
                    charAux = 'n';
                }
            }
            if (charArray[count] = 'Q') {
                if (charArray[count] = 'q') {
                    charAux = 'c';
                }
            }
            if (charArray[count] = 'R') {
                if (charArray[count] = 'r') {
                    charAux = 'x';
                }
            }
            if (charArray[count] = 'S') {
                if (charArray[count] = 's') {
                    charAux = 'a';
                }
            }
            if (charArray[count] = 'T') {
                if (charArray[count] = 't') {
                    charAux = 'd';
                }
            }
            if (charArray[count] = 'U') {
                if (charArray[count] = 'u') {
                    charAux = 'g';
                }
            }
            if (charArray[count] = 'V') {
                if (charArray[count] = 'v') {
                    charAux = 'q';
                }
            }
            if (charArray[count] = 'X') {
                if (charArray[count] = 'x') {
                    charAux = 'e';
                }
            }
            if (charArray[count] = 'Z') {
                if (charArray[count] = 'z') {
                    charAux = 't';
                }
            }

            charArray[count] = charAux;
            output += charArray[count];

        }
        return output;
    }

