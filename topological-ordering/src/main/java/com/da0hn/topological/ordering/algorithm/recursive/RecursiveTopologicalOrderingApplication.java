package com.da0hn.topological.ordering.algorithm.recursive;

import com.da0hn.topological.ordering.Vertex;

import java.util.List;

public final class RecursiveTopologicalOrderingApplication {

  public static void main(final String[] args) {
    final var vertex0 = new Vertex("0");
    final var vertex1 = new Vertex("1");
    final var vertex2 = new Vertex("2");
    final var vertex3 = new Vertex("3");
    final var vertex4 = new Vertex("4");
    final var vertex5 = new Vertex("5");

    vertex2.addNeighbour(vertex3);
    vertex3.addNeighbour(vertex1);
    vertex4.addNeighbour(vertex0).addNeighbour(vertex1);
    vertex5.addNeighbour(vertex0).addNeighbour(vertex2);
    final var graph = List.of(vertex0, vertex1, vertex2, vertex3, vertex4, vertex5);

    final var topologicalOrderingAlgorithm = new RecursiveTopologicalOrdering();
    for (final var v : graph) {
      if (v.isNotVisited()) {
        topologicalOrderingAlgorithm.dfs(v);
      }
    }
    final var topologicalOrdering = topologicalOrderingAlgorithm.getTopologicalOrdering();
    while (!topologicalOrdering.isEmpty()) {
      System.out.println(topologicalOrdering.pop().getValue());
    }


  }

}
