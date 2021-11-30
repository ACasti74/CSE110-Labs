public class Weapon {

    private String name;
    private int maxDamage;

    public Weapon() {
        name = "Pointy Stick";
        maxDamage = 1;
    }

    public Weapon(String str , int num) {
        this.name = str;
        this.maxDamage = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
}
