/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordelicencas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limite_Digitos extends PlainDocument {

    private int quantidademax;

    public Limite_Digitos(int maxLen) {
        super();
        if (maxLen <= 0) {
            throw new IllegalArgumentException("Especifique a quantidade");
        }
        quantidademax = maxLen;
    }

    Limite_Digitos(int columns, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null || getLength() == quantidademax) {
            return;
        }
        int totalquantia = (getLength() + str.length());
        if (totalquantia <= quantidademax) {
            super.insertString(offset, str.replaceAll("[^a-z]^0-9", ""), attr);
            return;

        }
        String nova = str.substring(0, getLength() - quantidademax);
        super.insertString(offset, nova, attr);

    }

}
