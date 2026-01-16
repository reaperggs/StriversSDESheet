class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        output.add(list);

        for(int i = 1; i < numRows; i++){
            List<Integer> prev = output.get(i-1);
            // curr: 1 2 1; prev : 1 1

            List<Integer> curr = new ArrayList<>();
            // first = 1, last = 1 , beech mein formula kaam krta h

            curr.add(1);
            //
            //
            //
            for(int j = 0; j < prev.size() - 1; j++){
                curr.add(prev.get(j) + prev.get(j+1));
            }
            curr.add(1);
            // current bna diya, ab output mein add krdo

            output.add(curr);
        }

        return output;
    }
}
public class Pascals{
    public static void main(String[] args){
        //
    }
}