
package codigofontebd;
public class salario {
    private double lucroTotal;
    private double suaPorcentagem;

    public salario() {
        this.lucroTotal = 0.0;
        this.suaPorcentagem = 0.0;
    }

    public salario(double lucroTotal, double suaPorcentagem) {
        this.lucroTotal = lucroTotal;
        this.suaPorcentagem = suaPorcentagem;
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    public void setLucroTotal(double lucroTotal) {
        this.lucroTotal = lucroTotal;
        System.out.println("Lucro total: " + lucroTotal);
    }

    public double getSuaPorcentagem() {
        return suaPorcentagem;
    }

    public void setSuaPorcentagem(double suaPorcentagem) {
        this.suaPorcentagem = suaPorcentagem;
        System.out.println("Sua porcentagem: " + suaPorcentagem); 
    }
    
    
    
}
