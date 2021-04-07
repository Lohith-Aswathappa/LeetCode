class Solution {
    public int[][] merge(int[][] intervals) {
        //edge case
        
        //logic
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        Stack<int[]> st = new Stack<>();
        st.push(intervals[0]);
        
        for(int i = 1; i < intervals.length; i++){
            int[] temp = st.pop();
            if(intervals[i][0] <= temp[1]){
                if(temp[1] > intervals[i][1])
                    intervals[i][1] = temp[1];
                intervals[i][0] = temp[0];
            }else{
                st.push(temp);
            }
            st.push(intervals[i]);
        }
        
        int[][] result = new int[st.size()][2];
        int i = st.size()-1;
        
        while(!st.isEmpty()){
            result[i--] = st.pop(); 
        }
        return result;
    }
}