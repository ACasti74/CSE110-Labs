public class Monster {

    private String name;
    private int healthScore;
    private Weapon weapon;

    public Monster(String str, int num, Weapon weapon) {
        this.name = str;
        this.healthScore = num;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthScore() {
        return healthScore;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getWeaponName() {
        return name;
    }

    public int attack(Monster monster) {
        return (int) (Math.random() * weapon.getMaxDamage());
    }
}
