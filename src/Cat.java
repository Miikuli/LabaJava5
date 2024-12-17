public class Cat implements Meowable {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(this.name + ": мяу!");
    }

    @Override
    public String  toString() {
        return "кот: " + this.name;
    }
}
