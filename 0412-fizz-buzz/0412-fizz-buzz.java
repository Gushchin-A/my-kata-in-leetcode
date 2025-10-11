class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            boolean isFizzBuzz = isFizz && isBuzz;

            if (isFizzBuzz) {
                result.add("FizzBuzz");
            } else if (isFizz) {
                result.add("Fizz");
            } else if (isBuzz) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}