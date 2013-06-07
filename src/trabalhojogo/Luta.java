package trabalhojogo;
/**
 * @author Thamires Mari
 */
public class Luta {
    
    private String vencedor;
    private int resultado;
    
    public Luta(){    
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

    @Override
    public String toString() {
        return "Vencedor: "  + this.getVencedor() + "\n" +
               "Resultado: " + this.getResultado() + '\n';
    }
    
    public int EscolherPersonagem() {
    
}
    
}
