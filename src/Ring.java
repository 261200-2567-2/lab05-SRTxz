public class Ring implements ring_{
    int level;
    public void setLevel(int lv){
        this.level = lv;
    }
    public void damageBoost(Knights x) {
        if(x.hasRing) {
            x.damage += 10;
        }
    }
    public void damageBoost(Sharpshooters y) {
        if(y.hasRing) {
            y.damage += 10;
        }
    }
    public void manaBoost(Knights x) {
        if(x.hasRing) {
            x.mana += 10;
        }
    }
    public void manaBoost(Sharpshooters y) {
        if(y.hasRing) {
            y.mana += 10;
        }
    }
    public Ring(int lv) {
        this.level = lv;
    }
}
