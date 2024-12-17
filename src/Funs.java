public class Funs {
    private int count;
    private Meowable cat;

    public Funs(Meowable cat) {
        this.cat = cat;
        count = 0;
    }

    public void meowsCare() {
        this.cat.meow();
        this.count++;
    }

    public int getCount() {
        return count;
    }
}