// 67. Add Binary (EASY - not really) (SOLVED)

public class Problem_67 {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0'; 
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2); 
            carry = sum / 2; 
        }

        return result.reverse().toString(); 
    }

    public static void main(String[] args) {
        Problem_67 problem_67 = new Problem_67();
        String a = "11101001";
        String b = "000101110";
        System.out.println(problem_67.addBinary(a, b));
    }
}
