package by.epam.training.hometask01;

/*1. Создайте описанные ниже классы.
Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
Переопределите для данных классов методы equals и hashCode.*/

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "Petrov", "Sasha", "Ivanovich", new Date(11,12,2019), new Address("Minsk","Kuprevicha", 1, 3), 123456789, "Math", 4);
		Customer ct1 = new Customer(1, "Ivanov", "Vasya", "Petrovich", new Address("Minsk","Zhukova", 29), 23, 987654);
		
			
		System.out.println("Student: Id - " + st1.getStId() + ", LastName - " + st1.getStLastName() + ", FirstName - " + st1.getStFirstName() + ", PatronymicName - " + st1.getStPatronymicName() + ", Date of birth - " + st1.getStDateOfBirth() + ", Address - " + st1.getStAddress() + ", PhoneNumber - " + st1.getStPhoneNumber()  + ", Faculty - " + st1.getFaculty() + ", YearofStudy - " + st1.getYearofStudy());
		System.out.println("Customer: Id - " + ct1.getCustomerId() + ", LastName - " + ct1.getCustomerLastName() + ", FirstName - " + ct1.getCustomerFirstName() + ", PatronymicName - " + ct1.getCustomerPatronymicName() + ", Address - " + ct1.getCustomerAddress() + ", CreditCard - " + ct1.getCustomerCreditCard() + ", BankAccountNumber - " + ct1.getBankAccountNumber());

	}

}
