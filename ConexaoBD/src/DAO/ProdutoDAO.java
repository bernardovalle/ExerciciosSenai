package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.ConexaoMySQL;
import Model.Produto;

public class ProdutoDAO {

	public void creat(Produto produto) {
		Connection conexao = ConexaoMySQL.iniciarConexao();
		PreparedStatement stmt = null;
		try {
			// construir o comando SLQ
			stmt = conexao.prepareStatement("INSERT INTO produto (nome, preco, quantidade_estoque) VALUES (?, ?, ?)");
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.setInt(3, produto.getQuantidadeEstoque());
			stmt.executeUpdate();
		} catch (SQLException erro) {
			erro.printStackTrace();
		} finally {
			ConexaoMySQL.encerrarConexao(conexao, stmt);
		}	
	}

}
