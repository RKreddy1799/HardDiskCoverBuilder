package builder;

public class MetallicCoverBuilder extends CoverBuilder{
	public MetallicCoverBuilder() {
		this.name = "Metallic Cover";
	}
	public  CoverBuilder addAbcPlastic() {
//		this.materials.add("ABC plastic");
		return this;
	}
	public CoverBuilder addAcrylic() {
//		this.materials.add("Acrylic");
		return this;
	}
	public CoverBuilder addNylon() {
//		this.materials.add("Nylon");
		return this;
	}
	public CoverBuilder addPVC() {
//		this.materials.add("PVC");
		return this;
	}
	public CoverBuilder addZinc() {
		this.materials.add("Zinc");
		return this;
	}
	public CoverBuilder addNickel() {
		this.materials.add("NIckel");
		return this;
	}
	public CoverBuilder addCopper() {
		this.materials.add("Copper");
		return this;
	}
}