public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Meso", 5.20, "White");
        hamburger.addHamburgerAddition1("Egg", 1.2);
        hamburger.addHamburgerAddition2("Bacon", 2.00);
        System.out.println("Total price = " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 8.90);
        healthyBurger.addHealthyAddition1("Lettuce", 2.4);
        System.out.println("Total price of the healthy hamburger is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Lettuce", 2.50);
        System.out.println("Total price of the deluxe burger is " + db.itemizeHamburger());
    }
}
