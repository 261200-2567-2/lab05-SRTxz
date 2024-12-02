public class Lab05 {
    public static void main(String[] args) {
        Knights a = new Knights("Jo",1,100,100,20,50);
        Sharpshooters b = new Sharpshooters("Bun",1,100,100,30,60);
        Boots x = new Boots(1);
        Ring y = new Ring(1);
//        a.detail();
//        b.detail();
//        a.slaughter(b);
//        a.detail();
//        b.detail();
//        a.equipBoots(x);
        a.detail();
        b.detail();
        b.equipRing(y);
        b.equipBoots(x);
        b.detail();
        y.damageBoost(a);
        y.damageBoost(b);
        a.detail();
        b.detail();
    }
}