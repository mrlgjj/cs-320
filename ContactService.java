package contact;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<Contact> contactList;
	public ContactService() {
		contactList = new ArrayList<>();
	}

	// Add contact
	public boolean addContact(Contact contact) {
		boolean contactExists = false; 
		for (Contact list:contactList) {
			if (list.equals(contact)) {
				contactExists = true;
			}
		}
		if (!contactExists) {
			contactList.add(contact);
				return true; 
		}
		else {
				return false;
		}
	}
	
	// Remove contact
	public boolean removeContact(String contactId) {
		for (Contact list:contactList) {
			if (list.getContactId().equals(contactId)) {
				contactList.remove(list);
				return true; 
			}			
		}
		return false; 
	}
	
}
