package Java;

import java.util.Iterator;

public class Toys<T extends Toy> implements Iterable<T>, Doable<T> {
    
    private T Toy;
    public T getToy(){
        return Toy;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void addToy(T toy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToy'");
    }

    @Override
    public void sortByDroptate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByDroptate'");
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    
}
