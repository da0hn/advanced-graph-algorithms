package com.da0hn.depthfirst.maze;

import java.util.stream.IntStream;

public class MazeSolver {

  private static final char VOID_PATH = '_';

  private static final char SOLUTION_PATH = 'X';

  private final int[][] maze;

  private final boolean[][] visited;

  private final Character[][] solution;

  private final int startRow;

  private final int startCol;

  private int moves;

  public MazeSolver(final int[][] maze, final int startRow, final int startCol) {
    this.maze = maze.clone();
    this.visited = new boolean[maze.length][maze.length];
    this.startRow = startRow;
    this.startCol = startCol;
    this.solution = IntStream.range(0, maze.length)
      .mapToObj(i -> IntStream.range(0, maze.length)
        .mapToObj(j -> VOID_PATH)
        .toArray(Character[]::new))
      .toArray(Character[][]::new);
  }

  public void solve() {
    if (this.dfs(this.startRow, this.startCol)) {
      System.out.println("Solution found...");
      System.out.println("======================================");
      this.printSolution();
      System.out.println(STR."Solved with \{this.moves} moves");
    } else {
      System.out.println("No solution found...");
    }
  }

  private void printSolution() {
    System.out.println("\n".repeat(20));
    IntStream.range(0, this.solution.length)
      .forEach(i -> {
        IntStream.range(0, this.solution.length)
          .forEach(j -> System.out.print(STR."\{this.solution[i][j]} "));
        System.out.println();
      });
  }

  private boolean isValidCell(final int x, final int y) {
    if (x < 0 || x > this.maze.length - 1) {
      return false;
    }
    if (y < 0 || y > this.maze.length - 1) {
      return false;
    }
    if (this.visited[x][y]) {
      return false;
    }
    return this.maze[x][y] != 0;
  }

  private boolean dfs(final int x, final int y) {
    this.printSolution();
    Utils.sleep(250);
    if (this.isValidCell(x, y)) {
      this.moves++;
      if (this.maze[x][y] == 3) {
        this.solution[x][y] = SOLUTION_PATH;
        return true;
      }
      this.visited[x][y] = true;
      this.solution[x][y] = SOLUTION_PATH;
      if (this.dfs(x + 1, y)) return true;
      if (this.dfs(x - 1, y)) return true;
      if (this.dfs(x, y + 1)) return true;
      if (this.dfs(x, y - 1)) return true;
      this.visited[x][y] = false;
      this.solution[x][y] = VOID_PATH;
      return false;
    }
    return false;
  }

}
