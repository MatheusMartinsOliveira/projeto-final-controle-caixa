/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author farma
 */
public class CadastrarDAO {
    public void cadastrar(CadastrarBean cadastro){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement ("insert into movimentacoes (descricao_movimentacao, tipo_movimentacao, valor_movimentacao, data_movimentacao) values (?, ?, ?, ?)");
            stmt.setString(1, cadastro.getDescricao_movimentacao());
            stmt.setString(2, cadastro.getTipo_movimentacao());
            stmt.setDouble(3, cadastro.getValor_movimentacao());
            stmt.setDate(4, cadastro.getData_movimentacao());
            
            stmt.executeUpdate();
            
        
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public java.util.List<CadastrarBean> listar() {
    java.util.List<CadastrarBean> lista = new java.util.ArrayList<>();

    String sql = "select * from movimentacoes order by id_movimentacao";

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            CadastrarBean cadastro = new CadastrarBean();

            cadastro.setId_movimentacao(rs.getInt("id_movimentacao"));
            cadastro.setDescricao_movimentacao(rs.getString("descricao_movimentacao"));
            cadastro.setTipo_movimentacao(rs.getString("tipo_movimentacao"));
            cadastro.setValor_movimentacao(rs.getDouble("valor_movimentacao"));
            cadastro.setData_movimentacao(rs.getDate("data_movimentacao"));

            lista.add(cadastro);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lista;
    }
    public void atualizar(CadastrarBean atualizar){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement ("update movimentacoes set descricao_movimentacao = ?, tipo_movimentacao = ?, valor_movimentacao = ?, data_movimentacao = ? where id_movimentacao = ?");
            stmt.setString(1, atualizar.getDescricao_movimentacao());
            stmt.setString(2, atualizar.getTipo_movimentacao());
            stmt.setDouble(3, atualizar.getValor_movimentacao());
            stmt.setDate(4, atualizar.getData_movimentacao());
            stmt.setInt(5, atualizar.getId_movimentacao());
            stmt.executeUpdate();
        } catch (SQLException e){
        e.printStackTrace();
    }
}
   public void excluir(int id){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("delete from movimentacoes where id_movimentacao = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

