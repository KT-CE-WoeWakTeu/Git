package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class); 
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new HashSet<DomainObject>();		
		
		objectSet.add(new DomainObject("Helga"));
		objectSet.add(new DomainObject("Walter"));
		objectSet.add(new DomainObject("Hans"));
		objectSet.add(new DomainObject("Paul"));
		objectSet.add(new DomainObject("Claudia"));
		
		for (DomainObject domainObject : objectSet){
			LOGGER.debug(domainObject.id);
		}	
		
	}

}
