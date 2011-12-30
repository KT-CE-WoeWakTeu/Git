package at.jku.ce;

public class DomainObject {

	/** * Default constructor */
	
	public DomainObject() {
		super();
	}

	public DomainObject(String id) { 
		super(); 
		this.id = id; 
	}
	
	public String getId(){
		return id;
	}

}
