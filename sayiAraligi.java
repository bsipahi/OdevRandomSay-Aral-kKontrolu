package com.bilgeadam.odev1;

import java.util.Random;

public class sayiAraligi {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int rastgeleDeger = rand.nextInt(100);
		
		if (rastgeleDeger<=24) {
			System.out.println(rastgeleDeger+" => Sayý 0 - 24 aralýðýndadýr");
		} else if (rastgeleDeger>=25 && rastgeleDeger<=49) {
			System.out.println(rastgeleDeger+" => Sayý 25 - 49 aralýðýndadýr");
		} else if (rastgeleDeger>=50 && rastgeleDeger<= 74) {
			System.out.println(rastgeleDeger+" => Sayý 50 - 74 aralýðýndadýr");
		}else {
			System.out.println(rastgeleDeger+" => Sayý 75 - 100 aralýðýndadýr");
		}
	}

}
