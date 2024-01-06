package com.da0hn.topological.ordering;

import java.util.Deque;

public interface TopologicalOrdering {

  void dfs(Vertex vertex);

  Deque<Vertex> getTopologicalOrdering();

}
