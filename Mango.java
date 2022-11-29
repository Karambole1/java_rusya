public class Mango {
    private String color;		// Цвет
    private int calories;		// Калории
    private int amount;			// Количество

    Mango() {
        color = "default color";
        calories = 12;
        amount = 10;
        System.out.println("Mango was created with default params!\n");
    }

    Mango(String color) {
        this.color = color;
        calories = 12;
        amount = 10;
        System.out.println("Mango was created\n");
    }
    Mango(String color, int calories, int amount) {
        this.color = color;
        this.calories = calories;
        this.amount = amount;
        System.out.println("\nNew Mango was created");
    }

    void Mango_INFO() {
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
