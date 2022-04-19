package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date updatedLast;

    public Menu(){
    this.updatedLast = new Date();
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public Date getLastUpdated(){
        return this.updatedLast;
    }

    public void setUpdatedLast(Date updatedLast){
        this.updatedLast = updatedLast;
    }

    public void addMenuItem(MenuItem item){
        for(MenuItem menuItem: this.menuItems){
            if(item.equals(menuItem)){
                System.out.println("This item already exists!");
                return;
            }
        }
        this.menuItems.add(item);

        this.updatedLast = new Date();
    }

    public void removeMenuItem(MenuItem item){
        this.menuItems.remove(item);

        this.updatedLast = new Date();
    }

    @Override
    public String toString(){
        String output = "";

        for(MenuItem item: this.menuItems){
            output += item.toString() + "\n";
        }
        return output;
    }

}
