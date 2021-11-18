
package codigofontebd;

public class figurino {
     private String categoria;
     private int nserie;

    public figurino() {
        this.categoria = "";
        this.nserie = 0;
    }

    public figurino(String categoria, int nserie) {
        this.categoria = categoria;
        this.nserie = nserie;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNserie() {
        return nserie;
    }

    public void setNserie(int nserie) {
        this.nserie = nserie;
    }
    
    
     
     
}
