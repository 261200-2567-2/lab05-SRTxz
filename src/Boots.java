public class Boots implements boots_ {
    int level;
    public void setLevel(int lv){
        this.level = lv;
    }
    public void speedBoost(Knights x){
        if(x.hasBoots){
            x.runSpeed +=10;
        }
    }
    public void speedBoost(Sharpshooters y){
        if(y.hasBoots){
            y.runSpeed +=10;
        }
    }
    public Boots(int lv){
        this.level = lv;
    }
}
