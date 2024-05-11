public class string_methods {
    public static void main(String[] args) {
        String name = "Santosh";
        int value = name.length();
        System.out.println(value);

        /*String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     santosh     ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(nonTrimmedString.trim());*/
        //System.out.println(name.substring(5));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('r', 'p'));

    }
}
