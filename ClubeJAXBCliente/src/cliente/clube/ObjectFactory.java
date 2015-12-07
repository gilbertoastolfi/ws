
package cliente.clube;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente.clube package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetClubeResponse_QNAME = new QName("http://servico/", "getClubeResponse");
    private final static QName _GetClube_QNAME = new QName("http://servico/", "getClube");
    private final static QName _GetClubesResponse_QNAME = new QName("http://servico/", "getClubesResponse");
    private final static QName _GetClubes_QNAME = new QName("http://servico/", "getClubes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente.clube
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClubesResponse }
     * 
     */
    public GetClubesResponse createGetClubesResponse() {
        return new GetClubesResponse();
    }

    /**
     * Create an instance of {@link GetClubes }
     * 
     */
    public GetClubes createGetClubes() {
        return new GetClubes();
    }

    /**
     * Create an instance of {@link GetClube }
     * 
     */
    public GetClube createGetClube() {
        return new GetClube();
    }

    /**
     * Create an instance of {@link GetClubeResponse }
     * 
     */
    public GetClubeResponse createGetClubeResponse() {
        return new GetClubeResponse();
    }

    /**
     * Create an instance of {@link Clube }
     * 
     */
    public Clube createClube() {
        return new Clube();
    }

    /**
     * Create an instance of {@link Jogador }
     * 
     */
    public Jogador createJogador() {
        return new Jogador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClubeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "getClubeResponse")
    public JAXBElement<GetClubeResponse> createGetClubeResponse(GetClubeResponse value) {
        return new JAXBElement<GetClubeResponse>(_GetClubeResponse_QNAME, GetClubeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClube }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "getClube")
    public JAXBElement<GetClube> createGetClube(GetClube value) {
        return new JAXBElement<GetClube>(_GetClube_QNAME, GetClube.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClubesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "getClubesResponse")
    public JAXBElement<GetClubesResponse> createGetClubesResponse(GetClubesResponse value) {
        return new JAXBElement<GetClubesResponse>(_GetClubesResponse_QNAME, GetClubesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClubes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "getClubes")
    public JAXBElement<GetClubes> createGetClubes(GetClubes value) {
        return new JAXBElement<GetClubes>(_GetClubes_QNAME, GetClubes.class, null, value);
    }

}
