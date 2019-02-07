 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        //int int1;
        int max;
        if (integers[0] >= integers[1] && integers[0] >= integers[2]) 
        max = integers[0];
        else if (integers[1] >= integers[0] && integers [1] >= integers[2])
        max = integers[1];
        else
        max = integers[2];
        
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int int1 = Math.max(integers[0],integers[1]);
        int max = Math.max(integers[2],int1);
        
        return max;
    }
}
