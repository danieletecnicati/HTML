package paradigmas_linguagem_programacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Long id;
    private String nomeCliente;
    private List<Produto> produtos;

    public Venda(Long id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<>();
    }
    public void setId(Long id) {
        this.id = id;
    }    
    public Long getId() {
        return id;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }   
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }   
    public List<Produto> getProdutos() {
        return produtos;
    }
    public Double valorTotal() {
        double total = 0.0;
       for (Produto produto : produtos) {
            total += produto.valor;
        }
        return total;
    }

}
