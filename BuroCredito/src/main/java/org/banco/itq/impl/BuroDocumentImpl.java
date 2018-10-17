/*
 * An XML document type.
 * Localname: buro
 * Namespace: http//:itq.banco.org
 * Java type: org.banco.itq.BuroDocument
 *
 * Automatically generated - do not modify.
 */
package org.banco.itq.impl;
/**
 * A document containing one buro(@http//:itq.banco.org) element.
 *
 * This is a complex type.
 */
public class BuroDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.banco.itq.BuroDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuroDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BURO$0 = 
        new javax.xml.namespace.QName("http//:itq.banco.org", "buro");
    
    
    /**
     * Gets the "buro" element
     */
    public org.banco.itq.BuroDocument.Buro getBuro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.banco.itq.BuroDocument.Buro target = null;
            target = (org.banco.itq.BuroDocument.Buro)get_store().find_element_user(BURO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buro" element
     */
    public void setBuro(org.banco.itq.BuroDocument.Buro buro)
    {
        generatedSetterHelperImpl(buro, BURO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "buro" element
     */
    public org.banco.itq.BuroDocument.Buro addNewBuro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.banco.itq.BuroDocument.Buro target = null;
            target = (org.banco.itq.BuroDocument.Buro)get_store().add_element_user(BURO$0);
            return target;
        }
    }
    /**
     * An XML buro(@http//:itq.banco.org).
     *
     * This is a complex type.
     */
    public static class BuroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.banco.itq.BuroDocument.Buro
    {
        private static final long serialVersionUID = 1L;
        
        public BuroImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACREDITO$0 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "acredito");
        
        
        /**
         * Gets the "acredito" element
         */
        public boolean getAcredito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACREDITO$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "acredito" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetAcredito()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACREDITO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "acredito" element
         */
        public void setAcredito(boolean acredito)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACREDITO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACREDITO$0);
                }
                target.setBooleanValue(acredito);
            }
        }
        
        /**
         * Sets (as xml) the "acredito" element
         */
        public void xsetAcredito(org.apache.xmlbeans.XmlBoolean acredito)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACREDITO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACREDITO$0);
                }
                target.set(acredito);
            }
        }
    }
}
