package com.da0hn;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AdjacencyMatrixOrAdjacencyListApplication {

  private final static int[][] adjacencyMatrix = {
    //A, B, C, D
    { 0, 2, 4, 0 }, // A
    { 0, 0, 0, 3 }, // B
    { 0, 0, 0, 0 }, // C
    { 0, 0, 0, 0 }  // D
  };

  public static void main(String[] args) {

    // Adjacency Matrix

    // find all edges O(n^2) complexity
    for (var i = 0; i < adjacencyMatrix.length; i++) {
      for (var j = 0; j < adjacencyMatrix.length; j++) {
        if (adjacencyMatrix[i][j] != 0) {
          System.out.println(STR."Vertex \{i} is connected to \{j} with weight \{adjacencyMatrix[i][j]}.");
        }
      }
    }

    // if you know the vertices then the lookup is O(1) complexity (fast)
    // is there a connection between node A(0) and node C(2)
    System.out.println(STR."Access directly node value located at matrix[0][2]=\{adjacencyMatrix[0][2]}");

    // Adjacency List

    var a = new Vertex("A");
    var b = new Vertex("B");
    var c = new Vertex("C");
    var d = new Vertex("D");

    a.addNeighbour(b);
    a.addNeighbour(c);
    b.addNeighbour(d);

    // print all neighbours
    a.showNeighbours();
    b.showNeighbours();
    c.showNeighbours();
    d.showNeighbours();
  }

  record Vertex(String value, List<Vertex> neighbours) {

    public Vertex(String value) {
      this(value, new ArrayList<>());
    }

    public void addNeighbour(Vertex neighbour) {
      this.neighbours.add(neighbour);
    }

    public void showNeighbours() {
      var neighboursRepresentationString = new StringJoiner(", ", STR."\{value}: [ ", " ]");
      for (var neighbour : neighbours) {
        neighboursRepresentationString.add(neighbour.value);
      }
      System.out.println(neighboursRepresentationString);
    }

  }

}
