package com.wildermods.mixinmash.api;

@FunctionalInterface
public interface MashDecompiler {
	public String decompile(byte[] bytecode) throws DecompilationException;
}
