package com.twu.products;


import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public abstract class ItemManager {
    protected List<Item> allItens;

    public String getAvailableMoviesDetailsList() {
        List<Item> availableMovies = allItens.stream().filter(item -> item.isAvailable()).collect(Collectors.toList());
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add(getHeader());

        for (Item item: availableMovies) {
            stringJoiner.add(item.toString());
        }
        return stringJoiner.toString();
    }

    public abstract String getHeader();
}
