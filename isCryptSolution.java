boolean isCryptSolution(String[] crypt, char[][] solution) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i=0; i<solution.length; i++){
        map.put(solution[i][0], Integer.valueOf(solution[i][1])-'0');
    }
    System.out.println(map);
    
    int num1 = getNumber(crypt[0], map);
    int num2 = getNumber(crypt[1], map);
    int num3 = getNumber(crypt[2], map);
    if (num1 < 0 || num2 < 0 || num3 < 0) return false;
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num1+num2);

    return num1+num2 == num3;
}

int getNumber(String s, Map<Character, Integer> map){    
    if (s.length() >1 && map.get(s.charAt(0)) == 0)
        return -1;
    
    int result = 0;
    for (char c:s.toCharArray()){
        result*=10;
        result+=map.get(c);
    }
    return result;
}