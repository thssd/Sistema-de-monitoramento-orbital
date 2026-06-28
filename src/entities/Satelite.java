package entities;

public class Satelite {

    private String nome;
    private double altitudeKm;
    private boolean ativo;

    public Satelite(String nome, double altitudeKm, boolean ativo) {
        this.nome = nome;
        this.altitudeKm = altitudeKm;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltitudeKm() {
        return altitudeKm;
    }

    public void setAltitudeKm(double altitudeKm) {
        this.altitudeKm = altitudeKm;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Satelite: " + nome +
               " | Altitude: " + altitudeKm + " km" +
               " | Ativo: " + ativo;
    }
}
