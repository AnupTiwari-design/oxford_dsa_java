package greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Activity{
    int start, end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

}
class ActivitySelection{

    public static void   selectActivities(List<Activity> activities){
        //step 1

         activities.sort(Comparator.comparingInt(a -> a.end));

         //step 2 select the first activity
         System.out.println("Selected activities:");
         Activity last = activities.get(0);

         System.out.println("(" + last.start + ", " + last.end + ")");

         // Step 3: Iterate through the rest
         for (int i = 1; i < activities.size(); i++) {
             if (activities.get(i).start >= last.end) {
                 last = activities.get(i);
                 System.out.println("(" + last.start + ", " + last.end + ")");
             }

    }

}
  public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 3));
        activities.add(new Activity(2, 4));
        activities.add(new Activity(3, 5));
        activities.add(new Activity(0, 6));
        activities.add(new Activity(5, 7));
        activities.add(new Activity(8, 9));
        activities.add(new Activity(5, 9));

        selectActivities(activities);
    }
}
}