import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {

        // ItemFabric generator = new GoldFabric();
        // generator.openReward();
        // generator = new GemFabric();
        // generator.openReward();

        Random random = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new GoldFabric());
        fabricList.add(new GemFabric());
        fabricList.add(new ElixirGenerator());

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt() % 2 == 0 ? 0 : 1);
            ItemFabric itemFabric = fabricList.get(index);
            itemFabric.openReward();
        }
    }
}