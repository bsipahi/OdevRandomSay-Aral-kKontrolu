package com.bilgeadam.odev1;

import java.util.Random;

public class sayiAraligi {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int rastgeleDeger = rand.nextInt(100);
		
		if (rastgeleDeger<=24) {
			System.out.println(rastgeleDeger+" => Say� 0 - 24 aral���ndad�r");
		} else if (rastgeleDeger>=25 && rastgeleDeger<=49) {
			System.out.println(rastgeleDeger+" => Say� 25 - 49 aral���ndad�r");
		} else if (rastgeleDeger>=50 && rastgeleDeger<= 74) {
			System.out.println(rastgeleDeger+" => Say� 50 - 74 aral���ndad�r");
		}else {
			System.out.println(rastgeleDeger+" => Say� 75 - 100 aral���ndad�r");
		}
	}

}
