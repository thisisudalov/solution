import java.util.*;

class Solution {

    public static String translate(String s, int baseOfOrigin, int baseOfResult) {
        s = s.replaceFirst ("^0*", "");
        String[] in_array = s.split("");
        long decimal_number=0;
        int n = in_array.length;
        for (int i = in_array.length-1; i > -1; i--) {
            decimal_number += toDecimal(in_array[i])*Math.pow(baseOfOrigin, n-i-1);
        }
        if(baseOfResult==10) return String.valueOf(decimal_number);
        String result = "";
        while (decimal_number/baseOfResult>0){
            long balance = decimal_number % baseOfResult;
            decimal_number = decimal_number/baseOfResult;
            result = toVariable(balance) + result;
        }
        if(decimal_number!=0){result = toVariable(decimal_number)+result;}
        return result;
    }

    private static int toDecimal(String a){

        Map<String, Integer> mapToDecimal = new HashMap();

        mapToDecimal.put("0", 0);
        mapToDecimal.put("1", 1);
        mapToDecimal.put("2", 2);
        mapToDecimal.put("3", 3);
        mapToDecimal.put("4", 4);
        mapToDecimal.put("5", 5);
        mapToDecimal.put("6", 6);
        mapToDecimal.put("7", 7);
        mapToDecimal.put("8", 8);
        mapToDecimal.put("9", 9);
        mapToDecimal.put("A", 10);
        mapToDecimal.put("B", 11);
        mapToDecimal.put("C", 12);
        mapToDecimal.put("D", 13);
        mapToDecimal.put("E", 14);
        mapToDecimal.put("F", 15);
        mapToDecimal.put("G", 16);
        mapToDecimal.put("H", 17);
        mapToDecimal.put("I", 18);
        mapToDecimal.put("J", 19);
        mapToDecimal.put("K", 20);
        mapToDecimal.put("L", 21);
        mapToDecimal.put("M", 22);
        mapToDecimal.put("N", 23);
        mapToDecimal.put("O", 24);
        mapToDecimal.put("P", 25);
        mapToDecimal.put("Q", 26);
        mapToDecimal.put("R", 27);
        mapToDecimal.put("S", 28);
        mapToDecimal.put("T", 29);
        mapToDecimal.put("U", 30);
        mapToDecimal.put("V", 31);
        mapToDecimal.put("W", 32);
        mapToDecimal.put("X", 33);
        mapToDecimal.put("Y", 34);
        mapToDecimal.put("Z", 35);

        return mapToDecimal.get(a);
    }

    private static String toVariable(long a) {
        int b = (int) a;

        Map<Integer, String> mapToVariable = new HashMap();

        mapToVariable.put(0,"0");
        mapToVariable.put(1,"1");
        mapToVariable.put(2,"2");
        mapToVariable.put(3,"3");
        mapToVariable.put(4,"4");
        mapToVariable.put(5,"5");
        mapToVariable.put(6,"6");
        mapToVariable.put(7,"7");
        mapToVariable.put(8,"8");
        mapToVariable.put(9,"9");
        mapToVariable.put(10,"A");
        mapToVariable.put(11,"B");
        mapToVariable.put(12,"C");
        mapToVariable.put(13,"D");
        mapToVariable.put(14,"E");
        mapToVariable.put(15,"F");
        mapToVariable.put(16,"G");
        mapToVariable.put(17,"H");
        mapToVariable.put(18,"I");
        mapToVariable.put(19,"J");
        mapToVariable.put(20,"K");
        mapToVariable.put(21,"L");
        mapToVariable.put(22,"M");
        mapToVariable.put(23,"N");
        mapToVariable.put(24,"O");
        mapToVariable.put(25,"P");
        mapToVariable.put(26,"Q");
        mapToVariable.put(27,"R");
        mapToVariable.put(28,"S");
        mapToVariable.put(29,"T");
        mapToVariable.put(30,"U");
        mapToVariable.put(31,"V");
        mapToVariable.put(32,"W");
        mapToVariable.put(33,"X");
        mapToVariable.put(34,"Y");
        mapToVariable.put(35,"Z");

        return mapToVariable.get(b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String number = in.next();
        System.out.print("Input a base of origin: ");
        int baseOfOrigin = in.nextInt();
        System.out.print("Input a base of result: ");
        int baseOfResult = in.nextInt();
        System.out.println(translate(number, baseOfOrigin,baseOfResult));
    }
}

