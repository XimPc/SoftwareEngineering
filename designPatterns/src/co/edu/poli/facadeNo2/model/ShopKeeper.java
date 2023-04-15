package co.edu.poli.facadeNo2.model;

import java.util.HashMap;

import co.edu.poli.facadeNo1.model.MobileShopInterface;

public class ShopKeeper {

	private HashMap<Integer, MobileShopInterface> arrayMobile;

	public ShopKeeper(HashMap<Integer, MobileShopInterface> a) {
		arrayMobile = a;
	}

	public String getMethods(int serial) {
		return arrayMobile.get(serial).modelNo() + " " +
				arrayMobile.get(serial).price();
	}

}