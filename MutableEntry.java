import java.util.HashSet;
import java.util.Objects;

class MutableEntry {
    public String value;

    public MutableEntry(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableEntry that = (MutableEntry) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


    public static void main(String[] args) {

        MutableEntry key1 = new MutableEntry("key1");
        MutableEntry key2 = new MutableEntry("key2");

        HashSet<MutableEntry> set = new HashSet<>();
        set.add(key1);
        set.add(key2);

        key1.value = "key3";

        System.out.println(set.contains(new MutableEntry("key3")));
        System.out.println(set.contains(new MutableEntry("key1")));
        System.out.println(set.size());
    }
}