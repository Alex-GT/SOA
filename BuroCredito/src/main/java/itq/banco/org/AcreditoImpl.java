/**
 * AcreditoSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package itq.banco.org;

import org.banco.itq.BuroDocument;
import org.banco.itq.BuroDocument.Buro;
import org.banco.itq.ClienteDocument;
import org.banco.itq.ClienteDocument.Cliente;

/**
 *  AcreditoSkeleton java skeleton for the axisService
 */
public class AcreditoImpl {
    /**
     * Auto generated method signature
     *
     * @param cliente
     * @return buro
     */
    public BuroDocument acredito(ClienteDocument cliente) {
    	BuroDocument doc = BuroDocument.Factory.newInstance();
    	Buro res = doc.addNewBuro();
    	Cliente req = cliente.getCliente();
    	
    	return doc;
    }
}
