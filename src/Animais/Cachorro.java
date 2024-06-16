package Animais;

public class Cachorro extends Animal {
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    public Cachorro(String nome, String estadoDeEspirito, int altura, double peso, int tamanhoDoRabo, String cor) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "Bravo";
                break;
            case "nada":
                this.estadoDeEspirito = "Neutro";
            default:
                this.estadoDeEspirito = "Neutro";
                break;
        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }
}
