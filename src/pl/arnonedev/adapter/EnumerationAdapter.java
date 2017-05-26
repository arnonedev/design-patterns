package pl.arnonedev.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Arek on 2017-05-26.
 */
public class EnumerationAdapter implements Iterator {
    private Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
