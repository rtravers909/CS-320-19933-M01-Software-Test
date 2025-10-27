package contact;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	//use this boolean to make sure that the string is not more than 10 digits or null
	private final boolean validateId(String contactId) {
		if(contactId == null || contactId.length() > 10){
			return false;
		}
		return true;
	}
	
	//use this boolean to make sure that the lasttName string is not more than 10 digits or null
	private final boolean validateLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			return false;
		}
		return true;
	}
	//use this boolean to make sure that the firstName string is not more than 10 digits or null
	private final boolean validateFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			return false;
		}
		return true;
	}
	//use this boolean to make sure that the lasttName string is exactly 10 digits and not null
	private final boolean validatePhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {
			return false;
		}
		return true;
	}
	
	//use this boolean to make sure that the address string is not more than 30 digits or null
	private final boolean validateAddress(String address) {
		if(address == null || address.length() > 30) {
			return false;
		}
		return true;
	}
	
	//way to store information or send user message that input is invalid
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if(!this.validateId(contactId)) {
			throw new IllegalArgumentException("Invalid contact Id");
		}
		
		if(!this.validateLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if(!this.validatePhoneNumber(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	//create get and set functions for each attribute
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(!this.validateLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if(!this.validatePhoneNumber(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}	
		this.address = address;
	}
	
	
	//method to check for contactId uniqueness
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Contact contact = (Contact) obj;
		// Uniqueness is determined by the contactId
		return Objects.equals(contactId, contact.contactId);
	}
	@Override
	public int hashCode() {
		// Use Objects.hash() based on the field(s) used in equals()
		return Objects.hash(contactId);
	}
}
