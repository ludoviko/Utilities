package com.lam.utilString;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// case insensitive
public class WordCount {
	private Map<String, Integer> map;

	// XXX use generic expression (,. * ...etc)
	// public static final String REGEX_Not_Letters_Numbers = "[^a-zA-Z0-9]";
	public static final String REGEX_Not_Letters_Numbers = "\\s+";

	public WordCount() {
		map = new TreeMap<String, Integer>();
	}

	// Data might be read from a file, line by line.
	// Data might be splitted into words
	public void processLine(String line) {
		for (String word : line.toLowerCase().split(REGEX_Not_Letters_Numbers)) {
			this.processWord(word);
		}
	}

	public void processWord(String word) {
		if (map.containsKey(word)) {
			map.put(word, map.get(word) + 1);
		} else {
			map.put(word, 1);
		}
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void prettyPrint() {
		Set<Entry<String, Integer>> set = map.entrySet();

		for (Entry<String, Integer> entry : set) {
			System.out.println("{ " + entry.getKey() + ": " + entry.getValue() + " }");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordCount wc = new WordCount();
		wc.processLine("you spin me right round baby "
				+ "right round like a record baby " + "right round round round");
		wc.prettyPrint();
		System.out.println(wc.getMap());
	}

}
