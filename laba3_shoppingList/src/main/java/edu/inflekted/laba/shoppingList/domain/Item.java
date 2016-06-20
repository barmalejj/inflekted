package edu.inflekted.laba.shoppingList.domain;

/**
 * Created by andrejs.leitans on 6/20/16.
 */
public class Item {
    private Long id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.id + ". " + this.name;
    }
}
