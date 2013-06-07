
package trabalhojogo;

/**
 * @author Thamires Mari
 */
public class Poder {
   
    private int valorp;
    private String descricaop;
    
    public Poder(){
        
    }
    
    public Poder(int valorp, String descricaop){
        this.valorp = valorp;
        this.descricaop = descricaop;
    }

    public int getValorp() {
        return valorp;
    }

    public void setValorp(int valorp) {
        this.valorp = valorp;
    }

    public String getDescricaop() {
        return descricaop;
    }

    public void setDescricaop(String descricaop) {
        this.descricaop = descricaop;
    }

    @Override
    public String toString() {
        return "Valor: " + this.getValorp() + "\n" +
               "Descricao: " + this.getDescricaop() + '\n';
    }
    
        
}
