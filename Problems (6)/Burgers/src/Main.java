class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore mcDonalds = new McDonStore();
        BurgerStore burgerKing = new BurgerKingStore();

        Burger burger;

        System.out.println("-Hello, one McDonalds style cheeseburger");
        System.out.println("-Okay! Please wait for a sec, -Calling to the McDonaldsStore. -Cheeseburger");
        burger = mcDonalds.orderBurger(Burger.CHEESE);
        Thread.sleep(1500);
        System.out.println("There it is!");
        System.out.println(burger.getName() + "\n");

        System.out.println("-Hello, one BurgerKing style hamburger");
        System.out.println("-Okay! Please wait for a sec, -Calling to the BurgerKingStore. -Hamburger\"");
        burger = burgerKing.orderBurger(Burger.HAMBURGER);
        Thread.sleep(1500);
        System.out.println("There it is!");
        System.out.println(burger.getName());
    }
}

abstract class BurgerStore {

    protected abstract Burger createBurger(String type);

    Burger orderBurger(String type) {
        Burger burger = createBurger(type);
        System.out.println("--- Making a " + burger.getName() + " ----");
        burger.collect();
        burger.box();
        return burger;
    }
}

class McDonStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new McDonIngredientFactory();

        switch (type) {
            case Burger.CHEESE :
                burger = new Cheeseburger(ingredientFactory);
                burger.setName("McDonalds Style Cheeseburger");
                break;
            case Burger.VEGAN :
                burger = new VeganBurger(ingredientFactory);
                burger.setName("McDonalds Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);
                burger.setName("McDonalds Style Hamburger");
                break;
        }

        if (burger !=null) {
            burger.setBox("McDonalds Box");
        }

        return burger;
    }
}

class BurgerKingStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new BurgerKingIngredientFactory();

        switch (type) {
            case Burger.CHEESE :
                burger = new Cheeseburger(ingredientFactory);
                burger.setName("BurgerKing Style Cheeseburger");
                break;
            case Burger.VEGAN :
                burger = new VeganBurger(ingredientFactory);
                burger.setName("BurgerKing Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);
                burger.setName("BurgerKing Style Hamburger");
                break;
        }

        if (burger !=null) {
            burger.setBox("BurgerKing Box");
        }

        return burger;
    }
}

interface BurgerIngredientFactory {
    Bun createBun();
    