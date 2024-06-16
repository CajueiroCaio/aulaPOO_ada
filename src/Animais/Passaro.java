package Animais;

public class Passaro extends Animal {

    static int numeroDePassaro;

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }

    public static int getNumeroDePassaro() {
        return numeroDePassaro;
    }

    public static void setNumeroDePassaro(int numeroDePassaro) {
        Passaro.numeroDePassaro = numeroDePassaro;
    }

    @Override
    public void soar() {
        System.out.println("QUACK");
    }
}
