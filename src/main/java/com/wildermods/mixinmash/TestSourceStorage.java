package com.wildermods.mixinmash;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class TestSourceStorage implements IStorage {

	private final String content;
	
	public TestSourceStorage(String content) {
		this.content = content;
	}
	
	@Override
	public <T> T getAdapter(Class<T> arg0) {
		return null;
	}

	@Override
	public InputStream getContents() throws CoreException {
		return new ByteArrayInputStream(content.getBytes());
	}

	@Override
	public IPath getFullPath() {
		return null;
	}

	@Override
	public String getName() {
		return "TestSource.java";
	}

	@Override
	public boolean isReadOnly() {
		return true;
	}

}
