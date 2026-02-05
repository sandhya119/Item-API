package com.task.itemapi;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {

    private List<Item> items = new ArrayList<>();
    private long idCounter = 1;

    public Item addItem(Item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
