package entities;

public class Area {

    private String nome;
    private String estado;
    private String bioma;
    private double tamanhoHectares;

    public Area(String nome, String estado, String bioma, double tamanhoHectares) {
        this.nome = nome;
        this.estado = estado;
        this.bioma = bioma;
        this.tamanhoHectares = tamanhoHectares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public double getTamanhoHectares() {
        return tamanhoHectares;
    }

    public void setTamanhoHectares(double tamanhoHectares) {
        this.tamanhoHectares = tamanhoHectares;
    }

    @Override
    public String toString() {
        return "Area: " +
                " | nome='" + nome +
                " | estado='" + estado +
                " | bioma='" + bioma +
                " | tamanhoHectares=" + tamanhoHectares + "hectáres";
    }
}
