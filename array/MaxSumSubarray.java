package array;

public class MaxSumSubarray {
    
    public static void main(String[] args) {
        int []number = {2,4,6,-8,10};

        int maxSum=Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;

                for(int k=start;k<=end;k++){
                    sum+=number[k];
                }
                if(maxSum<sum)
                    maxSum = sum;
                if(minSum>sum)
                    minSum = sum;
                sum = 0;
            }
        }

        System.out.println("Max Sum : "+maxSum);
        System.out.println("Min Sum : "+minSum);
    }
}
