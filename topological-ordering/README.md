# Topological Ordering

* The depth-first search based algorithm was first constructed by Robert Tarjan back in 1976.
* Topological Ordering (Topological Search) of a `G(V, E)` directed graph is a linear ordering of its vertices such that for every directed (U, V)
  edge `U` comes before `V` in the ordering.
* The `V` vertices of the `G(V, E)` graph may represent tasks to be performed and the edges are the constraints (One task may be performed before another).
* Topological Ordering can be used only the `G(V, E)` graph does not have any cycles.
* Topological Ordering is a directed acyclic graph (DAG) algorithm.
* Any DAG has at least one topological ordering.
* Topological Ordering has `O(N + E)` running time complexity.
* Its crucial in project management and in finding `Hamiltonian Paths` and cycles.
* Hamiltonian path in a `G(V, E)` graphs visits every vertex exactly once.
* If a Hamiltonian path exists then the topological sort is unique.
* 
