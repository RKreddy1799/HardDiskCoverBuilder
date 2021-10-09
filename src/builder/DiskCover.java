package builder;
import java.util.*;
public class DiskCover {
	String name;
	List<String> materials;
	public void addMaterials(List<String> materials) {
		this.materials = materials;
	}

	void prepare() {
		System.out.println("Prepare " + name );
		System.out.println("Materials to make disk covers");
		for(String material : materials) {
			System.out.println("   " + material);
		}

	}
    void heat() {
    	System.out.println("heating");
    }
    void drawing(){
    	System.out.println("drawing");
    }
    void extrusion(){
    	System.out.println("extrusion");
    }
    void forging(){
    	System.out.println("forging");
    }
    void rolling(){
    	System.out.println("rolling");
    }
	void pack() {
		System.out.println("Packing " + name);
	}
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----");
		for(String material : materials) {
			display.append(material + "\n");
		}
		return display.toString();
	}

}
