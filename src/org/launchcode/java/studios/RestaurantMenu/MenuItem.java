package org.launchcode.java.studios.RestaurantMenu;

public class MenuItem {
    private String name;
    private Double price;
    private String category;
    private String description;
    private Boolean isNew;

    public MenuItem(String name, Double price,  String description){
        this.name = name;
        this.price = price;
        this.description = description;

        this.category = "No Category";
        this.isNew = false;
    }

    public MenuItem(String name, Double price,  String description, String category, Boolean isNew){
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getisNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setisNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString(){
        return this.name + " " + this.price + " " + this.description + " " + this.category + " " + this.isNew;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;

        if(!(obj instanceof MenuItem)){
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;
        if(menuItem.name.equals(this.name) && menuItem.description.equals(this.description) && menuItem.price.equals(this.price) && menuItem.category.equals(this.category)){
            return true;
        } else{
            return false;
        }
    }
}
