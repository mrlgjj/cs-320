package contact;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName; 
	private String phone;
	private String address; 
	
	//Set conditions
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID, must be 10 characters or less");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name, must be 10 characters or less");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name, must be 10 characters or less");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number, must be exactly 10 characters");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address, 30 characters or less");
		}	
	}
	
	//Getters & Setters
	public String getContactId() {
		return contactId; 
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName; 
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone; 
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address; 
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

