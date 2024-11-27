package Dragstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import Dragstore.components.Azironite;
import Dragstore.components.Penicillin;
import Dragstore.components.Water;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azironite = new Azironite("azironite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);

        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azironite, penicillin);
        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);
        // Iterator<Component> iterator = p1;
        // while (iterator.hasNext()) {
        //     System.out.println(p1.next().toString());
        // }
        // for (Component component : p1) {
        //     System.out.println(component);
        // }
        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azironite,penicillin);
        List<Component> component = new ArrayList<>();
        component.add(azironite);
        component.add(water);
        component.add(penicillin);
        System.out.println(component);

        Collections.sort(component, Comparator.reverseOrder());
        System.out.println(component);
    }
}
