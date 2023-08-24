public class ElixirGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {

        return new ElixirReward();
    }
}