package edu.najah.cap.ass3;
import java.util.*;
import java.util.ArrayList;
@SuppressWarnings("unused")

public class Singleton {
		private static Singleton instance = null; 
		private Singleton() {	
		}
		public static Singleton getInstance() {
			if(instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
}
