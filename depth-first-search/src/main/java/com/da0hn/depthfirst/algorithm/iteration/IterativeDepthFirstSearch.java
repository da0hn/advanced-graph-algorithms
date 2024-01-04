package com.da0hn.depthfirst.algorithm.iteration;

import com.da0hn.depthfirst.algorithm.DepthFirstSearch;
import com.da0hn.depthfirst.algorithm.Vertex;

import java.util.List;
import java.util.Stack;

public class IterativeDepthFirstSearch implements DepthFirstSearch {

  private final Stack<Vertex> stack;

  public IterativeDepthFirstSearch() {
    this.stack = new Stack<>();
  }

  @Override
  public void printAll(final List<? extends Vertex> vertexClusters) {
    for (final var rootCluster : vertexClusters) {
      if (rootCluster.isNotVisited()) {
        this.iterateIn(rootCluster);
      }
    }
  }

  public void resetAll(final List<? extends Vertex> vertexClusters) {
    for (final var rootCluster : vertexClusters) {
      if (rootCluster.isVisited()) {
        this.reset(rootCluster);
      }
    }
  }

  private void iterateIn(final Vertex rootCluster) {
    rootCluster.visited();
    this.stack.push(rootCluster);
    while (!this.stack.isEmpty()) {
      final var actualVertex = this.stack.pop();
      System.out.println(actualVertex);

      for (final var vertex : actualVertex.getNeighbours()) {
        if (vertex.isNotVisited()) {
          vertex.visited();
          this.stack.push(vertex);
        }
      }
    }
  }

  private void reset(final Vertex rootCluster) {
    rootCluster.unvisited();
    this.stack.push(rootCluster);
    while (!this.stack.isEmpty()) {
      final var actualVertex = this.stack.pop();
      for (final var vertex : actualVertex.getNeighbours()) {
        if (vertex.isVisited()) {
          vertex.unvisited();
          this.stack.push(vertex);
        }
      }
    }
  }

}
