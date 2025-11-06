# COP2251 – Java Assignments 14 & 15 (JavaFX GradeBook)

## Summary
This JavaFX GradeBook application demonstrates building a desktop UI to enter and analyze course grades. It uses a grid-based layout with labeled inputs for possible points and earned points across multiple activities, computes per-section averages, and displays a final course percentage. The project emphasizes GUI construction, input parsing, formatted output, and modular JavaFX setup.

## Program Behavior
- Launches a JavaFX window with a grid containing rows for course activities (for example: Assignments, Review Quizzes, Coding Quizzes, Project, Mid Term Exam, Final Exam).
- Each row provides “Current Points” (possible points) and “Your Points” (earned points) text fields.
- A “Final Percentage” field displays the computed overall grade using aggregated section values.
- A `ChoiceBox` (week selector) allows loading preset values for specific weeks; changing the selection refreshes the grid via `loadTheGrid(...)`.
- Input fields are made editable or read-only as appropriate, and text input is parsed defensively (invalid or blank values are treated as zero via `parseOrZero`).
- Values are formatted using `DecimalFormat` for clean percentage display.

## Key Concepts Demonstrated
- JavaFX UI: Stage/Scene setup, `GridPane` layout, alignment, padding, and spacing.
- Controls and Events: `Label`, `TextField`, `ChoiceBox`, `Button`, and `EventHandler<ActionEvent>` for interactive behavior.
- Data Handling: Input parsing with `Double.parseDouble`, defensive fallbacks, and average/final percentage calculations.
- Formatting: Displaying computed values with `DecimalFormat`.
- Modularity: `module-info.java` declaring JavaFX modules and `opens application` for JavaFX access.

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- JavaFX SDK (matching your JDK)
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code) with JavaFX module path configured

Commands (from the `nazario14and15/src` directory):

Compile:
javac --module-path "<path_to_javafx_lib>" --add-modules javafx.controls -d ../out module-info.java application/GradeBook_Start.java application/Main.java

Run (GradeBook application):
java --module-path "<path_to_javafx_lib>" --add-modules javafx.controls -cp ../out application.GradeBook_Start

Run (template Main, optional):
java --module-path "<path_to_javafx_lib>" --add-modules javafx.controls -cp ../out application.Main

(Replace `<path_to_javafx_lib>` with the absolute path to your JavaFX SDK `lib` directory, e.g., on Windows `C:\javafx-sdk-22\lib`, or on macOS/Linux `/opt/javafx-sdk-22/lib`.)
