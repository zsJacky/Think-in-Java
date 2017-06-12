// Eighteenth.java of chapter9 exercise


interface Cycle{
    void ride();
}

class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Unicycle");
    }
}
class UniFactory {
    public Unicycle getUnicycle(){
        return new Unicycle();
    }
}
class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Bicycle");
    }
}
class BiFactory {
    public Bicycle getBicy(){
        return new Bicycle();
    }
}
class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle");
    }
}
class TriFactory {
    public Tricycle getTri(){
        return new Tricycle();
    }
}

public class Eighteenth {
	public static void main(String[] args) {
        new UniFactory().getUnicycle();
        new BiFactory().getBicy();
        new TriFactory().getTri();
	}
}
