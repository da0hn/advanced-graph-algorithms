package com.da0hn.depthfirst.maze;

public class MazeApplication {

  /**
   * 0 - Wall
   * <p>
   * 1 - Valid cell
   * <p>
   * 2 - Start maze
   * <p>
   * 3 - End maze
   */
  public static void main(final String[] args) {

    final int[][] map = {
      { 2, 1, 1, 0, 1, 1, 1, 1, 1, 0 },
      { 1, 0, 1, 0, 1, 0, 0, 0, 1, 0 },
      { 1, 0, 1, 1, 1, 1, 1, 0, 1, 1 },
      { 1, 1, 1, 0, 0, 0, 1, 0, 0, 1 },
      { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
      { 1, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
      { 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 },
      { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
      { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
      { 1, 0, 0, 0, 0, 0, 0, 0, 3, 1 }
    };

    final var mazeSolver = new MazeSolver(map, 1, 0);
    mazeSolver.solve();
  }

}
