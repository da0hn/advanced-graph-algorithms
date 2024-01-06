package com.da0hn.topological.ordering.algorithm.recursive;

import com.da0hn.topological.ordering.TopologicalOrdering;
import com.da0hn.topological.ordering.Vertex;

import java.util.Deque;
import java.util.LinkedList;

public class RecursiveTopologicalOrdering implements TopologicalOrdering {

  private final Deque<Vertex> stack = new LinkedList<>();

  @Override
  public void dfs(final Vertex vertex) {
    vertex.visited();

    for (final Vertex v : vertex.getNeighbours()) {
      if (v.isNotVisited()) {
        this.dfs(v);
      }
    }
    this.stack.push(vertex);
  }

  @Override
  public Deque<Vertex> getTopologicalOrdering() {
    return new LinkedList<>(this.stack);
  }

}
