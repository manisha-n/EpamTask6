package com.epam.EpamTask6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class List<T> {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		List<Integer> a_list=new List<Integer>();
		int res=0;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("Operations on list");
		System.out.println("1.Fetch\n2.Add \n3.Remove\n4.Display\n5.Quit\n");
		int n=Integer.parseInt(reader.readLine());
		
		switch(n) {
		case 1: System.out.println("Enter the index of the element to be fetched");
		        int v=Integer.parseInt(reader.readLine());
			    res=a_list.fetch(v);
			    System.out.println("The fetched element is"+ res );
			    break;
		case 2: System.out.println("Enter the element to be added to list");
        		int u=Integer.parseInt(reader.readLine());
        		a_list.add(u);
        		System.out.println("The new list after adding the element is");
        		a_list.display();
        		break;
		case 3: System.out.println("Enter the index of the element to be removed");
        		int b=Integer.parseInt(reader.readLine());
        		res=a_list.remove(b);
        		System.out.println("The fetched element is"+ res );
        		break;
		case 4: a_list.display();
	            break;
		case 5:System.exit(0);
	            		
		
		}

	}
	}

	private int remove(int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

	private void add(int u) {
		// TODO Auto-generated method stub
		
	}

	private int fetch(int v) {
		// TODO Auto-generated method stub
		return 0;
	}
}


