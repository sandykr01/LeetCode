class Solution {
    
    // yi + yj + |xi - xj| , we need to maximize this equation
    // As we know from the question that xj>xi that means |xi - xj| = -(xi-xj) as xi is smaller
    // therefore we can re-write th equation like yi + yj - (xi - xj) => (yj+xj) + (yi-xi)
    
    class Pair implements Comparable<Pair>{
        int yi_m_xi; // storing yi-xi
        int xi;      // storing xi
        
        Pair(int yi_m_xi, int xi){
            this.yi_m_xi = yi_m_xi;
            this.xi = xi;
        }
        
        @Override
        public int compareTo(Pair o) {
            // if(yi_m_xi>=0 && o.yi_m_xi>=0){
            //     return this.yi_m_xi - o.yi_m_xi;
            // }else{
            //     if(yi_m_xi > yi_m_xi) return 1;
            //     else return -1;  
            // }
            return Integer.compare(o.yi_m_xi, this.yi_m_xi);
        }
    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        
        PriorityQueue<Pair> pq= new PriorityQueue<Pair>(); // MAX pq
        int mx = Integer.MIN_VALUE;
        
        for(int i=0;i<points.length;i++){
            
            while((!pq.isEmpty()) && points[i][0]-pq.peek().xi>k) pq.remove();
            
            if(!pq.isEmpty()){
                mx = Math.max(mx,(points[i][1]+points[i][0]+pq.peek().yi_m_xi)); 
                //mx = Math.max(mx, (yj+xj) + (yi-xi))
            }
            
            pq.add(new Pair((points[i][1]-points[i][0]),points[i][0])); 
            // Pair(yi_m_xi , xi)
        }
        return mx;
    }
}