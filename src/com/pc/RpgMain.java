package com.pc;

import java.util.ArrayList;

import com.pc.weapon.Stick;
import com.pc.weapon.Sword;

import java.util.ArrayList;

public class RpgMain {

	public static void main(String[] args) {
		
		Worrier w = new Worrier();
		Magition m = new Magition();
		Sword s = new Sword();
		s.setName("단검");
		s.setDamage(10);
		
		Stick st = new Stick();
		st.setName("나무지팡이");
		
//		w.setWeapon(s);
//		
//		w.getWeapon().attack();
//		w.setWeapon(st);
//		w.getWeapon().attack();
		
		//System.out.println(w.getSword().getName());
		
		
		

	}

}
