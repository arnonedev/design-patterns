package pl.arnonedev.adapter;

import java.util.Vector;

/**
 * Created by Arek on 2017-05-26.
 */
public class Startup {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("Ala");
        strings.add("ma");
        strings.add("kota");
        EnumerationAdapter enumerationAdapter = new EnumerationAdapter(strings.elements());
        while (enumerationAdapter.hasNext()) {
            System.out.println(enumerationAdapter.next());
        }
    }
}
