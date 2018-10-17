/*
 * An XML document type.
 * Localname: cliente
 * Namespace: http//:itq.banco.org
 * Java type: org.banco.itq.ClienteDocument
 *
 * Automatically generated - do not modify.
 */
package org.banco.itq.impl;
/**
 * A document containing one cliente(@http//:itq.banco.org) element.
 *
 * This is a complex type.
 */
public class ClienteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.banco.itq.ClienteDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClienteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTE$0 = 
        new javax.xml.namespace.QName("http//:itq.banco.org", "cliente");
    
    
    /**
     * Gets the "cliente" element
     */
    public org.banco.itq.ClienteDocument.Cliente getCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.banco.itq.ClienteDocument.Cliente target = null;
            target = (org.banco.itq.ClienteDocument.Cliente)get_store().find_element_user(CLIENTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cliente" element
     */
    public void setCliente(org.banco.itq.ClienteDocument.Cliente cliente)
    {
        generatedSetterHelperImpl(cliente, CLIENTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cliente" element
     */
    public org.banco.itq.ClienteDocument.Cliente addNewCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.banco.itq.ClienteDocument.Cliente target = null;
            target = (org.banco.itq.ClienteDocument.Cliente)get_store().add_element_user(CLIENTE$0);
            return target;
        }
    }
    /**
     * An XML cliente(@http//:itq.banco.org).
     *
     * This is a complex type.
     */
    public static class ClienteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.banco.itq.ClienteDocument.Cliente
    {
        private static final long serialVersionUID = 1L;
        
        public ClienteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOMBRE$0 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "nombre");
        private static final javax.xml.namespace.QName APELLIDOS$2 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "apellidos");
        private static final javax.xml.namespace.QName CURP$4 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "curp");
        private static final javax.xml.namespace.QName DOMICILIO$6 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "domicilio");
        private static final javax.xml.namespace.QName SALARIO$8 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "salario");
        private static final javax.xml.namespace.QName MONTO$10 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "monto");
        private static final javax.xml.namespace.QName TAZADEINTERES$12 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "tazaDeInteres");
        private static final javax.xml.namespace.QName PLAZO$14 = 
            new javax.xml.namespace.QName("http//:itq.banco.org", "plazo");
        
        
        /**
         * Gets the "nombre" element
         */
        public java.lang.String getNombre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nombre" element
         */
        public org.apache.xmlbeans.XmlString xgetNombre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nombre" element
         */
        public void setNombre(java.lang.String nombre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$0);
                }
                target.setStringValue(nombre);
            }
        }
        
        /**
         * Sets (as xml) the "nombre" element
         */
        public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$0);
                }
                target.set(nombre);
            }
        }
        
        /**
         * Gets the "apellidos" element
         */
        public java.lang.String getApellidos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apellidos" element
         */
        public org.apache.xmlbeans.XmlString xgetApellidos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "apellidos" element
         */
        public void setApellidos(java.lang.String apellidos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOS$2);
                }
                target.setStringValue(apellidos);
            }
        }
        
        /**
         * Sets (as xml) the "apellidos" element
         */
        public void xsetApellidos(org.apache.xmlbeans.XmlString apellidos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOS$2);
                }
                target.set(apellidos);
            }
        }
        
        /**
         * Gets the "curp" element
         */
        public java.lang.String getCurp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "curp" element
         */
        public org.apache.xmlbeans.XmlString xgetCurp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURP$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "curp" element
         */
        public void setCurp(java.lang.String curp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURP$4);
                }
                target.setStringValue(curp);
            }
        }
        
        /**
         * Sets (as xml) the "curp" element
         */
        public void xsetCurp(org.apache.xmlbeans.XmlString curp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURP$4);
                }
                target.set(curp);
            }
        }
        
        /**
         * Gets the "domicilio" element
         */
        public java.lang.String getDomicilio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "domicilio" element
         */
        public org.apache.xmlbeans.XmlString xgetDomicilio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "domicilio" element
         */
        public void setDomicilio(java.lang.String domicilio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILIO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILIO$6);
                }
                target.setStringValue(domicilio);
            }
        }
        
        /**
         * Sets (as xml) the "domicilio" element
         */
        public void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILIO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILIO$6);
                }
                target.set(domicilio);
            }
        }
        
        /**
         * Gets the "salario" element
         */
        public double getSalario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARIO$8, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "salario" element
         */
        public org.apache.xmlbeans.XmlDouble xgetSalario()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALARIO$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "salario" element
         */
        public void setSalario(double salario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARIO$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALARIO$8);
                }
                target.setDoubleValue(salario);
            }
        }
        
        /**
         * Sets (as xml) the "salario" element
         */
        public void xsetSalario(org.apache.xmlbeans.XmlDouble salario)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SALARIO$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SALARIO$8);
                }
                target.set(salario);
            }
        }
        
        /**
         * Gets the "monto" element
         */
        public double getMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$10, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "monto" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "monto" element
         */
        public void setMonto(double monto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$10);
                }
                target.setDoubleValue(monto);
            }
        }
        
        /**
         * Sets (as xml) the "monto" element
         */
        public void xsetMonto(org.apache.xmlbeans.XmlDouble monto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$10);
                }
                target.set(monto);
            }
        }
        
        /**
         * Gets the "tazaDeInteres" element
         */
        public double getTazaDeInteres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAZADEINTERES$12, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "tazaDeInteres" element
         */
        public org.apache.xmlbeans.XmlDouble xgetTazaDeInteres()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAZADEINTERES$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tazaDeInteres" element
         */
        public void setTazaDeInteres(double tazaDeInteres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAZADEINTERES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAZADEINTERES$12);
                }
                target.setDoubleValue(tazaDeInteres);
            }
        }
        
        /**
         * Sets (as xml) the "tazaDeInteres" element
         */
        public void xsetTazaDeInteres(org.apache.xmlbeans.XmlDouble tazaDeInteres)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAZADEINTERES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TAZADEINTERES$12);
                }
                target.set(tazaDeInteres);
            }
        }
        
        /**
         * Gets the "plazo" element
         */
        public double getPlazo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZO$14, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "plazo" element
         */
        public org.apache.xmlbeans.XmlDouble xgetPlazo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PLAZO$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "plazo" element
         */
        public void setPlazo(double plazo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLAZO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLAZO$14);
                }
                target.setDoubleValue(plazo);
            }
        }
        
        /**
         * Sets (as xml) the "plazo" element
         */
        public void xsetPlazo(org.apache.xmlbeans.XmlDouble plazo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PLAZO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PLAZO$14);
                }
                target.set(plazo);
            }
        }
    }
}
