package contact;

import static org.junit.jupiter.api.Assertions.*;

import contact.ContactService;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// Test for adding contact
	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		
		Contact contact = new
		Contact("12345", "Larry", "Jones", "5558944125", "112 Mockingbird Lane");
		assertEquals(true, contactService.addContact(contact));
	}
	
	// Test for removing contact
	@Test
	void testRemoveContact() throws Exception {
		ContactService contactService = new ContactService();
		
		Contact contact = new Contact ( "12345", "Larry", "Jones", "5558944125", "112 Mockingbird Lane"); 
		Contact contact1 = new Contact("1234567890", "Harold", "Smith", "5558675309","113 South Shore Drive");
		Contact contact2 = new Contact("1234567891", "Janice", "McMannis", "5558953618", "114 North Lake Blvd");
		Contact contact3 = new Contact("1234567892", "James", "Buford", "555134567", "115 Granny Smith Way");
		Contact contact4 = new Contact("1234567993", "Henry", "Bellmont", "5558941289","116 Stapleton Court");
		
		assertEquals(false, contactService.removeContact("123456789"));
		assertEquals(false, contactService.removeContact("242342343"));
		assertEquals(false, contactService.removeContact("424234234"));		
	}
	
	// Test for updating contact
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		
		Contact contact1 = new 
				Contact("1234567890", "Harold", "Smith", "5558675309","113 South Shore Drive");
		Contact contact2 = new
				Contact("1234567891", "Janice", "McMannis", "5558953618", "114 North Lake Blvd");
		Contact contact3 = new
				Contact("1234567892", "James", "Buford", "555134567", "115 Granny Smith Way");
		Contact contact4 = new
				Contact("1234567993", "Henry", "Bellmont", "5558941289","116 Stapleton Court");
		
		contactService.addContact(contact1);
		contactService.addContact(contact2);
		contactService.addContact(contact3);
		contactService.addContact(contact4);	
	}
}
