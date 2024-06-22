/**
 * Source/Исчтоник: https://leetcode.com/problems/add-binary/description/
 * Issue/Проблема:
 * 
 * Даны два двоичных числа в форме строк. Необходимо сложить их и вернуть результат(такой же строкой). Впереди результат не может быть нулей.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= a.length, b.length <= 104
 * - a and b consist only of '0' or '1' characters.
 * - Each string does not contain leading zeros except for the zero itself.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 100,00%
 * Memory beats 99,09%
 * 
 * Telegram: https://t.me/c/2225351477/17
 */
class Solution {
    public String addBinary(String a, String b) {
        // initialize the ith index
        int i = a.length()-1;
        // initialize the jth index
        int j = b.length()-1;
        // initialize the carry 
        int carry = 0;
      // initialize the sum
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || carry == 1){
            sum = carry;
            if(i>=0) sum = sum+a.charAt(i)-'0';
            if(j>=0) sum = sum+b.charAt(j)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}