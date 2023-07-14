package efective.createanddestroying.builder;

import efective.createanddestroying.builder.hierachies.Calzone;
import efective.createanddestroying.builder.hierachies.NyPizza;
import efective.createanddestroying.builder.hierachies.Pizza;

public class Main {

    public static void main(String[] args) {
        /*Customer customer = Customer.builder().name("a").age(10).salary(1000).build();
        System.out.println(customer);

        CustomerBuilder customerBuilder1 = CustomerBuilder.builder().name("b").age(11).salary(900).build();
        CustomerBuilder customerBuilder2 = CustomerBuilder.builder().age(11).salary(900).build();
        System.out.println(customerBuilder1);
        System.out.println(customerBuilder2);

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 10)
                .calories(1).sodium(2).calories(3).build();
        System.out.println(nutritionFacts);*/

        Pizza pizzaNY = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION).build();
        Pizza calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println(pizzaNY);
        System.out.println(calzone);
    }
}
