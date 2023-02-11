package src.ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손입니다.");
        if (f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        if (f instanceof  Moveable)
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        if (f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다.");
    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {}
    public void attack(Unit u) {}
}

class Unit {
    int currentHP;
    int x;
    int y;
}
interface Fightable extends Moveable, Attackable { }
interface Moveable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }