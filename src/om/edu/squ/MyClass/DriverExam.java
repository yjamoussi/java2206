/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package om.edu.squ.MyClass;

/**
 *
 * @author Solution
 */

public  class DriverExam {
    private  char[] answ= new char[20];
    
    private  char[] correctanswere={'C','D','A','A','C','A','B','A','C','D',
        'B','C','D','A','D','C','C','A','D','D'}; 
    
    int true_Answ_Count;
    
    // Q1-a 
    public DriverExam(char[] ua) {
        true_Answ_Count = 0;
        for(int i=0;i<ua.length;i++)
        {
            answ[i]=ua[i];
        }
        
    }
    
    // Q1-b
    public  boolean passed()
    {
        
        for(int i=0;i<answ.length ;i++)
        {
            if(answ[i]==correctanswere[i]){
                true_Answ_Count++;
            }
        }
        if(true_Answ_Count>=15)
        {
            return true;
        }else
            return false;
    }
    
    // Q1-c
    public int totalCorrect()
    {
        return true_Answ_Count;
    }
    
    
    
    
    
    
    
    
    //Q1-d
    public int [] questionMissed()
    {
        int Q_Missed = 20 - true_Answ_Count;
        
        int [] missed=new int [Q_Missed];
        int index=0;
         for(int i=0; i< answ.length ;i++)
        {
            if(answ[i]!=correctanswere[i])
            {
                missed[index]=i+1;
                
                index++;
            }
        }
         return missed;
    }
}