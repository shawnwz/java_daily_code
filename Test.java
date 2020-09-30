import java.util.Arrays;

public class Test {
    static class Person{
        private String name;
        public Person(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
    }

    public static void main(String[] args){
        Person johnFromNy = new Person("john");
        Person dave = new Person("dave");
        Person johnFromCc = new Person(new String("john"));

        long found = Arrays.asList(johnFromNy, dave, johnFromCc)
        .stream()
        .filter(item -> "john" == item.getName())
        .count();

        System.out.println(found);

    }
}
/*
Strings are compared using == in the filter, so johnFromNy will be returned, but johnFromChicago won’t be returned, because the instance of name was created with the new String() constructor instead of interning the String. Hence, the instance of String john in the Object johnFromChicago will be different when compared to the instance of String john used in the filter step.
*/