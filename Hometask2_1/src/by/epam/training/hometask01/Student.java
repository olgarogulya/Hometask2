package by.epam.training.hometask01;

import by.epam.training.hometask01.Date;

//Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.

public class Student {

	private int StId;
	private String StFirstName;
	private String StLastName;
	private String StPatronymicName;
	private Date StDateOfBirth;
	private Address StAddress;
	private int StPhoneNumber;
	private String Faculty;
	private int YearofStudy;

	public Student(int StId, String StFirstName, String StLastName, String StPatronymicName, Date StDateOfBirth, Address StAddress, int StPhoneNumber, String Faculty, int YearofStudy) {
		this.StId = StId;
		this.StFirstName = StFirstName;
		this.StLastName = StLastName;
		this.StPatronymicName = StPatronymicName;
		this.StDateOfBirth = StDateOfBirth;
		this.StAddress = StAddress;
		this.StPhoneNumber = StPhoneNumber;
		this.Faculty = Faculty;
		this.YearofStudy = YearofStudy;
	}

	public int getStId() {
		return StId;
	}

	public void setStId(int stId) {
		StId = stId;
	}

	public String getStFirstName() {
		return StFirstName;
	}

	public void setStFirstName(String stFirstName) {
		StFirstName = stFirstName;
	}

	public String getStLastName() {
		return StLastName;
	}

	public void setStLastName(String stLastName) {
		StLastName = stLastName;
	}

	public String getStPatronymicName() {
		return StPatronymicName;
	}

	public void setStPatronymicName(String stPatronymicName) {
		StPatronymicName = stPatronymicName;
	}

	public Date getStDateOfBirth() {
		return StDateOfBirth;
	}

	public void setStDateOfBirth(Date stDateOfBirth) {
		StDateOfBirth = stDateOfBirth;
	}

	public Address getStAddress() {
		return StAddress;
	}

	public void setStAddress(Address stAddress) {
		StAddress = stAddress;
	}

	public int getStPhoneNumber() {
		return StPhoneNumber;
	}

	public void setStPhoneNumber(int stPhoneNumber) {
		StPhoneNumber = stPhoneNumber;
	}

	public String getFaculty() {
		return Faculty;
	}

	public void setFaculty(String faculty) {
		Faculty = faculty;
	}

	public int getYearofStudy() {
		return YearofStudy;
	}

	public void setYearofStudy(int yearofStudy) {
		YearofStudy = yearofStudy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Faculty == null) ? 0 : Faculty.hashCode());
		result = prime * result + ((StAddress == null) ? 0 : StAddress.hashCode());
		result = prime * result + ((StDateOfBirth == null) ? 0 : StDateOfBirth.hashCode());
		result = prime * result + ((StFirstName == null) ? 0 : StFirstName.hashCode());
		result = prime * result + StId;
		result = prime * result + ((StLastName == null) ? 0 : StLastName.hashCode());
		result = prime * result + ((StPatronymicName == null) ? 0 : StPatronymicName.hashCode());
		result = prime * result + StPhoneNumber;
		result = prime * result + YearofStudy;
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
		Student other = (Student) obj;
		if (Faculty == null) {
			if (other.Faculty != null)
				return false;
		} else if (!Faculty.equals(other.Faculty))
			return false;
		if (StAddress == null) {
			if (other.StAddress != null)
				return false;
		} else if (!StAddress.equals(other.StAddress))
			return false;
		if (StDateOfBirth == null) {
			if (other.StDateOfBirth != null)
				return false;
		} else if (!StDateOfBirth.equals(other.StDateOfBirth))
			return false;
		if (StFirstName == null) {
			if (other.StFirstName != null)
				return false;
		} else if (!StFirstName.equals(other.StFirstName))
			return false;
		if (StId != other.StId)
			return false;
		if (StLastName == null) {
			if (other.StLastName != null)
				return false;
		} else if (!StLastName.equals(other.StLastName))
			return false;
		if (StPatronymicName == null) {
			if (other.StPatronymicName != null)
				return false;
		} else if (!StPatronymicName.equals(other.StPatronymicName))
			return false;
		if (StPhoneNumber != other.StPhoneNumber)
			return false;
		if (YearofStudy != other.YearofStudy)
			return false;
		return true;
	}

	

}