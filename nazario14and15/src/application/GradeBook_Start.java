// Xavier Nazario

package application;

import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GradeBook_Start extends Application {
	// these text fields have to be defined here so the loadTheGrid method can find
	// them.
	TextField txAssignmentsPossPoints = new TextField();
	TextField txReviewQuizzesPossPoints = new TextField();
	TextField txReviewQuestionsPossPoints = new TextField();
	TextField txProjectPossPoints = new TextField();
	TextField txMidTermPossPoints = new TextField();
	TextField txFinalPossPoints = new TextField();
	
	TextField txAssignmentsEarnedPoints = new TextField();
    TextField txReviewQuizzesEarnedPoints = new TextField();
    TextField txReviewQuestionsEarnedPoints = new TextField();
    TextField txProjectEarnedPoints = new TextField();
    TextField txMidTermEarnedPoints = new TextField();
    TextField txFinalEarnedPoints = new TextField();
    
    TextField txFinalAverage = new TextField();

	@Override // Override the start method in the APossPointslication class
	public void start(Stage primaryStage) {

		Button btDisplayGrade = new Button("_Display Grade");
		btDisplayGrade.setMnemonicParsing(true);
		Button btClearAnswers = new Button("_Clear");
		btClearAnswers.setMnemonicParsing(true);
		Button btnExit = new Button("E_xit");
		btnExit.setMnemonicParsing(true);

		HBox hBox = new HBox(btDisplayGrade, btClearAnswers, btnExit);
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(5, 5, 5, 5));

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(hBox);

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);

		ChoiceBox<String> weekChoiceBox = new ChoiceBox<String>();
		weekChoiceBox.getItems().addAll("Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7", "Week 8");
		weekChoiceBox.getSelectionModel().select(0);
        gridPane.add(weekChoiceBox, 1, 0);
        
        gridPane.add(new Label("Activity"), 0, 1);
        gridPane.add(new Label("Current Points "), 1, 1);
        gridPane.add(new Label("Your Points"), 2, 1);
        
        gridPane.add(new Label("Programming Assignments"), 0, 2);
        gridPane.add(txAssignmentsPossPoints, 1, 2);
        gridPane.add(txAssignmentsEarnedPoints, 2, 2);
        
        gridPane.add(new Label("Review Quizzes"), 0, 3);
        gridPane.add(txReviewQuizzesPossPoints, 1, 3);
        gridPane.add(txReviewQuizzesEarnedPoints, 2, 3);
        
        gridPane.add(new Label("Review Questions"), 0, 4);
        gridPane.add(txReviewQuestionsPossPoints, 1, 4);
        gridPane.add(txReviewQuestionsEarnedPoints, 2, 4);
        
        gridPane.add(new Label("Project"), 0, 5);
        gridPane.add(txProjectPossPoints, 1, 5);
        gridPane.add(txProjectEarnedPoints, 2, 5);
        
        gridPane.add(new Label("Mid Term Exam"), 0, 6);
        gridPane.add(txMidTermPossPoints, 1, 6);
        gridPane.add(txMidTermEarnedPoints, 2, 6);
        
        gridPane.add(new Label("Final Exam"), 0, 7);
        gridPane.add(txFinalPossPoints, 1, 7);
        gridPane.add(txFinalEarnedPoints, 2, 7);
        
        gridPane.add(new Label("Final Percentage"), 1, 8);
        gridPane.add(txFinalAverage, 2, 8);
        
		loadTheGrid(weekChoiceBox.getValue());
		weekChoiceBox.setOnAction(event -> {
			loadTheGrid(weekChoiceBox.getValue());
		});
		
		
		// TODO - create the GUI
		// Method to set background color, alignment and width - use as sample
		txAssignmentsPossPoints.setStyle("-fx-background-color: pink; -fx-alignment: CENTER_LEFT; -fx-max-width: 50;");
		txAssignmentsPossPoints.setEditable(false);
		
		txReviewQuizzesPossPoints.setStyle("-fx-background-color: pink; -fx-alignment: CENTER_LEFT; -fx-max-width: 50;");
		txReviewQuizzesPossPoints.setEditable(false);
		
		txReviewQuestionsPossPoints.setStyle("-fx-background-color: pink; -fx-alignment: CENTER_LEFT; -fx-max-width: 50;");
		txReviewQuestionsPossPoints.setEditable(false);
		
        txProjectPossPoints.setStyle("-fx-background-color: pink; -fx-alignment: CENTER_LEFT; -fx-max-width: 50;");
        txProjectPossPoints.setEditable(false);
        
        txMidTermPossPoints.setStyle("-fx-background-color: pink; -fx-alignment: CENTER_LEFT; -fx-max-width: 50;");
        txMidTermPossPoints.setEditable(false);
        
        txFinalPossPoints.setStyle("-fx-background-color: pink; -fx-alignment: CENTER_LEFT; -fx-max-width: 50;");
		txFinalPossPoints.setEditable(false);
		
		txFinalAverage.setEditable(false);
		
		makeEditable(txAssignmentsEarnedPoints);
        makeEditable(txReviewQuizzesEarnedPoints);
        makeEditable(txReviewQuestionsEarnedPoints);
        makeEditable(txProjectEarnedPoints);
        makeEditable(txMidTermEarnedPoints);
        makeEditable(txFinalEarnedPoints);
		
		borderPane.setCenter(gridPane);

		btDisplayGrade.setOnAction(e -> {
			
			// TODO - get the points entered by the user - make sure there is data in the
			// text field, if it is blank use a zero
			
			try {
				double earnedAssignments = parseOrZero(txAssignmentsEarnedPoints.getText());
				double earnedQuizzes = parseOrZero(txReviewQuizzesEarnedPoints.getText());
				double earnedQuestions = parseOrZero(txReviewQuestionsEarnedPoints.getText());
				double earnedProject = parseOrZero(txProjectEarnedPoints.getText());
				double earnedMidTerm = parseOrZero(txMidTermEarnedPoints.getText());
				double earnedFinal = parseOrZero(txFinalEarnedPoints.getText());
                
			// TODO - total the possible points and the points earned so far

                double possibleAssignments = parseOrZero(txAssignmentsPossPoints.getText());
                double possibleQuizzes = parseOrZero(txReviewQuizzesPossPoints.getText());
                double possibleQuestions = parseOrZero(txReviewQuestionsPossPoints.getText());
                double possibleProject = parseOrZero(txProjectPossPoints.getText());
                double possibleMidTerm = parseOrZero(txMidTermPossPoints.getText());
                double possibleFinal = parseOrZero(txFinalPossPoints.getText());
                
                double totalEarnedPoints = earnedAssignments + earnedQuizzes + earnedQuestions + earnedProject + earnedMidTerm + earnedFinal;
                double totalPossiblePoints = possibleAssignments + possibleQuizzes + possibleQuestions + possibleProject + possibleMidTerm + possibleFinal;
                
               
			// TODO - replace the values to the final version
                if (totalPossiblePoints == 0) {
                    txFinalAverage.setText("No Points Possible");
                } else {
                	
                	double grade = totalEarnedPoints / totalPossiblePoints;
                	DecimalFormat df = new DecimalFormat("##.##%");
                	txFinalAverage.setText(df.format(grade));
                }
              } catch (NumberFormatException ex) {
            	  
			// next line is for testing only
//			System.out.println("final grade " + formattedPercent);
			// uncomment next line when you have the text field ready.
            	  txFinalAverage.setText("Invalid Input");
            }
		});

		btClearAnswers.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				// TODO - clear the text fields
				txAssignmentsEarnedPoints.clear();
            txReviewQuizzesEarnedPoints.clear();
            txReviewQuestionsEarnedPoints.clear();
            txProjectEarnedPoints.clear();
            txMidTermEarnedPoints.clear();
            txFinalEarnedPoints.clear();
            txFinalAverage.clear();
			}
		});

		btnExit.setOnAction(e -> {
			System.exit(0);
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 500, 300);
		primaryStage.setTitle("Grade Calculator Program"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
		


	private void loadTheGrid(String week) {
		// TODO - use the arrays to load the possible points into the text fields.
		// next line for diagnostic
//		System.out.println("The week required is " + week);
		 int[][] weeks = {
        {20, 20, 5, 0, 0, 0},
        {40, 40, 10, 0, 0, 0},
        {60, 60, 15, 0, 0, 0},
        {70, 70, 20, 0, 50, 0},
        {90, 90, 25, 0, 50, 0},
        {110, 110, 30, 0, 50, 0},
        {130, 130, 35, 0, 50, 0},
        {130, 130, 35, 50, 50, 50}
    };

	 int weekIndex = -1;
	 	try {
	 		weekIndex = Integer.parseInt(week.replace("Week ", "")) - 1;
	 	} catch (NumberFormatException e) {
	 		System.err.println("Invalid week format: " + week);
	 	}

	 	if (weekIndex >= 0 && weekIndex < weeks.length) {
	 		txAssignmentsPossPoints.setText(String.valueOf(weeks[weekIndex][0]));
	 		txReviewQuizzesPossPoints.setText(String.valueOf(weeks[weekIndex][1]));
	 		txReviewQuestionsPossPoints.setText(String.valueOf(weeks[weekIndex][2]));
	 		txProjectPossPoints.setText(String.valueOf(weeks[weekIndex][3]));
	 		txMidTermPossPoints.setText(String.valueOf(weeks[weekIndex][4]));
	 		txFinalPossPoints.setText(String.valueOf(weeks[weekIndex][5]));
	 	} else {
	 		System.err.println("Week index out of range: " + weekIndex);
	 		}
		}
	
	private void makeEditable(TextField textField) {
        textField.setEditable(true);
    }
	
	private double parseOrZero(String text) {
		try {
			return Double.parseDouble(text);
		} catch (NumberFormatException e) {
			return 0.0;
		}
	}
	
	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}