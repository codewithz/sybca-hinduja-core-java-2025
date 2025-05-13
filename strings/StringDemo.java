

public class StringDemo {
    public static void main(String[] args) {
        
        String s="Code With Z";
        System.out.println(s);

        // Code With Z Inc

        System.out.println("---------------Concat ------------");
//Create a new string by concatenating two strings
        String s1=" Inc.";
        String s2=s.concat(s1);
        System.out.println(s2);

        System.out.println("-------- Length -----------------");
        int len=s.length();
        System.out.println("Lenght of string "+s+" is "+len);
        int len1=s2.length();
        System.out.println("Lenght of string "+s2+" is "+len1);

        System.out.println("----------- Equality --------------");

        String x1="Code With Z";
        String x2="code with z";

        System.out.println(x1.equals(x2));  //checks for the exact match including the cases
        System.out.println(x1.equalsIgnoreCase(x2)); //check for exact match exluding the cases

        System.out.println("---------- Trims and Empty Checks-------------");

        String s4="   Code With Z    ";
        System.out.println(s4);
        int l4=s4.length();
        System.out.println(s4+"--"+l4);


        String s5=s4.trim();
        int l5=s5.length();
        System.out.println(s5+"--"+l5);

        String s6="";
        System.out.println("Empty check for s6:"+s6.isEmpty());
        System.out.println("Empty check for s5:"+s5.isEmpty());

        System.out.println("---------- Index and Char at -------------");

        String s7="Standard";

        char c=s7.charAt(2);
		System.out.println("Character at index 2 is "+c);

        int i1=s7.indexOf("d");
        System.out.println(i1);

        int i2=s7.indexOf("d",i1+1);
        System.out.println(i2);

        System.out.println("----------- Upper and Lower Case ------------");
		
		System.out.println(x2+"----"+x2.toUpperCase());
		System.out.println(x1+"----"+x1.toLowerCase());



    }
}
