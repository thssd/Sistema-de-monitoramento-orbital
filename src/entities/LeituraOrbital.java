package entities;

public class LeituraOrbital {

    private String nomeSatelite;
    private String nomeArea;
    private double nivelAgua;
    private double indiceVegetacao;
    private double temperaturaCelsius;

    public LeituraOrbital(String nomeSatelite, String nomeArea, double nivelAgua,
                          double indiceVegetacao, double temperaturaEmCelsius) {
        this.nomeSatelite = nomeSatelite;
        this.nomeArea = nomeArea;
        this.nivelAgua = nivelAgua;
        this.indiceVegetacao = indiceVegetacao;
        this.temperaturaCelsius = temperaturaEmCelsius;
    }

    public String verificarRiscoEnchente() {
        if (nivelAgua >= 80) {
            return "RISCO ALTO de enchente! Nivel de agua: " + nivelAgua + "%";
        } else if (nivelAgua >= 50) {
            return "RISCO MEDIO de enchente. Nivel de agua: " + nivelAgua + "%";
        } else {
            return "Sem risco de enchente. Nivel de agua: " + nivelAgua + "%";
        }
    }

    public String verificarDesmatamento() {
        if (indiceVegetacao < 0.2) {
            return "ALERTA: Possivel desmatamento detectado! Vegetacao muito baixa: " + indiceVegetacao;
        } else if (indiceVegetacao < 0.5) {
            return "ATENCAO: Vegetacao reduzida. Indice: " + indiceVegetacao;
        } else {
            return "Vegetacao normal. Indice: " + indiceVegetacao;
        }
    }

    public String getNomeSatelite() {
        return nomeSatelite;
    }

    public void setNomeSatelite(String nomeSatelite) {
        this.nomeSatelite = nomeSatelite;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public double getIndiceVegetacao() {
        return indiceVegetacao;
    }

    public void setIndiceVegetacao(double indiceVegetacao) {
        this.indiceVegetacao = indiceVegetacao;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    @Override
    public String toString() {
        return "Leitura Orbital: " +
                " | nomeSatelite='" + nomeSatelite +
                " | nomeArea='" + nomeArea +
                " | nivelAgua=" + nivelAgua + "%" +
                " | indiceVegetacao=" + indiceVegetacao +
                " | temperaturaEmCelsius=" + temperaturaCelsius + "C";
    }
}
