class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int cmin = 0;
        int rmin = 0;
        int cmax = matrix[0].length-1;
        int rmax = matrix.length-1;
         
        ArrayList<Integer> al = new ArrayList<>();
         int counter = 0 ;
         int total = matrix[0].length* matrix.length;

        while(counter < total){
              
              // top
              for(int col = cmin;col<=cmax && counter < total;col++){
                al.add((matrix[rmin][col]));
                counter++;
              }
                rmin++;
              
              // right
              for(int row = rmin;row<=rmax && counter < total;row++){

                al.add((matrix[row][cmax]));
                counter++;
              }
              cmax--;
            
            // bottom
            for(int col = cmax;col>=cmin && counter < total;col--){

                al.add((matrix[rmax][col]));
                counter++;
              }
              rmax--;
              for(int row = rmax;row>=rmin && counter < total;row--){

                al.add((matrix[row][cmin]));
                counter++;
              }
              cmin++;

        }
     
return al;

    }
}