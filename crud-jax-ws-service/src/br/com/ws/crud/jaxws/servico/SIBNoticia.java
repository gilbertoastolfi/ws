package br.com.ws.crud.jaxws.servico;
 
import java.sql.SQLException;
import java.util.ArrayList;
 
import javax.jws.WebService;
 
import br.com.ws.crud.jaxws.dao.NoticiaDao;
import br.com.ws.crud.jaxws.modelo.Noticia;
 
@WebService(endpointInterface = "br.com.ws.crud.jaxws.servico.SEINoticia")
public class SIBNoticia implements SEINoticia{
 
    public boolean criar(Noticia noticia) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.criar(noticia);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
 
    public boolean alterar(Noticia noticia) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.alterar(noticia);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
 
    public boolean deletar(Noticia noticia) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.deletar(noticia);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
 
    public Noticia ler(int id) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.ler(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
 
    public ArrayList<Noticia> listar() {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.listar();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}