public class Triple<T> {
    private final T first;
    private final T second;
    private final T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T min() {
        if (first instanceof Comparable) {
            T min = first;
            if (((Comparable) second).compareTo(min) < 0) {
                min = (T) second;
            }
            if (((Comparable) third).compareTo(min) < 0) {
                min = (T) third;
            }
            return min;
        } else {
            throw new RuntimeException("Impossible to perform min");
        }
    }

    public T max() {
        if (first instanceof Comparable) {
            T max = first;
            if (((Comparable) second).compareTo(max) > 0) {
                max = (T) second;
            }
            if (((Comparable) third).compareTo(max) > 0) {
                max = (T) third;
            }
            return max;
        } else {
            throw new RuntimeException("Impossible to perform max");
        }
    }

    public double mean() {
        if (first instanceof Number) {
            return (((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue()) / 3;
        } else {
            throw new RuntimeException("Impossible to perform mean");
        }
    }

    public static void main(String[] args) {
        try {
            Triple<String> triple1 = new Triple<>("Artem", "Alex", "Bob");
            System.out.println("Triple<>(\"Artem\", \"Alex\", \"Bob\")");
            System.out.println("Min: " + triple1.min());
            System.out.println("Max: " + triple1.max());
            System.out.println("Mean: " + triple1.mean());
        } catch (RuntimeException e) {
            System.out.println("Exeption: " + e.getMessage());
        }
        try {
            Triple<Integer> triple1 = new Triple<>(10, 5, 8);
            System.out.println("Triple<>(10, 5, 8)");
            System.out.println("Min: " + triple1.min());
            System.out.println("Max: " + triple1.max());
            System.out.println("Mean: " + triple1.mean());
        } catch (RuntimeException e) {
            System.out.println("Exeption: " + e.getMessage());
        }
    }
}
