public class Basket {
    private Apple apple;
    private Grape grape;
    private Banana banana;
    private Mango mango;

    Basket() {
        this.apple = new Apple();
        this.grape = new Grape();
        this.banana = new Banana();
        this.mango = new Mango();
        System.out.println("\nBasket was created with default params!\n");
    }
    Basket(Apple apple, Grape grape, Banana banana, Mango mango) {
        this.apple = apple;
        this.grape = grape;
        this.banana = banana;
        this.mango = mango;
        System.out.println("\nBasket was created\n");
    }

    void set_Apple(Apple apple) {
        System.out.println("\nCurrent Apple was changed to\n\n");
        apple.Apple_INFO();
        this.apple = apple;
    }

    void set_Grape(Grape grape) {
        System.out.println("\nCurrent Grape was changed to\n\n");
        grape.Grape_INFO();
        this.grape = grape;
    }

    void set_Banana(Banana banana) {
        System.out.println("\nCurrent Banana was changed to\n\n");
        banana.Banana_INFO();
        this.banana = banana;
    }

    void set_Mango(Mango mango) {
        System.out.println("\nCurrent Mango was changed to\n\n");
        mango.Mango_INFO();
        this.mango = mango;
    }

    void Info_Basket() {
        System.out.println("Baskets's info:\n\n");
        System.out.println("Apple(s):\n");
        apple.Apple_INFO();
        System.out.println("\nGrape(s):\n");
        grape.Grape_INFO();
        System.out.println("\nBanana(s):\n");
        banana.Banana_INFO();
        System.out.println("\nMango(s):\n");
        mango.Mango_INFO();
    }
}
