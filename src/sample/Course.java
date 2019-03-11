package sample;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private String courseCode;
	private ArrayList<Evaluation> evaluations = new ArrayList<Evaluation>();

	// Constructor
	public Course(){
		this.courseName = "defaultCourseName";
	}

	public Course(String courseName){
		this.courseName = courseName;
	}

	public Course(String courseName, String courseCode){
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	// Evaluations get and add
	public ArrayList<Evaluation> getEvaluations(){
		return evaluations;
	}

	public void addEvaluation(Evaluation newEvaluation){
		evaluations.add(evaluations.size(), newEvaluation);
	}

	public void addEvaluations(ArrayList<Evaluation> newEvaluations){
		this.evaluations.addAll(newEvaluations);
	}

	// getters & setters
	public String getCourseCode(){
		return courseCode;
	}

	public void setCourseCode(String courseCode){
		this.courseCode = courseCode;
	}

	// print method
	public void print(){
		System.out.print("Course: ");
		if(courseName != null){
			System.out.print(courseName);
		}
		System.out.println("\nEvaluations:");
		for(int i = 0; i < evaluations.size(); i++){
			evaluations.get(i).print();
		}
	}
}
