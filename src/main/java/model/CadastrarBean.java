/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author farma
 */
import java.sql.Date;
public class CadastrarBean {
    private int id_movimentacao;
    private String descricao_movimentacao;
    private String tipo_movimentacao;
    private Double valor_movimentacao;
    private  Date data_movimentacao;

    public CadastrarBean() {
    }

    public CadastrarBean(int id_movimentacao, String descricao_movimentacao, String tipo_movimentacao, Double valor_movimentacao, Date data_movimentacao) {
        this.id_movimentacao = id_movimentacao;
        this.descricao_movimentacao = descricao_movimentacao;
        this.tipo_movimentacao = tipo_movimentacao;
        this.valor_movimentacao = valor_movimentacao;
        this.data_movimentacao = data_movimentacao;
    }

    public int getId_movimentacao() {
        return id_movimentacao;
    }

    public void setId_movimentacao(int id_movimentacao) {
        this.id_movimentacao = id_movimentacao;
    }

    public String getDescricao_movimentacao() {
        return descricao_movimentacao;
    }

    public void setDescricao_movimentacao(String descricao_movimentacao) {
        this.descricao_movimentacao = descricao_movimentacao;
    }

    public String getTipo_movimentacao() {
        return tipo_movimentacao;
    }

    public void setTipo_movimentacao(String tipo_movimentacao) {
        this.tipo_movimentacao = tipo_movimentacao;
    }

    public Double getValor_movimentacao() {
        return valor_movimentacao;
    }

    public void setValor_movimentacao(Double valor_movimentacao) {
        this.valor_movimentacao = valor_movimentacao;
    }

    public Date getData_movimentacao() {
        return data_movimentacao;
    }

    public void setData_movimentacao(Date data_movimentacao) {
        this.data_movimentacao = data_movimentacao;
    }
    
    
}
