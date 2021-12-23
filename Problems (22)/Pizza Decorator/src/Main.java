
import java.util.Locale;

class TestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + " $" + formatSum(simpleVeganPizza.cost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Broccoli(veganPizzaDecor);
        veganPizzaDecor = new Tomato(veganPizzaDecor);
        veganPizzaDecor = new Spinach(veganPizzaDecor);
        System.out.println(veganPizzaDecor.getDescription() + " $" + formatSum(veganPizzaDecor.cost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Ham(meatPizzaDecor);
        meatPizzaDecor = new Chicken(meatPizzaDecor);
        meatPizzaDecor = new Cheese(meatPizzaDecor);
        System.out.println(meatPizzaDecor.getDescription() + " $" + formatSum(meatPizzaDecor.cost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);