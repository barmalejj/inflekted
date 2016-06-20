package edu.inflekted.laba.shoppingList;

import edu.inflekted.laba.shoppingList.data.ItemsListStorage;
import edu.inflekted.laba.shoppingList.data.ItemsListStorageImpl;
import edu.inflekted.laba.shoppingList.domain.Item;

import java.io.IOException;

/**
 * Created by andrejs.leitans on 6/20/16.
 */
public class Main {

    public static void main(String... args) throws IOException {

        ItemsListStorage storage = new ItemsListStorageImpl();
        printUsage();

        while(true) {
            int inChar = Integer.valueOf(System.console().readLine("enter your choice:"));
            switch (inChar) {
                case 1:
                    String itemName = System.console().readLine("Enter item to add:");
                    storage.addItem(new Item(itemName));
                    break;
                case 2:
                    storage.getAllItems().forEach(System.out::println);
                case 3:
                    Long itemToDeleteId = Long.valueOf(System.console().readLine("Enter ID of item you want to delete:"));
                    storage.deleteItemById(itemToDeleteId);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    printUsage();
                    break;
            }
        }
    }

    private static void printUsage() {
        System.out.println("1 - add item");
        System.out.println("2 - list items");
        System.out.println("3 - delete item");
        System.out.println("4 - save items list to file");
        System.out.println("5 - load items list from file");
        System.out.println("6 - exit");
    }
}
