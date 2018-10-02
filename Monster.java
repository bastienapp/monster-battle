public class Monster {

    private final static int DEFAULT_ATTACK = 30;
    private final static int DEFAULT_LIFE = 400;

    private String name;
    private int attack;
    private int life;

    public Monster(String name, int attack, int life) {
        this.name = name;
        this.attack = attack;
        this.life = life;
    }

    public Monster(String name) {
        this.name = name;
        this.attack = DEFAULT_ATTACK;
        this.life = DEFAULT_LIFE;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {

        int diff = (int)(Math.random() * 10);
        if (Math.random() > 0.5) {
            diff = -diff;
        }
        return attack + diff;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void takeHit(int hit) {

        this.life -= hit;
        if (this.life < 0) {
            this.life = 0;
        }
        this.life = (this.life - hit) <= 0
                ? 0 // si vrai
                : this.life - hit; // si faux
        System.out.println(this.name + " has " + String.valueOf(this.life) + " points remaining.");
    }

    public boolean isKO() {
        if (this.life <= 0) {
            System.out.println(this.name + " is KO!");
        }
        return this.life <= 0;
    }

    public static void throwPokeball() {
        System.out.println("Sasha a lancé sa pokéball !");
    }
}
