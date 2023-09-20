
public class PokemonGame {
    public static void main(String[] args) {
        NoFly noFly = new NoFly();
        Pikachu pikachu = new Pikachu(noFly); // Association, Has-a (Aggregation)
        pikachu.performFly();
    }
}