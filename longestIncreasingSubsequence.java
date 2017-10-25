int longestIncreasingSubsequence(int[] sequence) {
    // an array will store longuest increasing subsequense ending at i; 
    int[] lis = new int[sequence.length];
    // all subsequences are at least 1 - the number itself
    Arrays.fill(lis, 1);
    
    int result = 0;
    for (int i=1; i<sequence.length; i++){
        for (int j=0; j<i; j++){
            // if current value can extend subsequence, 
            // remember the longuest length
            if (sequence[j] < sequence[i] && (lis[j]+1) > lis[i])
                lis[i] = lis[j] +1;
        }
        // Remember array max, as longuest ss can end at any point
        result = Math.max(result, lis[i]);
    }
    //System.out.println(Arrays.toString(lis));
    return result;
}