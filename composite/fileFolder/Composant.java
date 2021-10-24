package composite.fileFolder;

public  abstract class Composant {
	
public Composant(String name) {
		this.name = name;
	}
protected String name;
protected int level=0;
public abstract void show();
public String tab(){
	String tab="";
	for (int i = 0; i < level; i++) {
		tab+="\t";
	}
	return tab;
}
}
