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
public class Produto {
    private int id, quantidadeEstoque;
    private String nome, unidade;
    private float preco;
    private ItemVenda itemVenda;

    public Produto(int id, int quantidadeEstoque, String nome, String unidade, int preco, ItemVenda itemVenda) {
        this.id = id;
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.itemVenda = itemVenda;
    }
    
    public void definirQuantidadeDeEstoque(int novaQuantidade) {
        this.quantidadeEstoque = novaQuantidade;
    }
    
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
    
    
    public String obterUnidade() {
        return unidade;
    }
    
    public void alterarUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    
    public int obterQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    public void alterarQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    
    public float obterPreco() {
        return preco;
    }
    
    public void alterarPreco(float preco) {
        this.preco = preco;
    }
}