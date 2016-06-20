package edu.inflekted.laba.shoppingList.data;

import edu.inflekted.laba.shoppingList.domain.Item;

import java.util.List;

/**
 * Created by andrejs.leitans on 6/20/16.
 */
public interface ItemsListStorage {
    void addItem(Item item);
    void deleteItemById(Long itemId);
    List<Item> getAllItems();
}
