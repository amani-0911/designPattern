package decorator.starBuzzCofe;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindStartBussCofe extends Application {
	decorator.starBuzzCofe.composant.Boisson b;
/*public static void main(String[] args)   {
	Boisson b=new Expresso();
	System.out.println(b.getDescription());
	System.out.println("prix: "+b.cout());
	System.out.println("--------------------");
 b=new Chocolat(b);
 System.out.println(b.getDescription());
	System.out.println("prix: "+b.cout());
	
	System.out.println("--------------------");
b=new Vanille(b);
System.out.println(b.getDescription());
System.out.println("prix: "+b.cout());


}*/
private  VBox root=new VBox();
private  HBox global=new HBox();
private Scene scene=new Scene(root);
Label titleLabel =new Label("Commandeer");


VBox composant =new VBox();
VBox details =new VBox();

//Composant
Label composantLabel =new Label("Selectioner votre cafe");
HBox listComposant =new HBox();


Button Deca=new Button("Deca");
Button Expresso=new Button("Expresso");
Button Sumatra=new Button("Sumatra");
Button Thea=new Button("Thea");
//Decorator
Label DecoratorLabel =new Label("Selectioner votre Supplement");
HBox listDecarator =new HBox();

Button Caramel=new Button("Caramel");
Button Chantilly=new Button("Chantilly");
Button Chocolat=new Button("Chocolat");
Button Vanille=new Button("Vanille");
//detail
Label titleLabellisttotal=new Label("Reglement de commande");


Label detailsLabel=new Label("deatlsCommande");
VBox lablell=new VBox();
Label boissonlabel=new Label("");
Label caramelLabel=new Label("");
Label chocolatLabel=new Label("");
Label vanillaLabel=new Label("");
Label chantillyLabel=new Label("");

HBox totalbox=new HBox();
Label totalLabel=new Label("prix Total:");
Label totalLabelValue=new Label("0.0");
int nbCaramel,nbChantilly,nbChocolat,nbVanille;
private void createMenu() {
	listComposant.getChildren().addAll( Deca,Expresso,Sumatra,Thea);
	listDecarator.getChildren().addAll(Caramel,Chantilly, Chocolat,Vanille);
	composant.getChildren().addAll(composantLabel,listComposant,DecoratorLabel,listDecarator);
	//detals
	totalbox.getChildren().addAll(totalLabel,totalLabelValue);
	 lablell.getChildren().addAll(boissonlabel, caramelLabel,chocolatLabel,vanillaLabel,chantillyLabel);
	details.getChildren().addAll(titleLabellisttotal,totalbox,detailsLabel,lablell);
	global.getChildren().addAll(composant,details);
	root.getChildren().add(global);
	
} 
private void addStylesToNodes() {
	
	listComposant.setSpacing(5);
	listDecarator.setSpacing(5);
	global.setSpacing(15);
	global.setPadding(new  Insets(10, 10, 10, 10));
	titleLabellisttotal.getStyleClass().add("labelTitle");
	DecoratorLabel.getStyleClass().add("labelTitle");
	composantLabel.getStyleClass().add("labelTitle");
	
}


private void addEvents() {
	 Expresso.setOnAction(e->{
		 b=new decorator.starBuzzCofe.composant.Expresso();
		 totalLabelValue.setText(b.cout()+"");
		 boissonlabel.setText(b.getDescription());
	 });
	 Deca.setOnAction(e->{
		 b=new decorator.starBuzzCofe.composant.Deca();
		 totalLabelValue.setText(b.cout()+"");
		 boissonlabel.setText(b.getDescription());
	 });
	
	 Sumatra.setOnAction(e->{
		 b=new decorator.starBuzzCofe.composant.Sumatra();
		 totalLabelValue.setText(b.cout()+"");
		 boissonlabel.setText(b.getDescription());
	 });
	 Thea.setOnAction(e->{
		 b=new decorator.starBuzzCofe.composant.Thea();
		 totalLabelValue.setText(b.cout()+"");
		 boissonlabel.setText(b.getDescription());
	 });
	 
	 
	 //decorator  caramelLabel,chocolatLabel,vanillaLabel,chantillyLabel)
	 Caramel.setOnAction(e->{
		 b=new decorator.starBuzzCofe.decorator.Caramel(b);
		 totalLabelValue.setText(b.cout()+"");
		 caramelLabel.setText(nbCaramel==0?b.getDescription():nbCaramel+"X"+b.getDescription());
		 nbCaramel++;
	 });
	 Chocolat.setOnAction(e->{
		 b=new decorator.starBuzzCofe.decorator.Chocolat(b);
		 totalLabelValue.setText(b.cout()+"");
		 chocolatLabel.setText(nbChocolat==0?b.getDescription():nbChocolat+"X"+b.getDescription());
		 nbChocolat++;
	 });
	 Chantilly.setOnAction(e->{
		 b=new decorator.starBuzzCofe.decorator.Chantilly(b);
		 totalLabelValue.setText(b.cout()+"");
		 chantillyLabel.setText(nbChantilly==0?b.getDescription():nbChantilly+"X"+b.getDescription());
		 nbChantilly++;
	 });
	 Vanille.setOnAction(e->{
		 b=new decorator.starBuzzCofe.decorator.Vanille(b);
		 totalLabelValue.setText(b.cout()+"");
		 vanillaLabel.setText(nbVanille==0?b.getDescription():nbVanille+"X"+b.getDescription());
		 nbVanille++;
	 });

	
}


public void start(Stage window) throws Exception {
	createMenu();
	addEvents();
	addStylesToNodes();
	window.setScene(scene);
	window.setTitle("StarBuzz Cofe");
	
	window.setWidth(600);
	window.setHeight(450);
	
	window.show();
	
	
}





public static void main(String[] args)   {
	Application.launch(args);

}
}
