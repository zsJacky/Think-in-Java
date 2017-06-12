// Nineteenth.java of chapter9 exercise

interface Play{
    void game();
}
interface PlayFactory{
    void play(Play play);
}
class PlayYingBi implements Play {
    @Override
    public void game() {
        System.out.println("��Ӳ��");
    }
}
class PlayShaiZi implements Play{
    @Override
    public void game() {
        System.out.println("������");
    }
}
class gameFactory implements PlayFactory{
    @Override
    public void play(Play p) {
        p.game();
    }
}

public class Nineteenth {
	public static void main(String[] args){
        PlayYingBi yingBi = new PlayYingBi();
        PlayShaiZi shaiZi = new PlayShaiZi();
        gameFactory factory = new gameFactory();
        factory.play(yingBi);
        factory.play(shaiZi);
    }
}
