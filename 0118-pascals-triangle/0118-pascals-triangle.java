class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) return triangle;

        for(int r=1; r<=numRows;r++){
            List<Integer> row = new ArrayList<>();

            long element =1;
            row.add((int) element);

            for(int c=1;c<r;c++){
                
                element = element * (r-c);
                element = element/c;

                row.add((int) element);
            }
            triangle.add(row);
        }
        return triangle;
    }
}