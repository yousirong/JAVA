package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;


public class FxmlApp extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = (HBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("FXMLMain");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

/*     Sample.fxml
<?xml version="1.0" encoding="UTF-8"?>
	
<?import javafx.scene.layout.HBox?>
<?import javafx.geometry.Insets?>
<?import javafx.scene.control.*?>
	
<HBox xmlns:fx="http://javafx.com/fxml/1" fx:controller="application.SampleController">
	<padding>				<!-- 안쪽 여백 설정 -->
		<Insets top="10" right="10" bottom="10" left="10"/>
	</padding>
	<spacing>10</spacing>			<!-- 컨트롤간의 수평 간격 설정 -->
	
	<children>				<!-- 자식 컨트롤 추가 -->
		<TextField>			<!-- TextField 선언 -->
			<prefWidth>200</prefWidth>	<!-- TextField의 폭 설정 -->
		</TextField>
		
		<Button >			<!-- Button 컨트롤 선언 -->
			<text>확인</text>	<!-- Button 글자 설정 -->
		</Button>
	</children>
</HBox> */