package composite.fileFolder;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant {
    private List<Composant> childs=new ArrayList<Composant>();
	public Folder(String name) {
		super(name);
		
	}
	public Composant addComposnat(Composant c){
		childs.add(c);
		c.level+=this.level+1;
		return c;
	}

	@Override
	public void show() {
		System.out.println(tab()+"Folder :"+name);
		for (Composant c : childs) {
			c.show();
		}
	}

}
