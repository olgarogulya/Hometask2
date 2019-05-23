package by.epam.training.hometask02;

//Создайте класс Payment (покупка), сформируйте покупку из нескольких товаров. 
//(Помните, что вы решаете задачу с использование ООП подхода – т.е. создавайте нужные для решения классы с подходящими методами, 
//а не пишите процедурный код в одном методе, или даже в нескольких, но статических.)

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product("computer", 800.0, 10.0, "black", "ASUS");
		Product product2 = new Product("notebook", 1165.9, "white", "Apple");
		Product product3 = new Product("keyboard", 150.0, 25.0, "black", "Logitech");
		Product product4 = new Product("mouse", 19.5, 15.0, "black", "Logitech");
		Product product5 = new Product("adapter", 195, "black", "D-LINK");

		Payment cart = new Payment(6);
		cart.add(product1);
		cart.add(product2);
		cart.add(product2);
		cart.add(product3);
		cart.add(product4);
		cart.add(product5);
		cart.remove(product2);
		cart.totalPrice(cart);

//	System.out.println(cart);
//	System.out.println(cart.totalPrice(cart));
//	System.out.println(cart.getCountOfProducts()); 

		System.out.println("                                  Payment");
		System.out.println("---------------------------------------------------------------------------");
		for (int i = 0; i < cart.getCountOfProducts(); i++) {
			System.out.println(cart.getProduct(i));
			System.out.println("---------------------------------------------------------------------------");
		}
		System.out.println("Total number of products                         " + cart.getCountOfProducts());
		System.out.println("Total price                                      " + cart.totalPrice(cart));
	}

}
