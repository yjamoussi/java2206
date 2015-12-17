/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package om.edu.squ.MyClass;

/**
 *
 * @author Solution
 */

public class DriverExam {

    private char[] userAnswers;
    // user's answers

    private char[] correctAnswers = {
        'C', 'D', 'A', 'A', 'C', 
        'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D', 
        'C', 'C', 'A', 'D', 'D'
    };

    
    // Q1-a 
    public DriverExam(char[] ua) {

        userAnswers = new char[ua.length];

        for (int i = 0; i < ua.length; i++) {
            userAnswers[i] = ua[i];
        }

    }

    
    // Q1-b
    public boolean passed() {
        if (totalCorrect() >= 15) {
            return true;
        } else {
            return false;
        }
    }

    
    // Q1-c
    public int totalCorrect() {
        int true_Answ_Count = 0;
        for (int i = 0; 
                ((i < userAnswers.length) && (i < userAnswers.length)); 
                i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                true_Answ_Count++;
            }
        }
        return true_Answ_Count;
    }

    //Q1-d
    public int[] questionMissed() {
        int numberQuestionsMissed = 20 - totalCorrect();

        int[] missed = new int[numberQuestionsMissed];

        int index = 0;
        for (int i = 0; i < userAnswers.length; i++) {
            if (userAnswers[i] != correctAnswers[i]) {
                missed[index] = i + 1;

                index++;
            }
        }

        return missed;
    }
}
