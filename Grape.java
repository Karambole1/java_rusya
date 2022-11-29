public class Grape {
    private String color;		// Цвет
    private int calories;		// Калории
    private int amount;			// Количество

    Grape() {
        color = "default color";
        calories = 12;
        amount = 10;
        System.out.println("Grape was created with default params!\n");
    }

    Grape(String color) {
        this.color = color;
        calories = 12;
        amount = 10;
        System.out.println("Grape was created\n");
    }
    Grape(String color, int calories, int amount) {
        this.color = color;
        this.calories = calories;
        this.amount = amount;
        System.out.println("\nNew Grape was created");
    }

    void Grape_INFO() {
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
