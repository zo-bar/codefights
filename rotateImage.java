char firstNotRepeatingCharacter(String s) {
    int[] counter = new int[26];
    for (char c:s.toCharArray()){
        counter[Character.getNumericValue(c)-
               Character.getNumericValue('a')]++;
    }
    System.out.println(Arrays.toString(counter));
    for (char c:s.toCharArray()){
        if (counter[Character.getNumericValue(c)-
               Character.getNumericValue('a')] == 1)
            return c;
    }
    
    return '_';
}