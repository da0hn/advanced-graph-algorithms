package com.da0hn.breadthfirst.algorithm;

public class BreadthFirstSearchApplication {

  public static void main(String[] args) {

    var a = new Vertex("A");
    var b = new Vertex("B");
    var c = new Vertex("C");
    var d = new Vertex("D");
    var e = new Vertex("E");
    var f = new Vertex("F");
    var g = new Vertex("G");
    var h = new Vertex("H");
    var i = new Vertex("I");
    var j = new Vertex("J");
    var k = new Vertex("K");

    a.addEdge(b).addEdge(c);
    b.addEdge(c).addEdge(d);
    c.addEdge(b).addEdge(i);
    d.addEdge(f).addEdge(b);
    e.addEdge(i).addEdge(f);
    f.addEdge(d).addEdge(e).addEdge(g);
    g.addEdge(f).addEdge(i).addEdge(h);
    h.addEdge(k).addEdge(g);
    i.addEdge(b).addEdge(c).addEdge(e).addEdge(j).addEdge(g);
    j.addEdge(i).addEdge(k);
    k.addEdge(g).addEdge(h).addEdge(j);

    final var algorithm = new BreadthFirstSearchAlgorithm();
    algorithm.transverse(a);

  }

}
