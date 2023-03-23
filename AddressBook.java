import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AddressBook {
	private String name;
	private Contact[] contacts = new Contact[100];
	private int contactCount = 0; 
	
	public AddressBook(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addContact(String name, String phone, String relation, String location) {
		contacts[contactCount] = new FamilyMember(name, phone, relation, location);
		++contactCount;
	}
	
	public void addContact(String name, String phone, String title) {
		contacts[contactCount] = new WorkContact(name, phone, title);
		++contactCount;
	}
	
	public void loadContacts(String fileName) {
		try {
			File file = new File(fileName);
			if (!file.exists()) {
				file = new File("src/" + fileName);
			}
			
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				String[] thisLine = scanner.nextLine().split(",");
				
				if (thisLine.length == 4) {
					addContact(thisLine[0], thisLine[2], thisLine[1], thisLine[3]);
				}
				
				if (thisLine.length == 3) {
					addContact(thisLine[0], thisLine[2], thisLine[1]);
				}
			}
			
			scanner.close();
		} catch (FileNotFoundException error) {
			System.out.println(error);
		}
	}
	
	public String toString() {
		String r = "";
		
		r += this.name + "\n---------------\n";
		for (Contact contact: contacts) {
			if (contact != null)
				r += contact + "\n";
		}
		
		return r;
	}
}
