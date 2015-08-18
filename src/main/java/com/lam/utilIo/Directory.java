package com.lam.utilIo;

import java.io.File;
import java.util.Iterator;

/**
 * 
 * @author Ludoviko Azuaje 
 * 
 * Problem from: http://www.zsoltfabok.com/
 * 
 * Implement an application which follows the iterator design
 *         pattern. This particular application receives a directory as
 *         argument, and at each consecutive call, it returns a file name from
 *         the directory that hasn’t been returned before, in a random order.
 *         When the application reaches the end of the content of the directory,
 *         it shall start over, again returning the directory contents in a
 *         random order. If the directory is empty, then every call shall return
 *         an empty string. **If the argument is not a directory but a file,
 *         then its name shall be returned on each consecutive call.
 * 
 */

public class Directory implements Iterator<File> {
	private File file;
    private String[] files;
	
	public Directory(File file) {
		this.file = file;
	}

	public boolean hasNext() {
		return false;
	}

	public File next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException(
				"Directory class does not support remove operations.");
	}

}
