package com.da0hn.depthfirst.algorithm;

import com.da0hn.depthfirst.algorithm.iteration.IterativeDepthFirstSearch;
import com.da0hn.depthfirst.algorithm.recursive.RecursiveDepthFirstSearch;

import java.util.List;

public final class DepthFirstSearchApplication {

  public static void main(final String[] args) {
    final var a = new Vertex("A");
    final var b = new Vertex("B");
    final var c = new Vertex("C");
    final var d = new Vertex("D");
    final var e = new Vertex("E");
    final var f = new Vertex("F");
    final var g = new Vertex("G");
    final var h = new Vertex("H");

    a.addNeighbour(b).addNeighbour(g);
    c.addNeighbour(b).addNeighbour(d).addNeighbour(e);
    d.addNeighbour(a).addNeighbour(h);
    e.addNeighbour(d).addNeighbour(h);
    f.addNeighbour(d);
    g.addNeighbour(f);
    h.addNeighbour(f).addNeighbour(e).addNeighbour(g);

    final var iterativeDepthFirstSearch = new IterativeDepthFirstSearch();

    iterativeDepthFirstSearch.printAll(List.of(a, c));
    iterativeDepthFirstSearch.resetAll(List.of(a, c));

    System.out.println("======================================");

    final var recursiveDepthFirstSearch = new RecursiveDepthFirstSearch();
    recursiveDepthFirstSearch.printAll(List.of(a, c));

  }

}

