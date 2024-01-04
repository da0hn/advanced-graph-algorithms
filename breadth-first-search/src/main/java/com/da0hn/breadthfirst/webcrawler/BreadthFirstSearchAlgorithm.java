package com.da0hn.breadthfirst.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;

public class BreadthFirstSearchAlgorithm {

  private final Queue<String> urls;

  private final List<String> discoveredWebsites;

  public BreadthFirstSearchAlgorithm() {
    this.urls = new LinkedList<>();
    this.discoveredWebsites = new ArrayList<>();
  }

  public void discoverWeb(String root) {
    this.urls.add(root);
    this.discoveredWebsites.add(root);

    while (!this.urls.isEmpty()) {
      var link = this.urls.remove();

      String rawHtml = readUrl(link);

      var regex = "https://(\\w+\\.)*(\\w+)";
      var matcher = Pattern.compile(regex).matcher(rawHtml);
      while (matcher.find()) {
        String actuallyDiscoveredWebsite = matcher.group();
        if (!discoveredWebsites.contains(actuallyDiscoveredWebsite)) {
          discoveredWebsites.add(actuallyDiscoveredWebsite);
          System.out.println(STR."Website has been found with URL: \{actuallyDiscoveredWebsite}");
          urls.add(actuallyDiscoveredWebsite);
        }
      }
    }

  }

  private String readUrl(String link) {
    final var rawHtml = new StringBuilder();

    try (var reader = new BufferedReader(new InputStreamReader(URI.create(link).toURL().openStream()))) {

      String line;
      while ((line = reader.readLine()) != null) {
        rawHtml.append(line);
      }
    }
    catch (Exception e) {
      System.err.println("Problem while crawling the website...");
    }

    return rawHtml.toString();
  }

}
