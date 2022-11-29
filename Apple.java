public class Apple {
    private String color;		// Цвет
    private int calories;		// Калории
    private int amount;			// Количество

    Apple() {
        color = "default color";
        calories = 12;
        amount = 10;
        System.out.println("Apple was created with default params!\n");
    }

    Apple(String color) {
        this.color = color;
        calories = 12;
        amount = 10;
        System.out.println("Apple was created\n");
    }
    Apple(String color, int calories, int amount) {
        this.color = color;
        this.calories = calories;
        this.amount = amount;
        System.out.println("\nNew Apple was created");
    }

    void Apple_INFO() {
        System.out.println("\tcolor: " + color + "\n\tcalories: " +
                calories + "\n\tamount: " + amount + "\n");
    }

    void set_color(String color) {
        this.color = color;
    }
    String get_color() {
        return color;
    }

    void set_calories(int calories) {
        this.calories = calories;
    }
    int get_calories() {
        return calories;
    }

    void set_amount(int amount) {
        this.amount = amount;
    }
    int get_amount() {
        return amount;
    }
}
