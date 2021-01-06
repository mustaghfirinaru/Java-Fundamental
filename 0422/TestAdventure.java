
public class TestAdventure {
    public static void tobeFight(ICanFight f){
        f.doFight();
    }
    public static void tobeSwim(ICanSwim s){
        s.doSwim();
    }
    public static void tobeFly(ICanFly f){
        f.doFly();
    }
    public static void tobeChara(Chara c){
        c.doFight();
    }
    public static void main(String[] args) {
        Hero h=new Hero();
        tobeFight(h);
        tobeSwim(h);
        tobeFly(h);
        Chara c=new Hero();
        tobeChara(c); 
    }
}