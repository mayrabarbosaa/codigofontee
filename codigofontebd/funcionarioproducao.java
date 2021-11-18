
package codigofontebd;
public class funcionarioproducao {
    private String telefone;
    private String email;
    private String CPF;
    
    public funcionarioproducao(){
        this.telefone = "";
        this.email = "";
        this.CPF = "";
    }
    public funcionarioproducao(String telefone, String email, String CPF) {
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
