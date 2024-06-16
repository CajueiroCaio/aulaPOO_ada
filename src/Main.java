import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro2 = new Cachorro("Caio", "Feliz", 5, 5, 25, "Dourado");
        Cachorro cachorro3 = new Cachorro("Caio", "Feliz", 5, 5, 25, "Dourado");
        Animal gato = new Gato("Lucifer", "Dourado", 5, 5, "Feliz");
        Passaro passaro = new Passaro("Lucy", "Dourado", 5, 5, "Feliz");
        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro2);
        System.out.println(cachorro2.getEstadoDeEspirito());

        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());

        petshop.tosar(cachorro3);
        System.out.println(cachorro3.getEstadoDeEspirito());
    }
}