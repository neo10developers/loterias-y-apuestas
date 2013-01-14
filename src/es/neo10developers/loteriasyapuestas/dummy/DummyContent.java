package es.neo10developers.loteriasyapuestas.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    public static class DummyItem {

        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "La Quiniela"));
        addItem(new DummyItem("2", "Lotería Nacional"));
        addItem(new DummyItem("3", "La Primitiva"));
        addItem(new DummyItem("4", "Euromillones"));
        addItem(new DummyItem("5", "BonoLoto"));
        addItem(new DummyItem("6", "El Gordo"));
        addItem(new DummyItem("7", "El Quinigol"));
        addItem(new DummyItem("8", "Lototurf"));
        addItem(new DummyItem("9", "Quíntuple Plus"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
}
