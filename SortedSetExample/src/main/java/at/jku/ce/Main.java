package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class); 
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new HashSet<DomainObject>();		
		
		objectSet.add(new DomainObject("Helga","Ein Kommentar"));
		objectSet.add(new DomainObject("Walter","Ein Kommentar"));
		objectSet.add(new DomainObject("Hans","Ein Kommentar"));
		objectSet.add(new DomainObject("Paul","Ein Kommentar"));
		objectSet.add(new DomainObject("Claudia","Ein Kommentar"));
		 
		for (DomainObject domainObject : objectSet){
			LOGGER.debug(domainObject.getUuid);
		}	
		
	}

}
