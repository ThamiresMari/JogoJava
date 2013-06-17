
package trabalhoJogo;

/**
 * @author Thamires Mari
 */
public class Poder {
   
    private int valor;
    private String descricao;
    
    public Poder(){
        
    }
   

    @Override
    public String toString() {
        return "Valor: " + this.getValor() + "\n" +
               "Descricao: " + this.getDescricao() + '\n';
    }


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
        
}
