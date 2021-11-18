
package codigofontebd;
public class cronogramadetrabalho {
    private String data;
    private String hora;

    public cronogramadetrabalho() {
        this.data = "";
        this.hora = "";
    }

    public cronogramadetrabalho(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        System.out.println("Dias de trabalho: " + data);
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
        System.out.println("Horários: " + hora);
    }
    
    
    
}
