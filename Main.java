import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String color, answer;
        int calories, amount;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Apple[] apples = new Apple[5];
        Grape[] grapes = new Grape[5];
        Banana[] bananas = new Banana[5];
        Mango[] mangos = new Mango[5];

        apples[0] = new Apple();
        grapes[0] = new Grape();
        bananas[0] = new Banana();
        mangos[0] = new Mango();

        Basket basket = new Basket(apples[0], grapes[0], bananas[0], mangos[0]);

        System.out.println("\nPress any key to continue...");
        reader.readLine();

        while (true) {
            System.out.println("Menu:\n\t1 to show Basket's info.\n\t2 to change part of basket.\n\t3 to exit.\nYour answer: ");
            answer = reader.readLine();

            if (answer.charAt(0) == '1') {
                basket.Info_Basket();
                System.out.println("\nPress any key to continue...");
                reader.readLine();
            } else if (answer.charAt(0) == '2') {
                System.out.println("Select part to change:\n\t1 Apple\n\t2 Grape\n\t3 Banana\n\t4 Mango\n\t5 to menu\nYour answer: ");
                answer = reader.readLine();

                if (answer.charAt(0) == '1') {
                    System.out.println("Choose Apple in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (apples[i] != null)
                            System.out.println((i + 1) + " " + apples[i].get_color());
                        else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (apples[i] == null) continue;
                            apples[i] = null;
                        }
                        System.out.println("All added apples were deleted!");
                        basket.set_Apple(apples[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (apples[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Apple's color: ");
                        color = reader.readLine();
                        System.out.println("Enter Apple's calories: ");
                        calories = Integer.parseInt(reader.readLine());
                        System.out.println("Enter amount of apples: ");
                        amount = Integer.parseInt(reader.readLine());

                        apples[Integer.parseInt(answer) - 1] = new Apple(color, calories, amount);
                        basket.set_Apple(apples[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    basket.set_Apple(apples[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                } else if (answer.charAt(0) == '2') {
                    System.out.println("Choose Grape in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (grapes[i] != null)
                            System.out.println((i + 1) + " " + grapes[i].get_color());
                        else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (grapes[i] == null) continue;
                            grapes[i] = null;
                        }
                        System.out.println("All added grapes were deleted!");
                        basket.set_Grape(grapes[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (grapes[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Grape's color: ");
                        color = reader.readLine();
                        System.out.println("Enter Grape's calories: ");
                        calories = Integer.parseInt(reader.readLine());
                        System.out.println("Enter amount of grape: ");
                        amount = Integer.parseInt(reader.readLine());

                        grapes[Integer.parseInt(answer) - 1] = new Grape(color, calories, amount);
                        basket.set_Grape(grapes[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    basket.set_Grape(grapes[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                } else if (answer.charAt(0) == '3') {
                    System.out.println("Choose Banana in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (bananas[i] != null)
                            System.out.println((i + 1) + " " + bananas[i].get_color());
                        else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (bananas[i] == null) continue;
                            bananas[i] = null;
                        }
                        System.out.println("All added bananas were deleted!");
                        basket.set_Banana(bananas[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (bananas[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Banana's color: ");
                        color = reader.readLine();
                        System.out.println("Enter Banana's calories: ");
                        calories = Integer.parseInt(reader.readLine());
                        System.out.println("Enter amount of bananas: ");
                        amount = Integer.parseInt(reader.readLine());

                        bananas[Integer.parseInt(answer) - 1] = new Banana(color, calories, amount);
                        basket.set_Banana(bananas[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    basket.set_Banana(bananas[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                } else if (answer.charAt(0) == '4') {
                    System.out.println("Choose Mango in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (mangos[i] != null)
                            System.out.println((i + 1) + " " + mangos[i].get_color());
                        else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (mangos[i] == null) continue;
                            mangos[i] = null;
                        }
                        System.out.println("All added mangos were deleted!");
                        basket.set_Mango(mangos[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (mangos[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Mango's color: ");
                        color = reader.readLine();
                        System.out.println("Enter Mango's calories: ");
                        calories = Integer.parseInt(reader.readLine());
                        System.out.println("Enter amount of mangos: ");
                        amount = Integer.parseInt(reader.readLine());

                        mangos[Integer.parseInt(answer) - 1] = new Mango(color, calories, amount);
                        basket.set_Mango(mangos[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    basket.set_Mango(mangos[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                }

            } else if (answer.charAt(0) == '3') break;
        }
    }

}