public class RomanToInteger {
    public void test() {
        //Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        //Symbol       Value
        //I             1
        //V             5
        //X             10
        //L             50
        //C             100
        //D             500
        //M             1000
        System.out.println(solution("III")); //3
    }

    private int solution(String s) {
        // 작은 따옴표이용 Integer형으로 형변환
        int[] array = new int[22];
        array['I' - 'C'] = 1;
        array['V' - 'C'] = 5;
        array['X' - 'C'] = 10;
        array['L' - 'C'] = 50;
        array['C' - 'C'] = 100;
        array['D' - 'C'] = 500;
        array['M' - 'C'] = 1000;
        int sum = 0;
        int lastNum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentNum = array[s.charAt(i) - 'C'];
            sum = currentNum < lastNum ? sum - currentNum : sum + currentNum;
            lastNum = currentNum;
        }
        return sum;
    }
}
