package test;

import java.util.function.Function;

public class Test  {
	
	int x = 0;
	
	Function<Integer,Integer> f = (y) -> {
		int x = 100;
		return 100;
	};
	
	public static void main(String[] args) {
		System.out.println(new Test());;
	}

}
