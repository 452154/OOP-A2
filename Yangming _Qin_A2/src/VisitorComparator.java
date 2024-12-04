import java.util.Comparator;

class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        if (v1 == null || v2 == null) {
            throw new NullPointerException("Visitors must not be null");
        }
        String name1 = v1.getName();
        String name2 = v2.getName();
        if (name1 == null || name2 == null) {
            throw new NullPointerException("Visitor names must not be null");
        }
        return name1.compareTo(name2);
    }
}
