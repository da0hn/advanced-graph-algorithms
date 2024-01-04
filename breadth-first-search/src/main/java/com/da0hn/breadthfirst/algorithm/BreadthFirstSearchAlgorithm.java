package com.da0hn.breadthfirst.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchAlgorithm {

  public void transverse(Vertex root) {
    Queue<Vertex> queue = new LinkedList<>();
    root.markAsVisited();
    queue.add(root);
    while (!queue.isEmpty()) {
      var actualVertex = queue.remove();
      System.out.println(STR."Actual visited vertex: \{actualVertex.value()}");
      for (var neighbour : actualVertex.adjacencyList()) {
        if (neighbour.isVisited()) continue;
        neighbour.markAsVisited();
        queue.add(neighbour);
      }
    }
  }

}
