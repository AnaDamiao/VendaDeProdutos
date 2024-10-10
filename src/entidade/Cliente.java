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
public class Cliente extends Pessoa{
    private String cpf;
    
    public String obterCpf() {
        return cpf;
    }
    
    public void alterarCpf(String cpf) {
        this.cpf = cpf;
    }
}
