package model.item;

public class CasualJacket implements Jacket{
    float size;
    @Override
    public boolean isFit(int personSize) {
        return !(personSize > size + 1) && !(personSize < size - 1);
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
