package composite.fileFolder;

public class testComposite {

	public static void main(String[] args) {
		
   Folder root=new Folder("design patterns");
 Folder f1=(Folder)root.addComposnat(new Folder("Comportement"));
 Folder f2=(Folder)root.addComposnat(new Folder("Structure"));
 Folder f3=(Folder)root.addComposnat(new Folder("Creation"));
   
   f1.addComposnat(new File("Strategy"));
   f1.addComposnat(new File("Observer"));
   f2.addComposnat(new File("Decorator"));
   f2.addComposnat(new File("Composite"));
   f3.addComposnat(new File("Singleton"));
   f3.addComposnat(new File("Builder"));
   Folder f21=(Folder)f2.addComposnat(new Folder("Str21"));
   f21.addComposnat(new File("file211"));
   root.show();
   
   
   
	}

}
