package com.demo.arrays;

public class Sample {
	
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", description=" + description
				+ ", testCenter=" + testCenter + "]";
	}

	private int sampleId;
	
	private String sampleName;
	
	private String description;
	
	private String testCenter;

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public Sample(int sampleId, String sampleName, String description, String testCenter) {
		super();
		this.sampleId = sampleId;
		this.sampleName = sampleName;
		this.description = description;
		this.testCenter = testCenter;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTestCenter() {
		return testCenter;
	}

	public void setTestCenter(String testCenter) {
		this.testCenter = testCenter;
	}

}
