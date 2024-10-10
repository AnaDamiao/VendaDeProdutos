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
public class ItemVenda {
    private int numero, idProduto, quantidadeEstoque;
    private float preco, total;
    private Produto produto;
    
    public int obterNumero() {
        return numero;
    }
    
    public void alterarNumero(int numero) {
        this.numero = numero;
    }
    
    
    public int obterIdProduto() {
        return idProduto;
    }
    
    
    public int obterQuantidade() {
        return quantidadeEstoque;
    }
    
    public void alterarQuantidade(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    
    public float obterPreco() {
        return preco;
    }
    
    public void alterarPreco(float preco) {
        this.preco = preco;
    }
    
    
    public float obterTotal() {
        return total;
    }
    
    
    public Produto obterProduto() {
        return produto;
    }
    
    public void alterarProduto(Produto produto) {
        this.produto = produto;
    }
}
