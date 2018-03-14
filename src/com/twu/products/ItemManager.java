package com.twu.products;


import com.twu.products.book.Book;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public abstract class ItemManager {
    protected List<Item> allItems;

    public String getAvailableItemsDetailsList() {
        List<Item> availableItems = allItems.stream().filter(item -> item.isAvailable()).collect(Collectors.toList());
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add(getHeader());

        for (Item item: availableItems) {
            stringJoiner.add(item.toString());
        }
        return stringJoiner.toString();
    }

    public abstract String getHeader();

    public boolean checkout(String bookName) {
        int itemIndex = findItemIndex(bookName);
        boolean success = checkoutStatus(itemIndex);
        return success;
    }

    private boolean checkoutStatus(int itemIndex) {
        boolean success = false;
        if (itemIndex >= 0) {
            Item checkedItem = allItems.get(itemIndex);
            if (checkedItem.isAvailable()){
                checkedItem.setAvailable(false);
                allItems.set(itemIndex, checkedItem);
                success = true;
            }
        }
        return success;
    }

    private int findItemIndex(String itemName) {
        int itemIndex = -1;
        int counter = 0;
        for (Item item: allItems) {
            if (item.getName().equals(itemName)){
                itemIndex = counter;
            }
            counter++;
        }
        return itemIndex;
    }

    public boolean returnBook(String bookName) {
        int bookIndex = findItemIndex(bookName);
        boolean successStatus = returnStatus(bookIndex);
        return successStatus;
    }

    private boolean returnStatus(int itemIndex) {
        boolean success = false;
        if (itemIndex >= 0) {
            Item returnedBook = allItems.get(itemIndex);
            returnedBook.setAvailable(true);
            allItems.set(itemIndex, returnedBook);
            success = true;
        }
        return success;
    }
}
