# Depth-First Search

There is a `G(V, E)` graph and the aim is to visit every V vertex exactly once.

* Depth-First search explores as far as possible along each branch before backtracking (and visiting other vertexes)
* It was investigated as a strategy for solving mazes by `Trémaux` back in 19th century
* Running time complexity is `O(V+E)`
* Memory complexity is way better than that of `breadth-first search`
* Can implement `depth-first search` with the help of a `Stack` data structure to store the vertexes
