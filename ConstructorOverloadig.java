public class ConstructorOverloadig {

    private class Animal{};

    private class Cat extends Animal{};

    private ConstructorOverloadig(Object o) {
        System.out.println("Object");
    }

    private ConstructorOverloadig(Object[] objects){
        System.out.println("Object array");
    }

    private ConstructorOverloadig(Animal[] animals){
        System.out.println("Animal array");
    }

    private ConstructorOverloadig(Cat[] cats) {
        System.out.println("Cat Array");
    }

    public static void main(String[] args){
        new ConstructorOverloadig(null);
    }
}
