package br.com.ws.crud.jaxws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.ws.crud.jaxws.dao.utils.Conexao;
import br.com.ws.crud.jaxws.modelo.Noticia;

public class NoticiaDao {
	
	public boolean criar(Noticia noticia) throws SQLException {

		String sql = "insert into noticia (id, titulo, texto, data_publicacao) values "
				+ "((select nextval('noticia_id_seq')), ?, ?, ? );";

		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		try {
			
			ps.setString(1, noticia.getTitulo());
			ps.setString(2, noticia.getTexto());
			ps.setDate(3, new Date(noticia.getData().getTime()));
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			ps.close();
		}

		return false;
	}
	
	public boolean alterar(Noticia noticia) throws SQLException {

		String sql = "update noticia set titulo = ? , texto = ? , data_publicacao = ? "
					  + "where id = ? ;";
		
		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		
		try {			
			ps.setString(1, noticia.getTitulo());
			ps.setString(2, noticia.getTexto());
			ps.setDate(3, new Date(noticia.getData().getTime()));
			ps.setInt(4, noticia.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			ps.close();
		}

		return false;
	}
	
	public boolean deletar(Noticia noticia) throws SQLException {

		String sql = "delete from noticia where id = ? ;";
		
		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		
		try {			
			ps.setInt(1, noticia.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			ps.close();
		}
		return false;
	}
	
	public Noticia ler(int id) throws SQLException {

		String sql = "select * from noticia where id = ? ;";

		Noticia not = null;

		Connection con = Conexao.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		try {							
			if(rs.next()){
				not = new Noticia();
				not.setId(rs.getInt("id"));
				not.setTitulo(rs.getString("titulo"));
				not.setTexto(rs.getString("texto"));
				not.setData(new java.util.Date(rs.getDate("data_publicacao").getTime()));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			rs.close();
			ps.close();	
		}
		return not;
	}
	
	public ArrayList<Noticia> listar() throws SQLException {

		String sql = "select * from noticia;";
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();

		Connection con = Conexao.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);		
		try {			
			
			while (rs.next()) {
				Noticia not = new Noticia();
				not.setId(rs.getInt("id"));
				not.setTitulo(rs.getString("titulo"));
				not.setTexto(rs.getString("texto"));
				not.setData(new java.util.Date(rs.getDate("data_publicacao").getTime()));
				noticias.add(not);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			rs.close();
			st.close();
		}
		return noticias;
	}

}
