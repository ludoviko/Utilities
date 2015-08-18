package com.lam.utilString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//case insensitive
public class LetterCount {
	private Map<Character, Integer> map;
	private String pathToFile;

	// XXX use generic expression (,. * ...etc)
	public static final String REGEX_Not_Letters_Numbers = "[^a-zA-Z]";
	public static final String REGEX_SPACES = "\\s+";

//	public LetterCount() {
//		this.map = new TreeMap<Character, Integer>();
//		this.pathToFile = DataIn;
//	}

	public LetterCount(String pathToFile) {
		this.map = new TreeMap<Character, Integer>();
		this.pathToFile = pathToFile;
	}

	public void processFile() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(this.pathToFile));

		String line = "";
		while ((line = reader.readLine()) != null) {
			this.processWord(line);
		}
		reader.close();
	}

	// Data might be read from a file, line by line.
	public void processLine(String line) {
		line = line.replaceAll(REGEX_Not_Letters_Numbers, " ");
		for (String word : line.split(REGEX_SPACES)) {
			this.processWord(word);
		}
	}

	public void processWord(String word) {
		if (word == null) {
			return;
		}
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {
			if (this.map.containsKey(word.charAt(i))) {
				this.map.put(word.charAt(i), this.map.get(word.charAt(i)) + 1);
			} else {
				this.map.put(word.charAt(i), 1);
			}
		}
	}

	public Map<Character, Integer> getMap() {
		return this.map;
	}

	public void prettyPrint() {
		Set<Entry<Character, Integer>> set = this.map.entrySet();

		for (Entry<Character, Integer> entry : set) {
			System.out.println("{ " + entry.getKey() + ": " + entry.getValue()
					+ " }");
		}
	}
}
