package com.da0hn.topological.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vertex {

  private final String value;

  private final List<Vertex> neighbours;

  private boolean visited;

  public Vertex(final String value) {
    this.value = value;
    this.visited = false;
    this.neighbours = new ArrayList<>(0);
  }

  public Vertex addNeighbour(final Vertex vertex) {
    this.neighbours.add(vertex);
    return this;
  }

  public String getValue() {
    return this.value;
  }

  public List<Vertex> getNeighbours() {
    return Collections.unmodifiableList(this.neighbours);
  }

  public boolean isNotVisited() {
    return !this.visited;
  }

  public boolean isVisited() {
    return this.visited;
  }

  public void visited() {
    this.visited = true;
  }

  public void unvisited() {
    this.visited = false;
  }

  @Override
  public int hashCode() {
    return this.value.hashCode();
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof final Vertex vertex)) return false;

    return this.value.equals(vertex.value);
  }

  @Override
  public String toString() {
    return STR."Vertex{value='\{this.value}', visited=\{this.visited}}";
  }

}
