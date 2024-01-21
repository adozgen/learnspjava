package com.adozgen.learnjava.functional.lambda;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class FunctionalComponent {
    @PostConstruct
    public void init(){
/*        Math adder = new Math(){
            @Override
            public double calculate(double  arg1, double arg2){
                return arg1 + arg2;
            } };
        doMath(adder, 3, 5);*/

        Math adder = (double arg1, double arg2) -> { return arg1 + arg2;};
        doMath(adder,3,5);

        Selamlama selamlama = isim -> System.out.println("Merhaba, " + isim + "!");
        selamlama.selamla("ahmet");
    }
    public void doMath(Math math, double arg1, double arg2){
        System.out.println(math.calculate(arg1,arg2));
    }
}
