/*
 * An XML document type.
 * Localname: buro
 * Namespace: http//:itq.banco.org
 * Java type: org.banco.itq.BuroDocument
 *
 * Automatically generated - do not modify.
 */
package org.banco.itq;


/**
 * A document containing one buro(@http//:itq.banco.org) element.
 *
 * This is a complex type.
 */
public interface BuroDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuroDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2D098DA133E4BF83817F288C9D51B1B").resolveHandle("buroce6edoctype");
    
    /**
     * Gets the "buro" element
     */
    org.banco.itq.BuroDocument.Buro getBuro();
    
    /**
     * Sets the "buro" element
     */
    void setBuro(org.banco.itq.BuroDocument.Buro buro);
    
    /**
     * Appends and returns a new empty "buro" element
     */
    org.banco.itq.BuroDocument.Buro addNewBuro();
    
    /**
     * An XML buro(@http//:itq.banco.org).
     *
     * This is a complex type.
     */
    public interface Buro extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Buro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2D098DA133E4BF83817F288C9D51B1B").resolveHandle("buro82daelemtype");
        
        /**
         * Gets the "acredito" element
         */
        boolean getAcredito();
        
        /**
         * Gets (as xml) the "acredito" element
         */
        org.apache.xmlbeans.XmlBoolean xgetAcredito();
        
        /**
         * Sets the "acredito" element
         */
        void setAcredito(boolean acredito);
        
        /**
         * Sets (as xml) the "acredito" element
         */
        void xsetAcredito(org.apache.xmlbeans.XmlBoolean acredito);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.banco.itq.BuroDocument.Buro newInstance() {
              return (org.banco.itq.BuroDocument.Buro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.banco.itq.BuroDocument.Buro newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.banco.itq.BuroDocument.Buro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.banco.itq.BuroDocument newInstance() {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.banco.itq.BuroDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.banco.itq.BuroDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.banco.itq.BuroDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.banco.itq.BuroDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.banco.itq.BuroDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.banco.itq.BuroDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.banco.itq.BuroDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.banco.itq.BuroDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.banco.itq.BuroDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.banco.itq.BuroDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.banco.itq.BuroDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.banco.itq.BuroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
