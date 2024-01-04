package com.da0hn.depthfirst.algorithm.recursive;

import com.da0hn.depthfirst.algorithm.DepthFirstSearch;
import com.da0hn.depthfirst.algorithm.Vertex;

import java.util.List;

public class RecursiveDepthFirstSearch implements DepthFirstSearch {

  @Override
  public void printAll(final List<? extends Vertex> vertexClusters) {
    for (final var cluster : vertexClusters) {
      if (cluster.isNotVisited()) {
        this.visit(cluster);
      }
    }
  }

  private void visit(final Vertex vertex) {
    vertex.visited();
    System.out.println(vertex);
    for (final var neighbour : vertex.getNeighbours()) {
      if (neighbour.isNotVisited()) {
        this.visit(neighbour);
      }
    }
  }

}
