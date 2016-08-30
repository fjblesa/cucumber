package cucumber;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public Calculator(){
	}
	private static Integer result = 0;
	private static List<Integer> listNumbers = new ArrayList<Integer>();

	public void add(Integer... numbers) {
		for (Integer num : numbers) {
			listNumbers.add(num);	
		}
	}

	public Integer getResult() {
		return result;
	}
	
	public void sum(){
		for (Integer num : listNumbers) {
			result = result + num;
		}
	}

	public void minus(Integer number) {
		for (Integer num : listNumbers) {
			result = result - num;
		}
	}
}
