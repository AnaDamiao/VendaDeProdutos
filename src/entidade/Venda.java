/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author 06005296
 */
public class Venda {
    private int id, idCliente;
    private Date data;
    private Time hora;
    private Cliente cliente;
    private ItemVenda itemVenda;
    
    public int obterId() {
        return id;
    }
    
    public void alterarId(int id) {
        this.id = id;
    }
    
    
    public Time obterHora() {
        return hora;
    }
    
    public void alterarHora(Time hora) {
        this.hora = hora;
    }
    
    
    public Date obterData() {
        return data;
    }
    
    public void alterarData(Date data) {
        this.data = data;
    }
    
    
    public int obteridCliente() {
        return idCliente;
    }
    
    
    public Cliente obterCliente() {
        return cliente;
    }
    
    public void alterarCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public void incluirItem(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }
    
}