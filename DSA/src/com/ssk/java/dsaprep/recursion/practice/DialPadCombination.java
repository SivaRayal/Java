package com.ssk.java.dsaprep.recursion.practice;


import java.util.*;

/*
	Given a string containt digits from 2 -9 inclusive, return all possible letter combinations that the number could represent.
	A mapping of digit to letters (just like on the telephone buttons) is given below. Not that 1 does not map to any letters
	Eg :
		input = "23"    // 1 - 1,  2 - abc, 3 - def , 4 - ghi, 5 - jkl, 6 - mno, 7 - pqrs, 8 - tuv, 9 - wxyz
		Output = ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    Although the above answer is in lexicographical order, your answer could be in any order you want.
*/
public class DialPadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dailpad number (1-9) to get the letter combinations :");
        String n = sc.next();
//        System.out.println("n.length() "+n.length()+" (int)n.charAt(index)-"+Character.getNumericValue(n.charAt(0)));
        Map<Integer, List<String>> inputMap = new HashMap<>();
        inputMap.put(0, Arrays.asList(""));
        inputMap.put(1, Arrays.asList(""));
        inputMap.put(2, Arrays.asList("a","b","c"));
        inputMap.put(3, Arrays.asList("d","e","f"));
        inputMap.put(4, Arrays.asList("g","h","i"));
        inputMap.put(5, Arrays.asList("j","k","l"));
        inputMap.put(6, Arrays.asList("m","n","o"));
        inputMap.put(7, Arrays.asList("p","q","r","s"));
        inputMap.put(8, Arrays.asList("t","u","v"));
        inputMap.put(9, Arrays.asList("w","x","y","z"));

        ArrayList<String> output = new ArrayList<>();
        dialpad_permutation_helper(n,0,inputMap,new StringBuilder(),output);
        System.out.println("Possible combinations of input number from dialpad letters are :");
        System.out.println(output);
    }

    public static void dialpad_permutation_helper(String n, Integer index, Map<Integer,List<String>> dict,StringBuilder aux,ArrayList<String> output){
        // base case
        if(index>=n.length()){
            output.add(aux.toString());
            return;
        }

        if(dict.get(Character.getNumericValue(n.charAt(index))).size() == 0) {
            dialpad_permutation_helper(n,index+1,dict,aux,output);
            return;
        }

        // recursive case - iterate over each options/values for corresponding choice
        for(int i=0; i<dict.get(Character.getNumericValue(n.charAt(index))).size(); i++){
            aux.append(dict.get(Character.getNumericValue(n.charAt(index))).get(i)); // top down from tree push the value of corresponding choice
            dialpad_permutation_helper(n,index+1,dict,aux,output); // recursive to next choice
            aux.deleteCharAt(aux.length()-1); // bottom - up pop for moving back to prev choice
        }
    }
}
