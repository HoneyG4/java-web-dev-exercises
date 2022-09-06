package org.launchcode.java.Restaurant;

import java.util.ArrayList;

import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItems>menuItems = new ArrayList<>();
   private LocalDate lastUpdated;

   public void setMenuItems(MenuItems items){
       this.menuItems.add(items);
   }

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;

    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(){
       lastUpdated = LocalDate.now();
    }

    public void addMenuItems(MenuItems items) {
       this.menuItems.add(items);

    }

}
