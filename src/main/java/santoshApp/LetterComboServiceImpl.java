package santoshApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("letterComboService")
public class LetterComboServiceImpl  {

	public List<String> letterCombinations(String digits) {
		ArrayList<String> listOfCombinations = new ArrayList<>();
		
	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    map.put(2, "ABC");
	    map.put(3, "DEF");
	    map.put(4, "GHI");
	    map.put(5, "JKL");
	    map.put(6, "MNO");
	    map.put(7, "PQRS");
	    map.put(8, "TUV");
	    map.put(9, "WXYZ");
	    map.put(0, "OPER");
	 
	    ArrayList<String> result = new ArrayList<String>();
	 
	    if(digits == null || digits.length() == 0)
	        return result;
	 
	    ArrayList<Character> temp = new ArrayList<Character>();
	    getString(digits, temp, result, map, listOfCombinations);
	 
	    return listOfCombinations;
	}
	 
	public void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map, ArrayList<String> listOfCombinations){
		Integer LengthOfPhoneNumber = digits.length();
	    if(digits.length() == 0){
	        char[] arr = new char[temp.size()];
	        for(int i=0; i<temp.size(); i++){
	            arr[i] = temp.get(i);
	        }
	        result.add(String.valueOf(arr));
	        return;
	    }
	 
	    Integer curr = Integer.valueOf(digits.substring(LengthOfPhoneNumber-1,LengthOfPhoneNumber));
	    String letters = map.get(curr);
	    for(int i=0; i<letters.length(); i++){
	        temp.add(letters.charAt(i));
	        listOfCombinations.add(digits.substring(0,LengthOfPhoneNumber-1) + letters.charAt(i));
	        temp.remove(temp.size()-1);
	    }
	}
}
