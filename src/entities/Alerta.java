package entities;

public class Alerta {

    private String descricao;
    private String nivel;
    private String local;
    private boolean enviado;

    public Alerta(String descricao, String nivel, String local) {
        this.descricao = descricao;
        this.nivel = nivel;
        this.local = local;
        this.enviado = false;
    }

    public void enviarAlerta() {
        this.enviado = true;
        System.out.println("*** ALERTA ENVIADO ***");
        System.out.println("Local: " + local);
        System.out.println("Nivel: " + nivel);
        System.out.println("Descricao: " + descricao);
        System.out.println("**********************");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString() {
        return "Alerta: " +
                " | descricao='" + descricao +
                " | nivel='" + nivel +
                " | local='" + local +
                " | enviado=" + enviado;
    }
}
