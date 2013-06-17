package trabalhoJogo;

import java.util.ArrayList;

/**
 * @author Thamires Mari
 */
public class Luta {
    
    private String vencedor;
    private int resultado;
    private Combate combate;
    private ArrayList<Personagem> personagens;
    private ArrayList<Personagem> personagensEscolhidos;
    private int quantidadeDePersonagensEscolhidos;
    
    public Luta(){
    	personagens = new ArrayList<Personagem>();
    	personagensEscolhidos = new ArrayList<Personagem>();
    	Heroi hercules = new Heroi("Hercules", 10, 5, null, null);
    	personagens.add(hercules);
    	combate = new Combate();
    }
    
    public Luta(String vencedor, int resultado){
        this.vencedor = vencedor;
        this.resultado = resultado;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void escolherPersonagem(){
    	System.out.print("Escolha o personagem: ");
    	for(int i = 0 ; i < quantidadeDePersonagensEscolhidos; i++){
    		System.out.println("\nPersonagem: " + i + " - " + personagens.get(i));
    		
    	}
   
    } 

    @Override
    public String toString() {
        return "Vencedor: "  + this.getVencedor() + "\n" +
               "Resultado: " + this.getResultado() + '\n';
    }

	public Combate getCombate() {
		return combate;
	}

	public void setCombate(Combate combate) {
		this.combate = combate;
	}

	public void definirQuantidadeDePersonagens() {
		System.out.println("Escolha a quantidade de personagens para o combate: ");
	}

	public int getQuantidadeDePersonagensEscolhidos() {
		return quantidadeDePersonagensEscolhidos;
	}

	public void setQuantidadeDePersonagensEscolhidos(
			int quantidadeDePersonagensEscolhidos) {
		this.quantidadeDePersonagensEscolhidos = quantidadeDePersonagensEscolhidos;
	}
   
    
}
