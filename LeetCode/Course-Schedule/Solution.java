class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        for (int[] prereq : prerequisites)
            graph.get(prereq[1]).add(prereq[0]);

        int[] visit = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(graph, visit, i))
                return false; 
        }

        return true; 
    }

    private boolean hasCycle(List<List<Integer>> graph, int[] visit, int course) {
        if (visit[course] == 1)
            return true;  
        if (visit[course] == 2)
            return false; 

        visit[course] = 1; 
        for (int neighbor : graph.get(course)) {
            if (hasCycle(graph, visit, neighbor))
                return true;
        }

        visit[course] = 2;
        return false;
    }
}