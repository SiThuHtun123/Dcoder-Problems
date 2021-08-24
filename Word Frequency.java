import java.util.*;

import org.apache.commons.lang3.ArrayUtils;


public class ProblemSolving {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		String[] stringArray = string.split(" ");
		
		List asList = Arrays.asList(stringArray);
		
		Set<String> mySet = new HashSet<String>(asList);
		List<String> myList = new ArrayList<String>(mySet);
		
		String[] intArray = new String[12];
		int j = 0;
		for(String s : mySet){
			
			int count = Collections.frequency(asList, s);
			intArray[j] = count + "";
			j++;
			
		}
		List<String> list = new ArrayList<String>();

	    for(String s : intArray) {
	       if(s != null && s.length() > 0) {
	          list.add(s);
	       }
	    }
	    
	    intArray = list.toArray(new String[list.size()]);
	    Integer[] indexArray = new Integer[intArray.length];
	    String[] copyArray = intArray;
	    for (int k = 0; k <= copyArray.length - 1; k++) {
		    int max = 0;
		    for (int i = 0; i <= intArray.length - 1; i++) {
		    	if (Integer.parseInt(intArray[i]) > max) {
		    		max = Integer.parseInt(intArray[i]);
		    	}
		    }
			int index = Arrays.asList(copyArray).indexOf(String.valueOf(max));
			indexArray[k] = index;
			try {
				intArray = ArrayUtils.remove(intArray, index);
			} catch(Exception e) {
				;
			}
	    }
		Integer[] copyArray2 = indexArray;
		int remove;
		for(int i = 0; i < copyArray2.length; i++) {  
	         for(int p = i + 1; p < copyArray2.length; p++) {  
	             if(copyArray2[i] == copyArray2[p])  {
	                 remove = copyArray2[p];  
	                 remove = Arrays.asList(copyArray2).indexOf(remove);
	                 try {
	     				indexArray = ArrayUtils.remove(indexArray, remove);
	     			} catch(Exception e) {
	     				;
	     			}
	            }  
	        }  
		}
		String result = "";
		for (int n : indexArray) {
			result += myList.get(n) + " ";
		}
		for (int m : indexArray) {
			myList.remove(m);
		}
		System.out.println(myList);
		Collections.reverse(myList);
		for (String u : myList) {
			result += u + " ";
		}
		System.out.println(result);
	}
}
