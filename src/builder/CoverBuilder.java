package builder;
import java.util.*;
public abstract class CoverBuilder {
	String name;
	List<String> materials = new ArrayList<String>();

	public abstract CoverBuilder addAbcPlastic();
	public abstract CoverBuilder addAcrylic();
	public abstract CoverBuilder addNylon();
	public abstract CoverBuilder addPVC();
	public abstract CoverBuilder addZinc();
	public abstract CoverBuilder addNickel();
	public abstract CoverBuilder addCopper();

	public DiskCover build() {
		DiskCover diskCover = new DiskCover();
		diskCover.setName(this.name);
		diskCover.addMaterials(materials);
		return diskCover;
	}


}
