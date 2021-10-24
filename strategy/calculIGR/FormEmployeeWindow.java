package strategy.calculIGR;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import strategy.cours.Istrategy;

public class FormEmployeeWindow extends Application{
    private Employe employe;
	private HBox root=new HBox();
    private Scene scene=new Scene(root);
    VBox details =new VBox();
	VBox form =new VBox();
    //deatls
	Label titreIgrllabel=new  Label("details IGR  ");
	HBox igrbox=new HBox();
	Label calculIgrlabel=new  Label(" votre IGR:  ");
	Label valeurIgr=new  Label("0.0");
	//form
	Label titreForm=new  Label("Votre Info  ");
	HBox EmpCINBox=new HBox();
	Label EmpCINLabel=new  Label("CIN : ");
	TextField EmpCINTextField=new TextField();
	
	HBox salaireBrutMensuelBox=new HBox();
	Label salaireBrutMensuelLabel=new  Label("salaireBrutMensuel:");
	TextField salaireBrutMensuelTextField=new TextField();
	
	HBox PaysBox=new HBox();
	Label paysLabel=new  Label("pays");
	 ComboBox<String> combobox=new ComboBox<String>();
	 
	 HBox buttonBox=new HBox();
	 Button effacer=new  Button("effacer");
	 Button calculer=new  Button("calculer");
	private void createNodes() {
		combobox.getItems().addAll("Maroc","Algerie","Tunisie");
	   combobox.setValue("Maroc");
		 EmpCINBox.getChildren().addAll(EmpCINLabel,EmpCINTextField);
		
		 salaireBrutMensuelBox.getChildren().addAll(salaireBrutMensuelLabel,salaireBrutMensuelTextField);
	
		 PaysBox.getChildren().addAll(paysLabel,combobox);
		 buttonBox.getChildren().addAll(effacer,calculer);
		 igrbox.getChildren().addAll(calculIgrlabel,valeurIgr);
form.getChildren().addAll(titreForm,EmpCINBox,salaireBrutMensuelBox,PaysBox,buttonBox);
		details.getChildren().addAll(titreIgrllabel,igrbox);
		root.getChildren().addAll(form,details);
	}
	private void addStylesToNodes() {
		EmpCINBox.setSpacing(75);
		PaysBox.setSpacing(80);
		buttonBox.setPadding(new Insets(10) );
		buttonBox.setSpacing(5);
	}
	private void addEvents() {
		effacer.setOnAction(e->{
			EmpCINTextField.setText("");
			salaireBrutMensuelTextField.setText("");
			valeurIgr.setText("");
		});
		calculer.setOnAction(e->{
			String cin=EmpCINTextField.getText();
			float salairebrut=Float.parseFloat(salaireBrutMensuelTextField.getText());
			
			employe=new Employe(cin, salairebrut);
			String payscom=combobox.getValue();
			Ipays pays=null;
			try {
				 pays=(Ipays)Class.forName("strategy.calculIGR."+payscom).newInstance();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			employe.setPays(pays);
			valeurIgr.setText(employe.calculerIGR()+"");
	});
	}
	@Override
	public void start(Stage window) throws Exception {
		createNodes();
		addEvents();
		addStylesToNodes();
		window.setScene(scene);
		window.setTitle("Calcul GR");
		
		window.setWidth(600);
		window.setHeight(370);
		window.show();
		
		
	}
	public static void main(String[] args)   {
		Application.launch(args);

	}
 
}
