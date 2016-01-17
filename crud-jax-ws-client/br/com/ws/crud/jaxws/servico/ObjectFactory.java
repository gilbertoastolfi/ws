
package br.com.ws.crud.jaxws.servico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ws.crud.jaxws.servico package. 
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

    private final static QName _Ler_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "ler");
    private final static QName _ListarResponse_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "listarResponse");
    private final static QName _Alterar_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "alterar");
    private final static QName _CriarResponse_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "criarResponse");
    private final static QName _DeletarResponse_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "deletarResponse");
    private final static QName _Deletar_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "deletar");
    private final static QName _Criar_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "criar");
    private final static QName _LerResponse_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "lerResponse");
    private final static QName _AlterarResponse_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "alterarResponse");
    private final static QName _Listar_QNAME = new QName("http://servico.jaxws.crud.ws.com.br/", "listar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ws.crud.jaxws.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Deletar }
     * 
     */
    public Deletar createDeletar() {
        return new Deletar();
    }

    /**
     * Create an instance of {@link Criar }
     * 
     */
    public Criar createCriar() {
        return new Criar();
    }

    /**
     * Create an instance of {@link LerResponse }
     * 
     */
    public LerResponse createLerResponse() {
        return new LerResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link AlterarResponse }
     * 
     */
    public AlterarResponse createAlterarResponse() {
        return new AlterarResponse();
    }

    /**
     * Create an instance of {@link Ler }
     * 
     */
    public Ler createLer() {
        return new Ler();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Alterar }
     * 
     */
    public Alterar createAlterar() {
        return new Alterar();
    }

    /**
     * Create an instance of {@link DeletarResponse }
     * 
     */
    public DeletarResponse createDeletarResponse() {
        return new DeletarResponse();
    }

    /**
     * Create an instance of {@link CriarResponse }
     * 
     */
    public CriarResponse createCriarResponse() {
        return new CriarResponse();
    }

    /**
     * Create an instance of {@link Noticia }
     * 
     */
    public Noticia createNoticia() {
        return new Noticia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "ler")
    public JAXBElement<Ler> createLer(Ler value) {
        return new JAXBElement<Ler>(_Ler_QNAME, Ler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alterar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "alterar")
    public JAXBElement<Alterar> createAlterar(Alterar value) {
        return new JAXBElement<Alterar>(_Alterar_QNAME, Alterar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "criarResponse")
    public JAXBElement<CriarResponse> createCriarResponse(CriarResponse value) {
        return new JAXBElement<CriarResponse>(_CriarResponse_QNAME, CriarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "deletarResponse")
    public JAXBElement<DeletarResponse> createDeletarResponse(DeletarResponse value) {
        return new JAXBElement<DeletarResponse>(_DeletarResponse_QNAME, DeletarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "deletar")
    public JAXBElement<Deletar> createDeletar(Deletar value) {
        return new JAXBElement<Deletar>(_Deletar_QNAME, Deletar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "criar")
    public JAXBElement<Criar> createCriar(Criar value) {
        return new JAXBElement<Criar>(_Criar_QNAME, Criar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "lerResponse")
    public JAXBElement<LerResponse> createLerResponse(LerResponse value) {
        return new JAXBElement<LerResponse>(_LerResponse_QNAME, LerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "alterarResponse")
    public JAXBElement<AlterarResponse> createAlterarResponse(AlterarResponse value) {
        return new JAXBElement<AlterarResponse>(_AlterarResponse_QNAME, AlterarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico.jaxws.crud.ws.com.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

}
