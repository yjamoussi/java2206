/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package om.edu.squ.MyClientClass;

import om.edu.squ.MyClass.DriverExam;
/**
 *
 * @author Solution
 */
public class DriverExamClient {
    
    public static void main(String [] args)
    {
        char[] user_answers = {'A', 'D', 'A', 'B', 'C', 'A', 'A', 'A', 'C', 'D',
            'B', 'C', 'D', 'D', 'D', 'C', 'C', 'A', 'A', 'D'};
        
        //
        DriverExam candidateDriverExam = new DriverExam(user_answers);
        
        // Q2-c 1)
        if (candidateDriverExam.passed()) {
            System.out.println("Result : passed");
        } else {
            System.out.println("Result : Failed");
        }
        
        // Q2-c 2)
        System.out.println("Number of correctly answered questions:" +
                candidateDriverExam.totalCorrect());
        
        // Q2-c 3)
        int[] missedQuestion = candidateDriverExam.questionMissed();
        System.out.print("The question(s) that candidate missed :");
        for (int i = 0; i < missedQuestion.length; i++) {
            System.out.print(missedQuestion[i] + " ");
        }
        
        System.out.println("");
    }
}
