/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historico;

/**
 *
 * @author farma
 */
public class Transacoes {
    private int ID;
    private String produto;
    private Double valor;

    public Transacoes() {
    }

    public Transacoes(int ID, String produto, Double valor) {
        this.ID = ID;
        this.produto = produto;
        this.valor = valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
