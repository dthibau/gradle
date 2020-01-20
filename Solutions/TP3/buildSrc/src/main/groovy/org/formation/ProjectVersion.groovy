package org.formation;

class ProjectVersion implements Serializable {

	private int minorNumber, majorNumber;
	private String classifier;
	
	public ProjectVersion() {
	}
	
	public ProjectVersion(int majorNumber, int minorNumber, String classifier) {
		this.minorNumber = minorNumber
		this.majorNumber = majorNumber
		this.classifier = classifier
	}
	
	public String toString() {
		return "" + majorNumber + "." + minorNumber + "-" + classifier
	}
}