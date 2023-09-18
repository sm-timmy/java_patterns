package model.factory;

import model.item.*;

public class WeddingSuitFactory implements SuitFactory{
    @Override
    public Jacket makeJacket() {
        return new WeddingJacket();
    }

    @Override
    public Trousers makeTrousers() {
        return new WeddingTrousers();
    }

    @Override
    public Shoes makeShoes() {
        return new WeddingShoes();
    }
}
