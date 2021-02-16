import java.util.Scanner;

public class AssignGrades 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter the number of students: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] score = new int[number];
		int bestScore = 0;

		System.out.print("Enter " + number + " scores:");

		for (int i = 0; i < score.length; i++) 
		{
			score[i] = input.nextInt();
			if (bestScore < score[i]) 
			{
				bestScore = score[i];
			}
		}

		// If-else statement for the grades

		char grade;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= bestScore - 10)
				grade = 'A';
			else if (score[i] >= bestScore - 20)
				grade = 'B';
			else if (score[i] >= bestScore - 30)
				grade = 'C';
			else if (score[i] >= bestScore - 40)
				grade = 'D';
			else
				grade = 'F';

			System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);
		}

	}

}