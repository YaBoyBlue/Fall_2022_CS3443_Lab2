public class FamilyMember extends Contact {
	private String relation;
	private String location;
	
	public FamilyMember(String name, String phone, String relation, String location) {
		super(name, phone);
		this.relation = relation;
		this.location = location;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public String getRelation() {
		return this.relation;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s, %s): %s", this.getName(), this.relation, this.location, this.getPhone());
	}
}