package model;

public class Client {

	private String documentType;
	private String Id;

	/**
	 * 
	 * @param documentType
	 * @param Id
	 */
	public Client(String documentType, String Id) {
		this.documentType = documentType;
		this.Id = Id;
	}

	public String getDocumentType() {
		return this.documentType;
	}

	/**
	 * 
	 * @param documentType
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getId() {
		return Id;
	}

	/**
	 * 
	 * @param Id
	 */
	public void setId(String Id) {
		this.Id = Id;
	}

}