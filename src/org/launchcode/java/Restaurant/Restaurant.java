package org.launchcode.java.Restaurant;

public class Restaurant {
    public static void main(String[] args){
        MenuItems potatoes = new MenuItems("potatoes","Side","Creamy Mashed Potatoes served with Garlic Butter Sauce",6.99,false);
    Menu menu = new Menu();
    menu.addMenuItems(potatoes);
    for(MenuItems items : menu.getMenuItems()){
        System.out.println(items.getName());
    }
    menu.setLastUpdated();
        System.out.println(menu.getLastUpdated());


    }
}
