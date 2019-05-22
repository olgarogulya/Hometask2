package by.epam.training.hometask01;

public class Customer {
	private int CustomerId;
	private String CustomerLastName;
	private String CustomerFirstName;
	private String CustomerPatronymicName;
	private Address CustomerAddress;
	private int CustomerCreditCard;
	private int BankAccountNumber;
	
	public Customer(int CustomerId, String CustomerLastName, String CustomerFirstName, String CustomerPatronymicName, Address CustomerAddress, int CustomerCreditCard, int BankAccountNumber) {
		this.CustomerId = CustomerId;
		this.CustomerLastName = CustomerLastName;
		this.CustomerFirstName = CustomerFirstName;
		this.CustomerPatronymicName = CustomerPatronymicName;
		this.CustomerAddress = CustomerAddress;
		this.CustomerCreditCard = CustomerCreditCard;
		this.BankAccountNumber = BankAccountNumber;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerLastName() {
		return CustomerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		CustomerLastName = customerLastName;
	}

	public String getCustomerFirstName() {
		return CustomerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		CustomerFirstName = customerFirstName;
	}

	public String getCustomerPatronymicName() {
		return CustomerPatronymicName;
	}

	public void setCustomerPatronymicName(String customerPatronymicName) {
		CustomerPatronymicName = customerPatronymicName;
	}

	public Address getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		CustomerAddress = customerAddress;
	}

	public int getCustomerCreditCard() {
		return CustomerCreditCard;
	}

	public void setCustomerCreditCard(int customerCreditCard) {
		CustomerCreditCard = customerCreditCard;
	}

	public int getBankAccountNumber() {
		return BankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		BankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BankAccountNumber;
		result = prime * result + ((CustomerAddress == null) ? 0 : CustomerAddress.hashCode());
		result = prime * result + CustomerCreditCard;
		result = prime * result + ((CustomerFirstName == null) ? 0 : CustomerFirstName.hashCode());
		result = prime * result + CustomerId;
		result = prime * result + ((CustomerLastName == null) ? 0 : CustomerLastName.hashCode());
		result = prime * result + ((CustomerPatronymicName == null) ? 0 : CustomerPatronymicName.hashCode());
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
		Customer other = (Customer) obj;
		if (BankAccountNumber != other.BankAccountNumber)
			return false;
		if (CustomerAddress == null) {
			if (other.CustomerAddress != null)
				return false;
		} else if (!CustomerAddress.equals(other.CustomerAddress))
			return false;
		if (CustomerCreditCard != other.CustomerCreditCard)
			return false;
		if (CustomerFirstName == null) {
			if (other.CustomerFirstName != null)
				return false;
		} else if (!CustomerFirstName.equals(other.CustomerFirstName))
			return false;
		if (CustomerId != other.CustomerId)
			return false;
		if (CustomerLastName == null) {
			if (other.CustomerLastName != null)
				return false;
		} else if (!CustomerLastName.equals(other.CustomerLastName))
			return false;
		if (CustomerPatronymicName == null) {
			if (other.CustomerPatronymicName != null)
				return false;
		} else if (!CustomerPatronymicName.equals(other.CustomerPatronymicName))
			return false;
		return true;
	}
	
	
}
