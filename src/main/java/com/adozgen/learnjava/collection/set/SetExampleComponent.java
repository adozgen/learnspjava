package com.adozgen.learnjava.collection.set;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@Component
public class SetExampleComponent {
    @PostConstruct
    public void init(){
        Set set = new TreeSet();

        EmployeeSet e1 = new EmployeeSet(888, "Mihrimah", "Kaldiroglu");
        System.out.println(set.add(e1));

        EmployeeSet e2 = new EmployeeSet(222, "Ali", "Can");
        System.out.println(set.add(e2));

        EmployeeSet e3 = new EmployeeSet(111, "Ayse", "Unlu");
        System.out.println(set.add(e3));

        EmployeeSet e4 = new EmployeeSet(223, "Sami", "Mutlu");
        System.out.println(set.add(e4));

        EmployeeSet e5 = new EmployeeSet(222, "Ali", "Can");
        System.out.println(set.add(e5));  // Do you think e5 would be added?
        System.out.println("\n******      Elements  in  the  Collection      ******");
        Iterator i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("****************************************************\n");

    }
}
