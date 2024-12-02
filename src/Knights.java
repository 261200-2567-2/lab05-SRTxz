public class Knights implements Knight {
    String name;
    int level;
    double hp,mana,runSpeed,damage;
    Boots myBoots;
    Ring myRing;
    Boolean hasBoots = false;
    Boolean hasRing = false;
    public void setLevel(int lv){
        this.level = lv;
    }
    public void equipBoots(Boots b) {
        this.myBoots = b;
        this.runSpeed += 10;
        this.hasBoots = true;
    }
    public void equipRing(Ring r) {
        this.myRing = r;
        this.mana += 20;
        this.damage += 10;
        this.hasRing = true;
    }
    public void slaughter(Sharpshooters enemy) {
        enemy.hp -= this.damage;
    }
    public void detail(){
        System.out.println(this.name);
        System.out.println("[ Level: " + level + ", HP: " + hp + ", Mana: " + mana +", runSpeed: "+runSpeed+", Damage: " +damage+ ", hasBoots: "+hasBoots+", hasRing: "+hasRing+" ]");
    }
    public Knights(String name,int lv, double hp, double mana, double runSpeed,double damage) {
        this.name = name;
        this.level = lv;
        this.hp = hp;
        this.mana = mana;
        this.runSpeed = runSpeed;
        this.damage = damage;
    }
}
