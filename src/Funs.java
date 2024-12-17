public class Funs {
    private int count;

    public Funs() {
        count = 0;
    }

    public void meowsCare(Meowable meowable) {
        for (int i = 0; i < 5; i++) {
            meowable.meow();
            this.count++;
        }
    }

    public int getCount() {
        return count;
    }
}