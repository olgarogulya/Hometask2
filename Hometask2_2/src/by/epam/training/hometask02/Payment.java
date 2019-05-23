package by.epam.training.hometask02;

import java.util.ArrayList;
import java.util.List;

public class Payment {

// private int number;
	private List<Product> products;
	private int size;

	public Payment(int size) {
		products = new ArrayList<Product>(size);
		this.size = size;
	}

	public boolean add(Product newProduct) {
		if (products.size() > size) {
			return false;
		}
		products.add(newProduct);
		return true;
	}

	public boolean remove(Product newProduct) {
		if (products.size() < size) {
			return false;
		}
		products.remove(newProduct);
		return true;
	}

	public int getCountOfProducts() {
		return products.size();
	}

	public Product getProduct(int index) {
		if (index >= products.size()) {
			return null;
		}
		return products.get(index);
	}

	public double totalPrice(Payment cart) {
		double totalPrice = 0;

		for (int i = 0; i < cart.getCountOfProducts(); i++) {
			Product product = cart.getProduct(i);
			double prodPrice = product.getPrice();
			if (product.getDiscount() > 0.0) {
				prodPrice = prodPrice - ((prodPrice * product.getDiscount()) / 100.0);
			} else {
				prodPrice = prodPrice;
			}
			totalPrice = totalPrice + prodPrice;
		}

		return totalPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [products=" + products + ", size=" + size + "]";
	}

}