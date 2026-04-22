import models.*;

void main() {

    Cachorro golden = new Cachorro();
    golden.emitirSom();
    golden.setNome("Golden");
    golden.setAlturaLatido(7);
    golden.setAbanaOrelhas(true);
    golden.setAbanaRabo(true);

    IO.println("\n");
    IO.println("-=-=- Cachorro -=-=-");
    //Imprimindo os atributos do cachorro
    System.out.println("Nome: " + golden.getNome());
    System.out.println("Altura do latido: " + golden.getAlturaLatido());
    System.out.println("Abana orelhas: " + golden.isAbanaOrelhas());
    System.out.println("Abana rabo: " + golden.isAbanaRabo());
    System.out.println(golden);

    IO.println("\n");
    IO.println("-=-=- Gato -=-=-");
    Gato siames = new Gato();
    siames.emitirSom();
    siames.setNome("Siames");
    siames.setArranhaMoveis(true);
    siames.setDormeMuito(false);
    siames.setDocil(true);

    //Imprimindo os atributos do gato
    System.out.println(siames);
    System.out.println("Nome: " + siames.getNome());
    System.out.println("Arranha moveis: " + siames.isArranhaMoveis());
    System.out.println("Dorme muito: " + siames.isDormeMuito());
    System.out.println("Docil: " + siames.isDocil());

}
