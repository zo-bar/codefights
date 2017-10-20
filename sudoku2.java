boolean sudoku2(char[][] grid) {
    for (int i=0; i<9; i++){
        List<Character> line = new ArrayList<Character>();
        List<Character> column = new ArrayList<Character>();
        List<Character> square = new ArrayList<Character>();

        for (int j=0; j<9; j++){
            line.add(grid[i][j]);
            column.add(grid[j][i]);
            square.add(grid[j/3 + 3*(i/3)][j%3 + 3*(i%3)]);
        }
        //System.out.println(square);
        if (!allDiff(line) || !allDiff(column) || !allDiff(square))
            return false;
    }
    return true;
}

boolean allDiff(List<Character> line){

    Set<Character> s = new HashSet<Character>();
    for (Character c: line){
        if (c == '.') continue;
        if (s.contains(c))
            return false;
        s.add(c);
    }
    return true;
}