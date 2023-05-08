import java.util.List;
import java.util.Map;
import java.util.Set;

public class Functions {
    public static void getInfo(Map<String, List<Double>> hmap){
        
        // *iterate through the keys 
        Set<String> keys = hmap.keySet();
        for (String key : keys){
            List<Double> value = hmap.get(key);
            if(!value.isEmpty()){
                System.out.println(key + " Highest: " + highestNumber(value));
                System.out.println(key + " Lowest: " + lowestNumber(value));
                System.out.println(key + " Average: " + average(value) + "\n");
              }
              
        }
        // *for each of the key and get the list 
        // *for each value in the list get the highest 
        // *print out highest 
        
        
    }
    

    
      public static double highestNumber(List<Double> list){ 
        //get the highest number in the list
        // [1,2,3] --> 3
        // [1] --> 1
        double maxValue = Double.MIN_VALUE;
        for(double i : list){
            if(i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }
    
    
    public static double lowestNumber(List<Double> list){ 
        //get the highest number in the list
        // [1,2,3] --> 1
        // [1] --> 1
        double minValue = Double.MAX_VALUE;
        for(double i : list){
            if(i < minValue){
                minValue = i;
            }
        }
        return minValue;
    }
    
    public static double average(List<Double> list){
        // *add up total value
        // *get the total number in the list
        //total value / total number
        // double currentNumber = 0;
        // for(double i : list){
        //     double total = currentNumber + i;
        //     currentNumber = total;
        // }
        
        // return (currentNumber / list.size());
        
        double total = 0;
        for(double i : list){
            total = total + i;
        }
        
        return (total / list.size());
        
        
    }
    
    
}

