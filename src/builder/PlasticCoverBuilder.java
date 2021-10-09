package builder;

public class PlasticCoverBuilder extends CoverBuilder{
	public PlasticCoverBuilder() {
		this.name = "Plastic Cover";
	}
	public  CoverBuilder addAbcPlastic() {
		this.materials.add("ABC plastic");
		return this;
	}
	public CoverBuilder addAcrylic() {
		this.materials.add("Acrylic");
		return this;
	}
	public CoverBuilder addNylon() {
		this.materials.add("Nylon");
		return this;
	}
	public CoverBuilder addPVC() {
		this.materials.add("PVC");
		return this;
	}
	public CoverBuilder addZinc() {
		return this;
	}
	public CoverBuilder addNickel() {

		return this;
	}
	public CoverBuilder addCopper() {

		return this;
	}
}
