public abstract class Animal {

    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void walk();

    public void speak() {
        System.out.println("Animal is speaking...");
    }

}
