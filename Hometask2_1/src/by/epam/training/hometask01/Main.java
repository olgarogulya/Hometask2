package by.epam.training.hometask01;

/*1. �������� ��������� ���� ������.
Student: id, �������, ���, ��������, ���� ��������, �����, �������, ���������, ����.
Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
�������������� ��� ������ ������� ������ equals � hashCode.*/

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "Petrov", "Sasha", "Ivanovich", new Date(11,12,2019), new Address("Minsk","Kuprevicha", 1, 3), 123456789, "Math", 4);
		Customer ct1 = new Customer(1, "Ivanov", "Vasya", "Petrovich", new Address("Minsk","Zhukova", 29), 23, 987654);
		
		//st1.setStId(1);
		//st1.setStLastName("Petrov");
		//st1.setStFirstName("Sasha");
		//st1.setStPatronymicName("Ivanovich");
		//st1.setStDateOfBirth(11,12,2019);
		//st1.setStAddress("Minsk");
		//st1.setStPhoneNumber(123456789);
		//st1.setFaculty("Math");
		//st1.setYearofStudy(4);
				
		//ct1.setCustomerId(1);
		//ct1.setCustomerLastName("Ivanov");
		//ct1.setCustomerFirstName("Vasya");
		//ct1.setCustomerPatronymicName("Petrovich");
		//ct1.setCustomerAddress("Moscow");
		//ct1.setCustomerCreditCard(23);
		//ct1.setBankAccountNumber(987654);
	
		System.out.println("Student: Id - " + st1.getStId() + ", LastName - " + st1.getStLastName() + ", FirstName - " + st1.getStFirstName() + ", PatronymicName - " + st1.getStPatronymicName() + ", Date of birth - " + st1.getStDateOfBirth() + ", Address - " + st1.getStAddress() + ", PhoneNumber - " + st1.getStPhoneNumber()  + ", Faculty - " + st1.getFaculty() + ", YearofStudy - " + st1.getYearofStudy());
		System.out.println("Customer: Id - " + ct1.getCustomerId() + ", LastName - " + ct1.getCustomerLastName() + ", FirstName - " + ct1.getCustomerFirstName() + ", PatronymicName - " + ct1.getCustomerPatronymicName() + ", Address - " + ct1.getCustomerAddress() + ", CreditCard - " + ct1.getCustomerCreditCard() + ", BankAccountNumber - " + ct1.getBankAccountNumber());

	}

}