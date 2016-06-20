package edu.inflekted.laba.shoppingList.data;

import edu.inflekted.laba.shoppingList.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by andrejs.leitans on 6/20/16.
 */
public class ItemsListStorageImpl implements ItemsListStorage {

    private List<Item> items;
    private Long counter;

    public ItemsListStorageImpl() {
        this.items = new ArrayList<Item>();
        this.counter = 1L;
    }

    public void addItem(Item item) {
        item.setId(this.counter++);
        this.items.add(item);
    }

    public void deleteItemById(Long itemId) {
        this.items.remove(getItemById(itemId));
    }

    public List<Item> getAllItems() {
        return this.items;
    }

    private Item getItemById(final Long id) {
        return (Item) this.items.stream().filter(item -> Objects.equals(item.getId(), id));
    }
}
