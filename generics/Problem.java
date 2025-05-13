

public class Problem {

    public static void main(String[] args) {
        Box box = new Box();
        box.put("String instead of Integer");
        Integer number = (Integer) box.get(); // Boom! ClassCastException at runtime
    }
}
