package org.launchcode.java.studios.RestaurantMenu;

public class Program {

    public static void main(String[] args){
        MenuItem menuItem1 = new MenuItem("Pizza", 6.00, "Cheese pizza", "entre", false);
        MenuItem menuItem2 = new MenuItem("Chili", 4.00, "Red Bean Chili", "entre", false);
        MenuItem menuItem3 = new MenuItem("Chili", 4.00, "Red Bean Chili", "entre", false);
        MenuItem menuItem4 = new MenuItem("Cake", 2.00, "Good cake", "dessert", false);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(menuItem1);
        myMenu.addMenuItem(menuItem2);
        myMenu.addMenuItem(menuItem3);
        myMenu.addMenuItem(menuItem4);

//        System.out.println(menuItem1);
//        System.out.println(menuItem1.equals(menuItem2));
//        System.out.println(menuItem2.equals(menuItem3));
        System.out.println(myMenu);
        myMenu.removeMenuItem(menuItem4);
        System.out.println();
        System.out.println(myMenu);

    }

}
