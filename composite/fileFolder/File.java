package composite.fileFolder;

public class File extends Composant {

	public File(String name) {
		super(name);
		
	}

	@Override
	public void show() {
		System.out.println(tab()+"File :"+name);
		
	}

}
