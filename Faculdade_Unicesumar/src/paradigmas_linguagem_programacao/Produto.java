package paradigmas_linguagem_programacao;

public class Produto {
	
    private Long id;
    private String descr;
    private Integer qtd;
    public Double valor;
   
    public Produto(Long id, String descr, Integer qtd, Double valor) {
        this.id = id;
        this.setDescr(descr);
        this.setQtd(qtd);
        this.setValor(valor);
    }
    public void setId(Long id) {
	this.id = id;
    }   	    
    public Long getId() {
	return id;
    }
    public void setDescr(String descr) {
	this.descr = descr;
    }		
    public String getDescr() {
	return descr;
    }
    public void setQtd(Integer qtd) {
	this.qtd = qtd;
    }
    public Integer getQtd() {
	return qtd;
    }
    public void setValor(Double valor) {
	this.valor = valor;
    }
    public Double getValor() {
	return valor;
    }  
}
