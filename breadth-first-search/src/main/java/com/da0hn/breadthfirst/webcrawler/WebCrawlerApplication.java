package com.da0hn.breadthfirst.webcrawler;

public class WebCrawlerApplication {

  public static void main(String[] args) {
    var bfs = new BreadthFirstSearchAlgorithm();
    bfs.discoverWeb("https://www.bbc.com");
  }

}
