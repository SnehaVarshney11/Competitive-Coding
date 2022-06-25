package Leetcode.JuneDailyQues;

import java.util.Arrays;
import java.util.PriorityQueue;

class CourseScheduleIII {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        int index = 0;
        while (index < courses.length && courses[index][0] > courses[index][1])
            index++;
        
        if (index == courses.length)
            return 0;
        
        int time = courses[index][0];
        pq.add(time);
        int count = 1;
        
        for (int i = index + 1; i < courses.length; ++i) {
            var course = courses[i];
            
            if (time > course[1])
                continue;
            
            if (course[0] + time > course[1]) {
                if (pq.peek() < course[0])
                    continue;
                int delta = pq.remove() - course[0];
                pq.add(course[0]);
                time -= delta;
            } else {
                time += course[0];
                pq.add(course[0]);
                count++;
            }
        }
        
        return count;
    }
}
