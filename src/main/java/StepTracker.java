import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int myActiveDays, mySteps, myMinSteps,myTotalDays;
 public StepTracker(int mSteps){
  myMinSteps = mSteps;
  myActiveDays = 0;
  myTotalDays = 0;
  mySteps = 0;
 }
 public void addDailySteps(int s){
  mySteps += s;
  myTotalDays++;
  if(s>myMinSteps) myActiveDays++;
 }
 public double averageSteps(){
  return (double)mySteps/(double)myTotalDays;
 }
 public int activeDays(){
  return myActiveDays;
 }
} 
