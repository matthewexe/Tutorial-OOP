public class Dog extends Animal {

    public Dog(String nome) {
        super(nome);
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }

    @Override
    public void speak() {
        System.out.println("Dog is speaking...");
    }

    public void walk(int i) {
        for (int j = 0; j < i; j++) {
            this.walk();
        }
    }

}
