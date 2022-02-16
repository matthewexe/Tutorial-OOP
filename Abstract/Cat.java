public class Cat extends Animal {

    public Cat(String nome) {
        super(nome);
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }

    public void walk(int n) {
        for (int i = 0; i < n; i++) {
            this.walk();
        }
    }

    @Override
    public void speak() {
        System.out.println("Cat is speaking...");
    }

}
