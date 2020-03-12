package com.example.getitems.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        addItem(new ItemModel("Rock Ock", "An eight-headed guitar for all your attack needs", 3, 8, 3,ItemLocationEnum.PrimaryHand, "item_rock_ock"));
        addItem(new ItemModel("Headphones", "A way to drown out your enemies screams and listen to your favorite music instead", 0, 0, 2,ItemLocationEnum.Head,"item_headphones"));
        addItem(new ItemModel("Energy Drink", "A good way to perk up during battle", 0, 0, 3,ItemLocationEnum.OffHand,"item_energy_drink"));
    }

    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ItemModel {
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String ImageURI;
        public final ItemLocationEnum Location;

        public ItemModel(String name,
                         String description,
                         int range,
                         int damage,
                         int value,
                         ItemLocationEnum location,
                         String uri) {
            this.Name = name;
            this.Description = description;
            this.Range = range;
            this.Damage  = damage;
            this.Value = value;
            this.Location = location;
            this.ImageURI = uri;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}