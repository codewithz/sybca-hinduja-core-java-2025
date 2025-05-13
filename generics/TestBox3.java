public class TestBox3 {
    public static void main(String[] args) {
        // Box that holds Integer values
        Box<Integer> intBox = new Box<>();
        intBox.put(10);
        Integer intValue = intBox.get();
        System.out.println("Integer value: " + intValue);

        // Box that holds String values
        Box<String> strBox = new Box<>();
        strBox.put("Hello Generics!");
        String strValue = strBox.get();
        System.out.println("String value: " + strValue);
    }
}