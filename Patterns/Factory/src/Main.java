import Rewards.GemGen;
import Rewards.GoldGen;
import Rewards.ItemGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<ItemGen> generators = new ArrayList<ItemGen>();
        generators.add(new GoldGen());
        generators.add(new GemGen());

        for (int i = 0; i < 10; i++) {
            generators.get(Math.abs(rnd.nextInt() % 2 == 0 ? 0 : 1)).createItem().open();
        }
    }
}

