package fox.mods;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Spar.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    public static void initialize() {
    }

    public static final Item GOLD_SPAR = register(
            new Item(new Item.Settings().maxCount(100)),
            "gold_spar"
    );
    public static final Item BRONZE_SPAR = register(
            new Item(new Item.Settings().maxCount(100)),
            "bronze_spar"
    );
    public static final Item SILVER_SPAR = register(
            new Item(new Item.Settings().maxCount(100)),
            "silver_spar"
    );
}
