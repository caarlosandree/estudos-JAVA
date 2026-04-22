package models;

public class Cachorro extends Animal {
    private boolean abanaOrelhas;
    private boolean abanaRabo;
    private int alturaLatido;

    public boolean isAbanaOrelhas() {
        return abanaOrelhas;
    }

    public void setAbanaOrelhas(boolean abanaOrelhas) {
        this.abanaOrelhas = abanaOrelhas;
    }

    public boolean isAbanaRabo() {
        return abanaRabo;
    }

    public void setAbanaRabo(boolean abanaRabo) {
        this.abanaRabo = abanaRabo;
    }

    public int getAlturaLatido() {
        return alturaLatido;
    }

    public void setAlturaLatido(int alturaLatido) {
        this.alturaLatido = alturaLatido;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
}
