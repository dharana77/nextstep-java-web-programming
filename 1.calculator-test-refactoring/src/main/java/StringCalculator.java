
public class StringCalculator {
    public int add(String text){
        if(isBlank(text)) {
            return 0;
        }
        return sum(toInt(text.split(",")));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }
    
    private int[] toInt(String[] numbers){
        int[] int_nums = new int[numbers.length];
        for(int i=0; i< numbers.length; i++){
            int_nums[i] = Integer.parseInt(numbers[i]);
        }
        return int_nums;
    }

    private int sum(int[] numbers){
        int total = 0;
        for(int number : numbers){
            total+=number;
        }
        return total;
    }
}
