module DnDMonster {
	requires javafx.controls;
	requires javafx.fxml;
	requires json.simple;
	requires java.json;
	
	opens application to javafx.graphics, javafx.fxml;
}
