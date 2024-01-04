package com.da0hn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Vertex {

  private final String value;

  private final List<Vertex> adjacencyList = new ArrayList<>(0);

  private boolean visited;

  public Vertex(String value) {
    this.value = value;
    this.visited = false;
  }

  public String value() { return value; }

  public Vertex addEdge(Vertex vertex) {
    adjacencyList.add(vertex);
    return this;
  }

  public void markAsVisited() {
    this.visited = true;
  }

  public boolean isVisited() { return visited; }

  public boolean isNotVisited() {
    return !this.visited;
  }

  public List<Vertex> adjacencyList() { return adjacencyList; }

  @Override
  public int hashCode() {
    return Objects.hash(value, visited, adjacencyList);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Vertex) obj;
    return Objects.equals(this.value, that.value) &&
           this.visited == that.visited &&
           Objects.equals(this.adjacencyList, that.adjacencyList);
  }

  @Override
  public String toString() {
    return STR."Vertex[value=\{value}, visited=\{visited}, adjacencyList=\{adjacencyList}\{']'}";
  }

}
