public class StringInheritance {
    static class Plant{
        String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }   
    static class Flower extends Plant{
        public void setName(String name){
            this.name = this.name + name;
        }
    }

    public static void main(String[] args){
        Flower flower = new Flower();
        flower.setName("Petunia");
        System.out.println(flower.getName());
    }
}

/**
 * the output is nullPetunia
 * Any primitive and non-primitive type can be converted to a String. For non-primitive types, the value returned by toString() method of the object is used for this conversion unless the object isn’t null. If the object is null, then it is converted to the String value of “null” (four ASCII characters n, u, l, l).
 */

