package model.factory;

import model.item.*;

public class CasualSuitFactory implements SuitFactory{
    @Override
    public Jacket makeJacket() {
        return new CasualJacket();
    }

    @Override
    public Trousers makeTrousers() {
        return new CasualTrousers();
    }

    @Override
    public Shoes makeShoes() {
        return new CasualShoes();
    }
}
