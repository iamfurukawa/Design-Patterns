package Creational.Builder;

public class Computer {

	private String processor;
	private int ram;
	private String graphicCard;
	private int disk;
	private String brand;

	static class Builder {

		private String processor;
		private int ram;
		private String graphicCard;
		private int disk;
		private String brand;

		public Builder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}

		public Builder setRam(int ram) {
			this.ram = ram;
			return this;
		}

		public Builder setGraphicCard(String graphicCard) {
			this.graphicCard = graphicCard;
			return this;
		}

		public Builder setDisk(int disk) {
			this.disk = disk;
			return this;
		}

		public Builder setBrand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}

	public Computer(final Builder builder) {
		this.processor = builder.processor;
		this.ram = builder.ram;
		this.graphicCard = builder.graphicCard;
		this.disk = builder.disk;
		this.brand = builder.brand;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRam() {
		return ram;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public int getDisk() {
		return disk;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", ram=" + ram + ", graphicCard=" + graphicCard + ", disk=" + disk
				+ ", brand=" + brand + "]";
	}
}
