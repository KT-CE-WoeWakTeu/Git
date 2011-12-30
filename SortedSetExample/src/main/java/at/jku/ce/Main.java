package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class); 
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());	
		
		objectSet.add(DomainFactory.createDomainObject("Helga","Ein Kommentar"));
		objectSet.add(nDomainFactory.createDomainObject("Walter","Ein Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Hans","Ein Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Paul","Ein Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Claudia","Ein Kommentar"));
		 
		for (DomainObject domainObject : objectSet){
			LOGGER.debug(domainObject.toString());
		}	
		
	}

}
