package model.factory;

import model.item.Jacket;
import model.item.Shoes;
import model.item.Trousers;

public interface SuitFactory {
    Jacket makeJacket();
    Trousers makeTrousers();
    Shoes makeShoes();
}
