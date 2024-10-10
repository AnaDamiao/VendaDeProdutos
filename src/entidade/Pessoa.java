/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author 06005296
 */
public class Pessoa {
    private int id;
    private String nome;
    
    public int obterId() {    
        return id;
    }
    
    public void alterarId(int id) {
        this.id = id;
    }
    
    public String obterNome() {    
        return nome;
    }
    
    public void alterarNome(String nome) {
        this.nome = nome;
    }
}
