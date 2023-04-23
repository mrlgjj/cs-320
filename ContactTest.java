package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345", "Larry", "Jones", "5558944125", "112 Mockingbird Lane");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("Larry"));
		assertTrue(contact.getLastName().equals("Jones"));
		assertTrue(contact.getPhone().equals("5558944125"));
		assertTrue(contact.getAddress().equals("112 Mockingbird Lane"));
	}

	// Test for contact ID too long
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Larry", "Jones", "5558944125", "112 Mockingbird Lane");
		});		
	}

	// Test for first name too long
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Laurencethy", "Jones", "5558944125", "112 Mockingbird Lane");
		});		
	}

	// Test for last name too long
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", "Jonesonheim", "5558944125", "112 Mockingbird Lane");
		});		
	}

	// Test for phone number too short
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", "Jones", "555894412", "112 Mockingbird Lane");
		});		
	}

	// Test for phone number too long
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", "Jones", "55589441255", "112 Mockingbird Lane");
		});		
	}

	// Test for address too long
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", "Jones", "5558944125", "112 South Supercalifragilistic Ave");
		});		
	}

	// Test for contact ID is null
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Larry", "Jones", "5558944125", "112 Mockingbird Lane");
		});		
	}

	// Test for first name is null
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Jones", "5558944125", "112 Mockingbird Lane");
		});		
	}

	// Test for last name is null
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", null, "5558944125", "112 Mockingbird Lane");
		});		
	}

	// Test for phone number is null
	@Test
	void testPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", "Jones", null, "112 Mockingbird Lane");
		});		
	}

	// Test for address is null
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Larry", "Jones", "5558944125", null);
		});		
	}	
}
	

	
	