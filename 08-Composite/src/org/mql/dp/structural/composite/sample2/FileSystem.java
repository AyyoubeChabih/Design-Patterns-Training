package org.mql.dp.structural.composite.sample2;

import java.io.File;

import org.mql.dp.structural.composite.Component;
import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public class FileSystem {

	public FileSystem() {
		Component root = build("./");
		root.operation();
	}

	public Component build(File f) {
		if (f.isFile()) {
			Leaf leaf = new Leaf(f.getName());
			return leaf;
		} else if (f.isDirectory()) {
			Composite cmp = new Composite(f.getName());
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				cmp.add(build(list[i]));
			}
			return cmp;
		}
		return null;		
	}
	
	public Component build(String path) {
		return build(new File(path));
	}
	
	
	
	public static void main(String[] args) {
		new FileSystem();
	}
}
