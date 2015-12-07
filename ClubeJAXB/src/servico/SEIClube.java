package servico;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import modelo.Clube;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface SEIClube {
	
	@WebMethod
	public Clube getClube(String nome);
	
	@WebMethod
	public List<Clube> getClubes();
}
