import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class csv {

    static Entry<String, List<Double>> maxEntry = null;

    public static boolean containsNumber(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                return true;
            }
        }
        return false;
    }

  
    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            return;

        // donothing();
        Map<String, List<Double>> keyValuePair = new HashMap<>(); // cannot put double cos that double will be replaced
                                                                  // if not in an array
        List<Double> value = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;

        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] lineColumns = line.split(",");

            // Create hashmap entry if key does not exist
            if (!keyValuePair.containsKey(lineColumns[1]) && containsNumber(lineColumns[1]) == false  ) {
                keyValuePair.put(lineColumns[1], new ArrayList<>());
            } 
            // checks if rating is not null, before adding into hashmap
            if (!lineColumns[2].equals("NaN") && (Double.parseDouble(lineColumns[2]) <= 5)) {
                keyValuePair.get(lineColumns[1]).add(Double.parseDouble(lineColumns[2]));
            }
            
        

        }


        Functions.getInfo(keyValuePair);

        // Set<String> keySet = keyValuePair.keySet();
        // ArrayList<String> listofKeys = new ArrayList<>(keySet);
        // System.out.println(listofKeys);

        // Map<Object, List<Object>> result = 
        // keyValuePair.entrySet().stream()
        // .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        // System.out.println(result);
       
        br.close();

        // int b = // gets from file
        // try {
        // int test = 256 / b;
        // } catch (ArithmeticException ae) {
        // System.out.println("Math error found");
        // }

        // catch (Exception e) {
        // System.out.println("Errors found");
        // }
    }




}