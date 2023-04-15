package co.edu.poli.facadeNo2.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import co.edu.poli.facadeNo1.model.MobileShopInterface;
import co.edu.poli.facadeNo1.model.Intermediate_Class;


public class Client {
	 private static int choice;

	    public static void main(String args[]) throws NumberFormatException, IOException {
	        Intermediate_Class intermediate = new Intermediate_Class();

	        // One event does this activity
	        HashMap<Integer, MobileShopInterface> a = new HashMap<Integer, MobileShopInterface>();
	        a.put(1, intermediate.getIphone());
	        a.put(2, intermediate.getSamsung());
	        a.put(3, intermediate.getBlackberry());

	        // One event does this activity
	        do {
	            System.out.print("========= Mobile Shop ============ \n");
	            System.out.print("            1. IPHONE.              \n");
	            System.out.print("            2. SAMSUNG.              \n");
	            System.out.print("            3. BLACKBERRY.            \n");
	            System.out.print("            4. Exit.                     \n");
	            System.out.print("Enter your choice: ");

	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            choice = Integer.parseInt(br.readLine());

	            ShopKeeper sk = new ShopKeeper(a);

	            switch (choice) {
	            case 1: {
	                System.out.println(sk.getMethods(1));
	            }
	                break;
	            case 2: {
	                System.out.println(sk.getMethods(2));
	            }
	                break;
	            case 3: {
	                System.out.println(sk.getMethods(3));
	            }
	                break;
	            default: {
	                System.out.println("Nothing You purchased");
	            }
	                return;
	            }

	        } while (choice != 4);
	    }
	}