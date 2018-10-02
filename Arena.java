public class Arena {

    public static void main(String[] args) {
        Monster bulbizarre = new Monster("Bulbi", 30, 500);

        Monster pikachu = new Monster("Pikapi", 20, 250);

        Monster.throwPokeball();

        while (!bulbizarre.isKO() && !pikachu.isKO()) {
            bulbizarre.takeHit(pikachu.getAttack());
            pikachu.takeHit(bulbizarre.getAttack());
        }
    }
}
