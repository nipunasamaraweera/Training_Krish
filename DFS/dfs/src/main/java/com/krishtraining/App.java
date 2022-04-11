package com.krishtraining;

import java.util.*;

/**
 * Below code is written by the help of
 * https://www.programiz.com/dsa/graph-dfs
 * Depth first search tutorial
 */

public class App {
  private LinkedList<Integer> adjLists[];
  private boolean visited[];

  // Graph creation
  App(int vertices)
  {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
    {
      adjLists[i] = new LinkedList<Integer>();
    }
  }

  // Add edges
  void addEdge(int src, int dest)
  {
    adjLists[src].add(dest);
  }

  // DFS algorithm
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }

  public static void main(String[] args) {
    App g = new App(8);

    g.addEdge(0, 3);
    g.addEdge(3, 5);
    g.addEdge(5, 6);
    g.addEdge(6, 2);
    g.addEdge(2, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 6);
    g.addEdge(6, 5);
    g.addEdge(5, 3);
    g.addEdge(3, 7);
    g.addEdge(7, 4);
    g.addEdge(4, 7);
    g.addEdge(7, 3);

    System.out.println("Following is Depth First Traversal");

    g.DFS(0);
  }
}