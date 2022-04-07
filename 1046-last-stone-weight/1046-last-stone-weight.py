class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
         while(len(stones)>1):
            stones.sort(reverse=True)
            st1 = stones[0]
            st2 = stones[1]
            stones.remove(st1)
            stones.remove(st2)
            stones.append(st1-st2)
    
         if(len(stones)==1):
            return stones[0]
         else:
            return 0