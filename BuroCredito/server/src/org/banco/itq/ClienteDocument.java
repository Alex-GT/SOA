/*
 * An XML document type.
 * Localname: cliente
 * Namespace: http//:itq.banco.org
 * Java type: org.banco.itq.ClienteDocument
 *
 * Automatically generated - do not modify.
 */
package org.banco.itq;


/**
 * A document containing one cliente(@http//:itq.banco.org) element.
 *
 * This is a complex type.
 */
public interface ClienteDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClienteDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2D098DA133E4BF83817F288C9D51B1B").resolveHandle("cliente7fd6doctype");
    
    /**
     * Gets the "cliente" element
     */
    org.banco.itq.ClienteDocument.Cliente getCliente();
    
    /**
     * Sets the "cliente" element
     */
    void setCliente(org.banco.itq.ClienteDocument.Cliente cliente);
    
    /**
     * Appends and returns a new empty "cliente" element
     */
    org.banco.itq.ClienteDocument.Cliente addNewCliente();
    
    /**
     * An XML cliente(@http//:itq.banco.org).
     *
     * This is a complex type.
     */
    public interface Cliente extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cliente.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2D098DA133E4BF83817F288C9D51B1B").resolveHandle("cliente90b0elemtype");
        
        /**
         * Gets the "nombre" element
         */
        java.lang.String getNombre();
        
        /**
         * Gets (as xml) the "nombre" element
         */
        org.apache.xmlbeans.XmlString xgetNombre();
        
        /**
         * Sets the "nombre" element
         */
        void setNombre(java.lang.String nombre);
        
        /**
         * Sets (as xml) the "nombre" element
         */
        void xsetNombre(org.apache.xmlbeans.XmlString nombre);
        
        /**
         * Gets the "apellidos" element
         */
        java.lang.String getApellidos();
        
        /**
         * Gets (as xml) the "apellidos" element
         */
        org.apache.xmlbeans.XmlString xgetApellidos();
        
        /**
         * Sets the "apellidos" element
         */
        void setApellidos(java.lang.String apellidos);
        
        /**
         * Sets (as xml) the "apellidos" element
         */
        void xsetApellidos(org.apache.xmlbeans.XmlString apellidos);
        
        /**
         * Gets the "curp" element
         */
        java.lang.String getCurp();
        
        /**
         * Gets (as xml) the "curp" element
         */
        org.apache.xmlbeans.XmlString xgetCurp();
        
        /**
         * Sets the "curp" element
         */
        void setCurp(java.lang.String curp);
        
        /**
         * Sets (as xml) the "curp" element
         */
        void xsetCurp(org.apache.xmlbeans.XmlString curp);
        
        /**
         * Gets the "domicilio" element
         */
        java.lang.String getDomicilio();
        
        /**
         * Gets (as xml) the "domicilio" element
         */
        org.apache.xmlbeans.XmlString xgetDomicilio();
        
        /**
         * Sets the "domicilio" element
         */
        void setDomicilio(java.lang.String domicilio);
        
        /**
         * Sets (as xml) the "domicilio" element
         */
        void xsetDomicilio(org.apache.xmlbeans.XmlString domicilio);
        
        /**
         * Gets the "salario" element
         */
        double getSalario();
        
        /**
         * Gets (as xml) the "salario" element
         */
        org.apache.xmlbeans.XmlDouble xgetSalario();
        
        /**
         * Sets the "salario" element
         */
        void setSalario(double salario);
        
        /**
         * Sets (as xml) the "salario" element
         */
        void xsetSalario(org.apache.xmlbeans.XmlDouble salario);
        
        /**
         * Gets the "monto" element
         */
        double getMonto();
        
        /**
         * Gets (as xml) the "monto" element
         */
        org.apache.xmlbeans.XmlDouble xgetMonto();
        
        /**
         * Sets the "monto" element
         */
        void setMonto(double monto);
        
        /**
         * Sets (as xml) the "monto" element
         */
        void xsetMonto(org.apache.xmlbeans.XmlDouble monto);
        
        /**
         * Gets the "tazaDeInteres" element
         */
        double getTazaDeInteres();
        
        /**
         * Gets (as xml) the "tazaDeInteres" element
         */
        org.apache.xmlbeans.XmlDouble xgetTazaDeInteres();
        
        /**
         * Sets the "tazaDeInteres" element
         */
        void setTazaDeInteres(double tazaDeInteres);
        
        /**
         * Sets (as xml) the "tazaDeInteres" element
         */
        void xsetTazaDeInteres(org.apache.xmlbeans.XmlDouble tazaDeInteres);
        
        /**
         * Gets the "plazo" element
         */
        double getPlazo();
        
        /**
         * Gets (as xml) the "plazo" element
         */
        org.apache.xmlbeans.XmlDouble xgetPlazo();
        
        /**
         * Sets the "plazo" element
         */
        void setPlazo(double plazo);
        
        /**
         * Sets (as xml) the "plazo" element
         */
        void xsetPlazo(org.apache.xmlbeans.XmlDouble plazo);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.banco.itq.ClienteDocument.Cliente newInstance() {
              return (org.banco.itq.ClienteDocument.Cliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.banco.itq.ClienteDocument.Cliente newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.banco.itq.ClienteDocument.Cliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.banco.itq.ClienteDocument newInstance() {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.banco.itq.ClienteDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.banco.itq.ClienteDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.banco.itq.ClienteDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.banco.itq.ClienteDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.banco.itq.ClienteDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.banco.itq.ClienteDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.banco.itq.ClienteDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.banco.itq.ClienteDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.banco.itq.ClienteDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.banco.itq.ClienteDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.banco.itq.ClienteDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.banco.itq.ClienteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
