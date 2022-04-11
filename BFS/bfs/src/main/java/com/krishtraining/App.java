package com.krishtraining;

import java.util.*;

/**
 * Below code is written by the help of
 * https://www.programiz.com/dsa/graph-bfs
 * Breadth first search tutorial
 */

public class App
{
  private int V;
  private LinkedList<Integer> adj[];

  // Create a graph
  App(int v)
  {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
    {
      adj[i] = new LinkedList();
    }
  }

  // Add edges to the graph
  void addEdge(int v, int w)
  {
    adj[v].add(w);
  }

  // BFS algorithm
  void BFS(int s)
  {
    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String[] args)
  {
    App g = new App(7);

    g.addEdge(0, 1);
    g.addEdge(0, 2);                  
    g.addEdge(1, 3);
    g.addEdge(2, 4);
    g.addEdge(2, 6);
    g.addEdge(4, 5);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    g.BFS(0);
  }
}
