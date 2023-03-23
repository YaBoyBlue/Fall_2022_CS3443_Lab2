public class WorkContact extends Contact {
	private String title;
	
	public WorkContact(String name, String phone, String title) {
		super(name, phone);	
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s): %s", this.getName(), this.title, this.getPhone());
	}
}