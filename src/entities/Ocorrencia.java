package entities;

public class Ocorrencia {

    private String tipo;
    private String gravidade;
    private String areaAfetada;
    private boolean resolvida;

    public Ocorrencia(String tipo, String gravidade, String areaAfetada) {
        this.tipo = tipo;
        this.gravidade = gravidade;
        this.areaAfetada = areaAfetada;
        this.resolvida = false;
    }

    public boolean urgencia() {
        if (gravidade.equalsIgnoreCase("alta")) {
            return true;
        } else {
            return false;
        }
    }

    public void resolver() {
        this.resolvida = true;
        System.out.println("Ocorrencia de " + tipo + " marcada como RESOLVIDA.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getAreaAfetada() {
        return areaAfetada;
    }

    public void setAreaAfetada(String areaAfetada) {
        this.areaAfetada = areaAfetada;
    }

    public boolean isResolvida() {
        return resolvida;
    }

    public void setResolvida(boolean resolvida) {
        this.resolvida = resolvida;
    }

    @Override
    public String toString() {
        return "Ocorrencia: " + tipo +
               " | Gravidade: " + gravidade +
               " | Area: " + areaAfetada +
               " | Urgente: " + urgencia() +
               " | Resolvida: " + resolvida;
    }
}
