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
        DriverExam candidateDriverEaxam = new DriverExam(user_answers);
        
        // Q2-c 1)
        if (candidateDriverEaxam.passed()) {
            System.out.println("Result : passed");
        } else {
            System.out.println("Result : Failed");
        }
        
        // Q2-c 2)
        System.out.println("Number of correctly answered questions:" +
                candidateDriverEaxam.totalCorrect());
        
        // Q2-c 3)
        int[] missedQuestion = candidateDriverEaxam.questionMissed();
        System.out.print("The question(s) that candidate missed :");
        for (int i = 0; i < missedQuestion.length; i++) {
            System.out.print(missedQuestion[i] + " ");
        }
        
        System.out.println("");
    }
}
