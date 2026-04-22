package models;

public class Gato extends Animal {

    private boolean arranhaMoveis;
    private boolean dormeMuito;
    private boolean docil;

    public boolean isArranhaMoveis() {
        return arranhaMoveis;
    }

    public void setArranhaMoveis(boolean arranhaMoveis) {
        this.arranhaMoveis = arranhaMoveis;
    }

    public boolean isDormeMuito() {
        return dormeMuito;
    }

    public void setDormeMuito(boolean dormeMuito) {
        this.dormeMuito = dormeMuito;
    }

    public boolean isDocil() {
        return docil;
    }

    public void setDocil(boolean docil) {
        this.docil = docil;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau miau");
    }
}
