/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidade.Produto;
import java.util.ArrayList;

/**
 *
 * @author 06005296
 */
public class ControladorProduto {
    private ArrayList<Produto> listaProdutos;
    

    public ControladorProduto() {
        listaProdutos = new ArrayList<Produto>(); 
        
        listaProdutos.add(new Produto(01, 100, "TV", "Tecnologia", 200,null));
        listaProdutos.add(new Produto(02, 100, "Cadeira", "Móveis", 3000, null));
        listaProdutos.add(new Produto(03, 100, "Notebook", "Tecnologia", 3500, null));
        listaProdutos.add(new Produto(04, 100, "Camiseta", "Roupas", 50, null));
        listaProdutos.add(new Produto(05, 100, "Livro", "Variedades", 25, null));
        listaProdutos.add(new Produto(06, 100, "Cobertor", "Cama Mesa e Banho", 150, null));
     
    }
    
    public Produto selecionarProdutoPorId(int id){
        for(Produto produto : listaProdutos) {
            if (produto.obterId() == id){
                return produto;
        
            }
         }
        return null;
    }
    
    
    public ArrayList<Integer> obterIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        for (Produto produto : listaProdutos) {
            ids.add(produto.obterId());
        }
        return ids;
    }
    
    
public void atualizarProduto(Produto produtoAtualizado) {
    for (Produto produto : listaProdutos) {
        if (produto.obterId() == produtoAtualizado.obterId()) {
            produto.definirQuantidadeDeEstoque(produtoAtualizado.obterQuantidadeEstoque());
            break; 
        }
    }
}
    
    
    

}
